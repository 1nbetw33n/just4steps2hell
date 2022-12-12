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

package main.eidp.ws22.ex11;

import eidp.ws22.ex11.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static eidp.ws22.ex11.Mirroring.mirroring;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by 0x1nbetw33n on 12. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class MirroringTest {

        private Stack<Object> stack;

        @BeforeEach
        void setUp() {
                stack = new Stack<>();
        }

        @AfterEach
        void tearDown() {
                stack = null;
        }

        @Test
        void spiegeln_test() {
                stack.push("h");
                stack.push("a");
                stack.push("l");
                stack.push("l");
                stack.push("o");
                assertEquals("ollah", mirroring(stack).toString());
        }
}