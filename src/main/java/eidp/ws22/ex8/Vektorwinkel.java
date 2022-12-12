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

import org.jetbrains.annotations.Contract;

/*
 * Created by 0x1nbetw33n on 11/14/22
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class Vektorwinkel {

	/**
	 * Calculates the angle between two vectors.
	 * @param v1 the first vector.
	 * @param v2 the second vector.
	 * @return the angle between the two vectors.
	 * @throws IllegalArgumentException if the vectors ain't have the same length.
	 */
	@Contract(pure = true)
	private static double calc_scalar_product(double[] v1, double[] v2) {
		if (v1.length != v2.length) {
			throw new IllegalArgumentException("Vectors must have the same length");
		} else {
			double scalar_product = 0;
			for (int i = 0; i < v1.length; i++) {
				scalar_product += v1[i] * v2[i];
			}
			return scalar_product;
		}
	}

	/**
	 * Calculates the norm of a vector.
	 * @param v the vector.
	 * @return the norm of the vector.
	 */
	@Contract(pure = true)
	private static double calc_norm(double[] v) {
		double norm = 0;
		for (double d : v) {
			norm += d * d;
		}
		return Math.sqrt(norm);
	}


	/**
	 * Calculates the angle between two vectors.
	 * @param v1 the first vector.
	 * @param v2 the second vector.
	 * @return the angle between the two vectors.
	 * @throws IllegalArgumentException if the vectors ain't have the same length.
	 */
	@Contract(pure = true)
	public static double winkel(final double[] v1, final double[] v2) {
		if (v1.length != v2.length) {
			throw new IllegalArgumentException("Vectors must have the same length");
		} else {
			double scalar_product = calc_scalar_product(v1, v2);
			double norm1 = calc_norm(v1);
			double norm2 = calc_norm(v2);
			return Math.acos(scalar_product / (norm1 * norm2));
		}
	}

}

