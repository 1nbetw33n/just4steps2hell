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

package eidp.ws19.ex4;

/*
 * Created by 0x1nbetw33n on 10/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

public class Interests {

	/*
	k0 = initial investment
	p = interest rate
	n = number of years
	m = number of interests / year
	 */
	static void calc_interest(double k0, double p, double n, double m){
		double i = p/100;
		System.out.println(k0 * (1. + i * n));
		System.out.println(k0 * Math.pow(1. + i, n ));
		System.out.println(k0 * Math.pow((1. + i/m), (m * n)));
	}

	public static void main(String @NotNull [] args){
		double k0 = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double m = Double.parseDouble(args[3]);
		calc_interest(k0, p, n, m);
	}

}