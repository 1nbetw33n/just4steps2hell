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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by 0x1nbetw33n on 21/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class UtilTest {

	private @Nullable Collection<Person> studentsEmpty;
	private @Nullable Collection<Person> studentsFilled;
	private @Nullable Student student1;
	private @Nullable Student student2;
	private @Nullable Student student3;

	private @Nullable Schlange<Integer> src;
	private @Nullable Schlange<Integer> dst;


	@BeforeEach
	void setUp(){
		studentsEmpty = new ArrayList<>();
		studentsFilled = new ArrayList<>();
		student1 = new Student("Anton", "Aurich", 111111);
		student2 = new Student("Anton", "Aurich", 111111);
		student3 = student1;
		studentsFilled.add(student1);
		studentsFilled.add(student2);
		studentsFilled.add(student3);
		src = new Schlange<>();
		src.insert(1);
		src.insert(2);
		src.insert(3);
		src.insert(4);
		src.insert(5);
		dst = new Schlange<>();
	}

	@AfterEach
	void tearDown() {
		studentsEmpty = null;
		studentsFilled = null;
		student1 = null;
		student2 = null;
		student3 = null;
		src = null;
		dst = null;
	}

	@Test
	void testNumElementesInCollection() {
		assertEquals(0, Util.numElementesInCollection(Objects.requireNonNull(studentsEmpty), student1));
		assertEquals(2, Util.numElementesInCollection(Objects.requireNonNull(studentsFilled), student1));
	}

	@Test
	void test_sCopy() {
		Util.sCopy(src, Objects.requireNonNull(dst));
		assertEquals(Objects.requireNonNull(src).size(), dst.size());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
	}

}