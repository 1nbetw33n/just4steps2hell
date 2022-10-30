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
 * Created by 0x1nbetw33n on 25/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class Ex6 {

    static Number gcd_loop(Number no1, Number no2){
        while (!no1.equals(no2)){
            if (no1.doubleValue() > no2.doubleValue()){
                no1 = no1.doubleValue() - no2.doubleValue();
            } else {
                no2 = no2.doubleValue() - no1.doubleValue();
            }
        }
        return no1.doubleValue();
    }

    static Number gcd_rec(Number no1, Number no2){
        if (no1.equals(no2)) {
            return no1.doubleValue();
        } else if (no1.doubleValue() > no2.doubleValue()) {
            return gcd_rec(no1.doubleValue() - no2.doubleValue(), no2);
        } else {
            return gcd_rec(no1, no2.doubleValue() - no1.doubleValue());
        }
    }

    static Number gcd_mod_loop(Number no1, Number no2){
        Number tmp;
        while (!no2.equals(0)){
            tmp = no2;
            no2 = no1.doubleValue() % no2.doubleValue();
            no1 = tmp;
        }
        return no1.doubleValue();
    }

    static Number gcd_euclid(Number no1, Number no2){
            return no1.doubleValue() % no2.doubleValue() - 0 < .000001 ? no2.doubleValue() : gcd_euclid(no2, no1.doubleValue() % no2.doubleValue());
    }

    public static void main(String[] args) {
        assert(gcd_loop(54, 24).equals(6));
        assert(gcd_loop(12, 18).equals(6));
        assert(gcd_loop(12, 27).equals(3));
        assert(gcd_loop(34, 85).equals(17));
        assert(gcd_loop(31, 2).equals(1));
        assert(gcd_rec(54, 24).equals(6));
        assert(gcd_rec(12, 18).equals(6));
        assert(gcd_rec(12, 27).equals(3));
        assert(gcd_rec(34, 85).equals(17));
        assert(gcd_rec(31, 2).equals(1));
        assert(gcd_mod_loop(54, 24).equals(6));
        assert(gcd_mod_loop(12, 18).equals(6));
        assert(gcd_mod_loop(12, 27).equals(3));
        assert(gcd_mod_loop(34, 85).equals(17));
        assert(gcd_mod_loop(31, 2).equals(1));
        assert(gcd_euclid(54, 24).equals(6));
        assert(gcd_euclid(12, 18).equals(6));
        assert(gcd_euclid(12, 27).equals(3));
        assert(gcd_euclid(34, 85).equals(17));
        assert(gcd_euclid(31, 2).equals(1));
    }
}

