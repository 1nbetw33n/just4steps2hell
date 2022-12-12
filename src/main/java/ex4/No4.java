/*
 *
 * Copyright (c) 2022 1nbetw33n
 * Virgo Supercluster, Milky Way - Earth A-6847
 *
 * I dont give a fuck about copyright - this code is free to use for everybody - EXCEPTION:
 *      - entities that support:
 *          > queer hostility
 *          > any kind of religion
 *          > authoritarianism
 *          > sexism
 *          > racism
 *          > ableism
 *      - (most) boomer
 *      - conservatives
 *      - nazis
 *      - TERFs
 *      - TWERFs
 *      - SWERFs
 *   -will be extended if necessary-
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * -will be extended if necessary-
 */

package ex4;

/*
 * Created by 0x1nbetw33n on 13/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;


public class No4 {

    /**
     * Hidden constructor, because this is a utility class and shall not be instantiated.
     */
    @Contract(value = " -> fail", pure = true)
    private No4() {
        throw new IllegalStateException("Utility class");
    }

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
        Assertions.assertFalse(isPalindrome(text1));
        Assertions.assertTrue(isPalindrome(text2));
        Assertions.assertTrue(isPalindrome(text3));
    }

}


