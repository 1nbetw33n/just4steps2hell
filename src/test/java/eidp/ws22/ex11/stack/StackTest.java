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

package eidp.ws22.ex11.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 12. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class StackTest {

        private Stack<Object> stack;


        @BeforeEach
        void setUp() {
                stack = new Stack<>();
        }


        @AfterEach
        void tearDown() {
                stack = null;
        }


        /**
         * Test method for {@link Stack#push(java.lang.Object)}
         * and {@link Stack#pop()}.
         */
        @Test
        void push_pop_test() {
                stack.push("a");
                stack.push("b");
                stack.push("c");
                assertEquals("c", stack.pop());
                assertEquals("b", stack.pop());
                assertEquals("a", stack.pop());

                stack.push(1);
                stack.push(2);
                stack.push(3);
                assertEquals(3, stack.pop());
                assertEquals(2, stack.pop());
                assertEquals(1, stack.pop());

                stack.push(1.);
                stack.push(2.);
                stack.push(3.);
                assertEquals(3., stack.pop());
                assertEquals(2., stack.pop());
                assertEquals(1., stack.pop());

                stack.push('a');
                stack.push('b');
                stack.push('c');
                assertEquals('c', stack.pop());
                assertEquals('b', stack.pop());
                assertEquals('a', stack.pop());

                stack.push(true);
                stack.push(false);
                assertEquals(false, stack.pop());
                assertEquals(true, stack.pop());

                stack.push(null);
                assertNull(stack.pop());

                stack.push(new Object());
                assertNotNull(stack.pop());
        }

        /**
         * Test method for {@link Stack#is_empty()}.
         */
        @Test
        void is_empty_test() {
                assertTrue(stack.is_empty());
                stack.push("a");
                assertFalse(stack.is_empty());
                stack.pop();
                assertTrue(stack.is_empty());

                stack.push(1);
                assertFalse(stack.is_empty());
                stack.pop();
                assertTrue(stack.is_empty());
        }

        @Test
        void toString_test() {
                stack.push("a");
                stack.push("b");
                stack.push("c");
                assertEquals("abc", stack.toString());
                stack.pop();
                assertEquals("ab", stack.toString());
                stack.pop();
                assertEquals("a", stack.toString());
                stack.pop();
                assertEquals("", stack.toString());
        }
}