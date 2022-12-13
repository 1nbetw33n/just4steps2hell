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

package prog2.exm_ss22;

import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by 0x1nbetw33n on 21/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class SchlangeTest {
	private @Nullable Schlange<Integer> schlange;

	@BeforeEach
	void setUp() {
		schlange = new Schlange<>();
	}

	@AfterEach
	void tearDown() {
		schlange = null;
	}

	@Test
	void insertRemoveTest(){
		Objects.requireNonNull(schlange).insert(1);
		schlange.insert(2);
		schlange.insert(3);
		schlange.insert(4);
		schlange.insert(5);
		assertEquals(5, schlange.size());
		assertEquals(1, schlange.remove());
		assertEquals(2, schlange.remove());
		assertEquals(3, schlange.remove());
		assertEquals(4, schlange.remove());
		assertEquals(5, schlange.remove());
		assertEquals(0, schlange.size());
	}

	@Test
	void removeEmptyExceptionTest(){
		Assertions.assertThrows(RuntimeException.class, () -> Objects.requireNonNull(schlange).remove());
	}

}