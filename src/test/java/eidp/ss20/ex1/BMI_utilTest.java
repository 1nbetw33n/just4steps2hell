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
 *      - MAPs
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

package eidp.ss20.ex1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static eidp.ss20.ex1.BMI_util.calc_bmi;

/*
 * Created by 0x1nbetw33n on 07/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
@SuppressWarnings("NewClassNamingConvention")
class BMI_util_test {

	double weight1;
	double weight2;
	double weight3;
	double height1;
	double height2;
	double height3;
	double result1;
	double result2;
	double result3;

	@BeforeEach
	void set_up(){
		weight1 = 70.;
		weight2 = 63.;
		weight3 = 85.;
		height1 = 1.60;
		height2 = 1.78;
		height3 = 1.85;
		result1 = calc_bmi(weight1, height1);
		result2 = calc_bmi(weight2, height2);
		result3 = calc_bmi(weight3, height3);
	}

	@AfterEach
	void tear_down(){
		weight1 = 0.;
		weight2 = 0.;
		weight3 = 0.;
		height1 = 0.;
		height2 = 0.;
		height3 = 0.;
	}


	@Test
	void testCalc_bmi() {
		Assertions.assertTrue(27.34375 - result1 < 0.00001);
		Assertions.assertTrue(19.883853049 - result2 < 0.00001);
		Assertions.assertTrue(24.835646457 - result3 < 0.00001);
	}
}