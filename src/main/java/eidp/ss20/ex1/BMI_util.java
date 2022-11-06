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

package eidp.ss20.ex1;

/*
 * Created by 0x1nbetw33n on 07/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import static misc.Util.println;

public class BMI_util {

    /**
     * Calculates the bmi
     * @param weight the weight in kilograms (ex. 70)
     * @param height the height in decimal number (ex. 1.70)
     * @return the bmi calculated with the formula:
     * <p>
     * bmi = weight / (height * height)
     */
    public static double calc_bmi(double weight, double height){
        return weight / (height * height);
    }

    public static void main(String[] args) {
        println(calc_bmi(63, 1.73));
    }

}