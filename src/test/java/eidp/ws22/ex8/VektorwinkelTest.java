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

package eidp.ws22.ex8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static eidp.ws22.ex8.Vektorwinkel.*;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 15. Nov 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class VektorwinkelTest {

	private double[] v1;
	private double[] v2;
	private double[] v3;
	private double[] v4;
	private double[] v5;
	private double[] v6;
	private double[] v7;
	private double[] v8;

	@BeforeEach
	void setUp() {
		v1 = new double[]{1, 0};
		v2 = new double[]{1, 1};
		v3 = new double[]{1, 2};
		v4 = new double[]{2, 1};
		v5 = new double[]{1, 0, 0};
		v6 = new double[]{0, 1, 0};
		v7 = new double[]{1, 1, 1, 1};
		v8 = new double[]{1, 2, 3, 4};
	}

	@AfterEach
	void tearDown() {
		v1 = null;
		v2 = null;
		v3 = null;
		v4 = null;
		v5 = null;
		v6 = null;
		v7 = null;
		v8 = null;
	}

	@Test
	void winkel_test() {
		assertEquals(45, winkel(v1, v2));
		assertEquals(36, winkel(v3, v4));
		assertEquals(90, winkel(v5, v6));
		assertEquals(24, winkel(v7, v8));
	}
}