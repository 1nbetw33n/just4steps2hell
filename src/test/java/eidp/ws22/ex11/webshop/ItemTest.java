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

package eidp.ws22.ex11.webshop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Created by 0x1nbetw33n on 17. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class ItemTest {

        private Item item1;
        private Item item2;
        private Item item3;
        private Item item4;


        @BeforeEach
        void setUp() {
                item1 = new Item("not-available", 100., 0);
                item2 = new Item("not-available", 100., -43);
                item3 = new Item("low-stock", 100., 3);
                item4 = new Item("lots-of-available", 100., 999);

        }

        @AfterEach
        void tearDown() {
                item1 = null;
                item2 = null;
                item3 = null;
                item4 = null;
        }

        /**
         * Tests if the item is available.
         */
        @Test
        void test_is_available() {
                assertFalse(item1.is_available());
                assertFalse(item2.is_available());
                assertTrue(item3.is_available());
                assertTrue(item4.is_available());
        }
}