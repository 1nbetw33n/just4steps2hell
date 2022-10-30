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

package analysis;

/*
 * Created by 0x1nbetw33n on 02/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

@SuppressWarnings("unused")
public class ACAT4_3 {

    private static double nullstelle(@NotNull Function<Double, Double> f, double a, double b) {
        double center = 0.;
        while (Math.abs(a - b) >= 1E-6) {
            center = (a + b) / 2;
            if (f.apply(center) == 0) {
                break;
            } else if (f.apply(a) * f.apply(center) < 0) {
                b = center;
            } else {
                a = center;
            }
        }
        return center;
    }

}