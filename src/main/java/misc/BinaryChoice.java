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

package misc;

/*
 * Created by 0x1nbetw33n on 18/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.Random;

final class BinaryChoice {

    private static final String[] binaryChoice = {"Frau", "Mann"};
    private static final Random random = new Random();

    private static @NotNull String getRandomBinaryChoice() {
        return binaryChoice[random.nextInt(binaryChoice.length)];
    }

    public static void main(String[] args) {
        System.out.println(getRandomBinaryChoice());
    }
}