/*
 *
 * 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 *
 * I dont give a fuck about copyright - this code is free to use for everybody - EXCEPTION:
 *     - entities that support:
 *         > queer hostility
 *         > any kind of religion
 *         > authoritarianism
 *         > sexism
 *         > racism
 *         > ableism
 *     - (most) boomer
 *     - conservatives
 *     - nazis
 *     - TERFs
 *     - TWERFs
 *     - SWERFs
 *
 * -will be extended if necessary-
 */

package eidp.ws19.ex6;

/*
 * Created by 0x1nbetw33n on 26/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class IBAN {

    private static final int mod = 97;
    private static final int substring_length = 9;
    private static final int minuend = 98;
    final String country_code;
    final StringBuilder bank_code;
    final StringBuilder account_no;
    final StringBuilder bban;
    final StringBuilder iban;

    @SuppressWarnings("SameParameterValue")
    IBAN(String country_code, String bank_code, String account_no) {
        this.country_code = normalize_cc(country_code);
        this.bank_code = new StringBuilder(bank_code);
        this.account_no = new StringBuilder(account_no);
        this.bban = new StringBuilder();
        this.iban = new StringBuilder();
    }

    String normalize_cc(String country_code) {
        return country_code.toUpperCase();
    }

    int parse_char_to_code(char c) {
        return c - 'A' + 1 + 9;
    }

    void normalize_ac(){
        while (account_no.length() < 10){
            account_no.insert(0, "0");
        }
    }

    void create_bban() {
        bban.append(bank_code).append(account_no);
    }

    void extend_bban() {
        bban.append(parse_char_to_code(country_code.charAt(0))).append(parse_char_to_code(country_code.charAt(1)));
        bban.append("00");
    }

    void create_iban() {
        normalize_ac();
        create_bban();
        StringBuilder bban_copy = new StringBuilder(bban);
        extend_bban();
        Integer tmp = 0;
        while (!bban.toString().equals(tmp.toString())) {
            tmp = Integer.parseInt(bban.substring(0, calc_max_length())) % mod;
            bban.delete(0, calc_max_length());
            bban.insert(0, tmp);
        }
        if(minuend - tmp < 10) {bban_copy.insert(0, "0").insert(0, minuend - tmp);} else {bban_copy.insert(0, minuend - tmp);}
        iban.append(country_code);
        iban.append(bban_copy);
    }

    //prevents an index out of bounds exception
    int calc_max_length() {
        return Math.min(substring_length, bban.length());
    }

    public static void main(String[] args) {
        IBAN iban = new IBAN("de", "12345678", "123456");
        iban.create_iban();
        System.out.println(iban.iban);
    }

}