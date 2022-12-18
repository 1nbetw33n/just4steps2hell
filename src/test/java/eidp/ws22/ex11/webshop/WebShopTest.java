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

import static eidp.ws22.ex11.webshop.WebShop.*;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 17. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class WebShopTest {

        private WebShop webshop;
        private Customer customer;
        private Customer good_customer;
        private Item leberwurst;
        private Item nutella;
        private String[] order1;
        private String[] order2;

        @BeforeEach
        void setUp() {
                webshop = get_instance();
                customer = new Customer("Helga", "Herrlich");
                good_customer = new GoodCustomer("Werner", "Winzig", 5);
                webshop.register_new_customer(customer);
                webshop.register_new_customer(good_customer);
                leberwurst = new Item("Leberwurst", 1.95, 2);
                nutella = new Item("Nutella", 3.95, 1);
                webshop.add_new_item(leberwurst);
                webshop.add_new_item(nutella);
                order1 = new String[]{"Leberwurst", "Nutella"};
                order2 = new String[]{"Leberwurst", "Nutella", "Butter"};
        }

        @AfterEach
        void tearDown() {
                webshop = null;
                customer = null;
                good_customer = null;
                leberwurst = null;
                nutella = null;
                order1 = null;
                order2 = null;
        }

        @Test
        void test_get_instance() {
                assertNotNull(webshop);
                assertSame(webshop, get_instance());
        }

        @Test
        void test_add_new_item() {
                assertEquals(leberwurst.get_name(), get_item("Leberwurst").get_name());
                assertEquals(nutella.get_name(), get_item("Nutella").get_name());
                assertThrows(IllegalArgumentException.class, () -> get_item("Butter"));
        }

        @Test
        void test_register_new_customer() {
                assertEquals(
                        (customer.get_name() + " " + customer.get_surname()),
                        (get_customer("Helga", "Herrlich")).get_name() + " " + get_customer("Helga", "Herrlich").get_surname());
                assertEquals(
                        (good_customer.get_name() + " " + good_customer.get_surname()),
                        (get_customer("Werner", "Winzig")).get_name() + " " + get_customer("Werner", "Winzig").get_surname());
                assertThrows(IllegalArgumentException.class, () -> get_customer("Jane", "Doe"));
        }

        @Test
        void test_checkout() {
                assertEquals(
                        (
                                "Rechnung\tfuer\tHelga Herrlich:" + System.lineSeparator()
                                        + "Leberwurst:\t1.95" + System.lineSeparator()
                                        + "Nutella:\t3.95" + System.lineSeparator()
                                        + "Gesamtpreis:\t5.9"
                        ),
                        webshop.checkout(customer, order1));
                assertEquals(
                        (
                                "Rechnung\tfuer\tWerner Winzig:" + System.lineSeparator()
                                        + "Leberwurst:\t1.8524999999999998" + System.lineSeparator()
                                        + "Nutella:\tnot available anymore" + System.lineSeparator()
                                        + "Butter:\tnot found" + System.lineSeparator()
                                        + "Gesamtpreis:\t1.8524999999999998"
                        ),
                        webshop.checkout(good_customer, order2));
        }
}