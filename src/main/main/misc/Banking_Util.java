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

package main.misc;

/*
 * Created by 0x1nbetw33n on 11/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class Banking_Util {

    static int create_kto_nr(int n){
        return n * 100 + (97 - ((n * 100) % 97));
    }

    static boolean kto_nr_is_valid(int kto_nr){
        return kto_nr % 97 == 0;
    }

    public static void main(String[] args) {
        int kto_nr = 43564523;
        System.out.println(kto_nr_is_valid(kto_nr));
        kto_nr = create_kto_nr(kto_nr);
        System.out.println(kto_nr_is_valid(kto_nr));
    }
}