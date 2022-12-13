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

package prog2.misc;

import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/*
 * Created by 0x1nbetw33n on 08/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
@SuppressWarnings({"unused", "CommentedOutCode"})
class SnakeMatrixIteratorTest {

	private Integer[] @Nullable [] snakeMatrix;
	private SnakeMatrixIterator<?> snakeMatrixIterator;

	@BeforeEach
	void setup() {
		snakeMatrix = new Integer[][]{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		snakeMatrixIterator = new SnakeMatrixIterator<>(snakeMatrix);
	}

	@AfterEach
	void tearDown(){
		snakeMatrix = null;
	}

	@Test
	void testHasNext() {
		while (snakeMatrixIterator.hasNext()) {
			assertEquals(1, snakeMatrixIterator.next());
			assertEquals(2, snakeMatrixIterator.next());
			assertEquals(3, snakeMatrixIterator.next());
			assertEquals(6, snakeMatrixIterator.next());
			assertEquals(5, snakeMatrixIterator.next());
			assertEquals(4, snakeMatrixIterator.next());
			assertEquals(7, snakeMatrixIterator.next());
			assertEquals(8, snakeMatrixIterator.next());
			assertEquals(9, snakeMatrixIterator.next());
		}
		//noinspection ConstantConditions
		assertFalse(snakeMatrixIterator.hasNext());
	}

    /*
    @Test
    void testNext() {
        Object result = snakeMatrixIterator.next();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
    */
}