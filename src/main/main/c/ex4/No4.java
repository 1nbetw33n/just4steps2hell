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

package main.c.ex4;

/*
 * Created by 0x1nbetw33n on 13/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class No4 {

    static boolean isPalindrome(@NotNull String input) {
        char[] possiblePalindrome = input.toCharArray();
        if (possiblePalindrome.length < 2) {throw new IllegalArgumentException("String shall be not shorter than 2 characters!");}
        for (int i = 0, j = possiblePalindrome.length - 1; i < possiblePalindrome.length; i++, j--) {
            if (possiblePalindrome[i] != possiblePalindrome[j]) {return false;}
        }
        return true;
    }

    public static void main(String[] args){
        String text1 = "abcdefksh";
        String text2 = "abcdtdcba";
        String text3 = "ootooootoo";
        assertFalse(isPalindrome(text1));
        assertTrue(isPalindrome(text2));
        assertTrue(isPalindrome(text3));
    }

}


