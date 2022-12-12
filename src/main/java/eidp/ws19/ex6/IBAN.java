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

import org.jetbrains.annotations.NotNull;

import static misc.Util.println;

public class IBAN {

    private static final int mod = 97;
    private static final int substring_length = 9;
    private static final int minuend = 98;
    final @NotNull String country_code;
    final @NotNull StringBuilder bank_code;
    final @NotNull StringBuilder account_no;
    final @NotNull StringBuilder bban;
    final @NotNull StringBuilder iban;

    /**
     * Constructor for IBAN (International Bank Account Number).
     * @param country_code the 2-letter country code (ex. DE)
     * @param bank_code the 8-digit bank code (ex. 37040044)
     * @param account_no the 10-digit account number (ex. 0532013000
     * <p>or
     * <p>
     * 123456 (account_nos < 10 digits will be padded with 0s at the beginning))
     */
    @SuppressWarnings("SameParameterValue")
    IBAN(@NotNull String country_code, @NotNull String bank_code, @NotNull String account_no) {
        this.country_code = normalize_cc(country_code);
        this.bank_code = new StringBuilder(bank_code);
        this.account_no = new StringBuilder(account_no);
        this.bban = new StringBuilder();
        this.iban = new StringBuilder();
    }

    /**
     * Makes the country code all uppercase.
     * @param country_code the 2-letter country code (ex. de)
     * @return the country code in uppercase (ex. DE)
     */
    @NotNull String normalize_cc(@NotNull String country_code) {
        return country_code.toUpperCase();
    }

    /**
     * Converts the given character to its corresponding index in the alphabet starting at 1 (ex. A = 1, B = 2, ...) and adds 9 to it.
     * @param c the character to convert
     * @return the converted character as {@code int}
     */
    int parse_char_to_code(final char c) {
        return c - 'A' + 1 + 9;
    }

    /**
     * Pads the account number with 0s at the beginning if it is shorter than 10 digits.
     */
    void normalize_ac(){
        while (account_no.length() < 10){
            account_no.insert(0, "0");
        }
    }

    /**
     * Creates the BBAN (Basic Bank Account Number) by adding the bank code and the account number together.
     */
    void create_bban() {
        bban.append(bank_code).append(account_no);
    }

    /**
     * Extends the BBAN by adding the country code as 2-digit numbers parsed by {@link #parse_char_to_code(char)} and adds 00 at the end.
     */
    void extend_bban() {
        bban.append(parse_char_to_code(country_code.charAt(0))).append(parse_char_to_code(country_code.charAt(1)));
        bban.append("00");
    }

    /**
     * creates the IBAN from the BBAN.
     */
    void create_iban() {
        normalize_ac();
        create_bban();
        var bban_copy = new StringBuilder(bban);
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

    /**
     * Prevents an index out of bounds exception by calculating the maximum length of the substring.
     * @return the maximum length of the substring if the length of the BBAN is greater than {@link #substring_length} or the length of the BBAN if it is smaller.
     */
    int calc_max_length() {
        return Math.min(substring_length, bban.length());
    }

    public static void main(String[] args) {
        var iban = new IBAN("de", "12345678", "123456");
        iban.create_iban();
        System.out.println(iban.iban);
        println(iban.parse_char_to_code('A'));
    }

}