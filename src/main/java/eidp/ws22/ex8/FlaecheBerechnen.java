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

package eidp.ws22.ex8;

import org.jetbrains.annotations.Contract;

import static java.lang.Math.abs;

/*
 * Created by 0x1nbetw33n on 11/14/22
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
public final class FlaecheBerechnen {

	/**
	 * Calculates the area of a closed polygon with the formula provided by Rudolf Berrendorf.
	 * <p>
	 * The polygon is defined by a list of coordinates.
	 * @param coord The coordinates of the polygon.
	 * <p>
	 * Format: [x, y].
	 * <p>
	 * Example: {{0, 0}, {1, 0}, {1, 1}, {0, 1}}
	 * @return the area of the polygon.
	 */
	@Contract(pure = true)
	public static float flaecheBerechnen(float[][] coord) {
		float flaeche = 0f;
		for (int i = 0; i < coord.length; i++) {
			int j = (i + 1) % coord.length;
			flaeche += ((coord[i][0] + coord[j][0]) * (coord[j][1] - coord[i][1]));
		}
		return abs(flaeche / 2);
	}


	/**
	 * Calculates the area of a closed polygon with a slightly modified formula.
	 * <p>
	 * The polygon is defined by a list of coordinates.
	 * @param coord The coordinates of the polygon.
	 * <p>
	 * Format: [x, y].
	 * <p>
	 * Example: {{0, 0}, {1, 0}, {1, 1}, {0, 1}}
	 * @return the area of the polygon.
	 */
	@Contract(pure = true)
	public static float calculate_surface_area(final float[][] coord) {
		float flaeche = 0f;
		for (int i = 0; i < coord.length; i++) {
			int j = (i + 1) % coord.length;
			flaeche += coord[i][0] * coord[j][1];
			flaeche -= coord[j][0] * coord[i][1];
		}
		return abs(flaeche / 2.0f);
	}




















































}
