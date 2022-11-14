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

package eidp.ws19.ex6;

import org.jetbrains.annotations.Contract;

import static misc.Util.all_tests_passed;
import static misc.Util.println;

/*
 * Created by 0x1nbetw33n on 11/10/22
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class Mirroring {

	/**
	 * Mirrors the given number.
	 * @param no the number to mirror.
	 * @return the mirrored number.
	 */
	@Contract(pure = true)
	public static int mirroring(int no){
		var result = 0;
		while(no != 0){
			result = result * 10 + no % 10;
			no /= 10;
		}
		return result;
	}

	/**
	 * Mirros the given number and adds it to the original number.
	 * @param no the nuumber on which the mirroring number is added.
	 * @return the original number plus the mirrored number.
	 */
	@Contract(pure = true)
	public static int mirror_add(int no){
		return no + mirroring(no);
	}

	/**
	 * Checks if the given number is a palindrome.
	 * @param no the number to check.
	 * @return true if the number is a palindrome, false otherwise.
	 */
	@Contract(pure = true)
	public static boolean is_palindrome(int no){
		return no == mirroring(no);
	}

	public static void main(final String... args) {
		assert mirroring(1234) == 4321;
		assert mirroring(12322) != 12322;
		assert mirror_add(1234) == 1234 + 4321;
		assert mirror_add(123) == 123 + 321;
		assert is_palindrome(191);
		assert !is_palindrome(123);
		assert is_palindrome(12321);
		assert is_palindrome(23432);
		assert !is_palindrome(1221);
		all_tests_passed();

		var no = Integer.parseInt(args[0]);
		println(mirroring(no));
		println(mirror_add(no));
		while(!is_palindrome(no)){
			no = mirror_add(no);
		}
		println(no);

	}

}
