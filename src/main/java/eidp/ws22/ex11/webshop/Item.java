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

import org.jetbrains.annotations.Contract;

/*
 * Created by 0x1nbetw33n on 17. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class Item {

        private final String name;
        private final double price;
        private int amount;


        /**
         * Constructor for Item
         * @param name name of the item.
         * @param price price of the item.
         * @param amount amount of the item.
         */
        @Contract(pure = true)
        Item(final String name, final double price, final int amount) {
                this.name = name;
                this.price = price;
                this.amount = amount;
        }

        /**
         * Checks if the item is available.
         * @return true if the item is available, false otherwise.
         */
        @Contract(pure = true)
        boolean is_available() {
                return amount > 0;
        }

        /**
         * Decreases the amount of the item by one.
         */
        @SuppressWarnings("UnstableApiUsage")
        @Contract(mutates = "this")
        void decrease_amount() {
                set_amount(--amount);
        }

        @Contract(pure = true)
        String get_name() {
                return name;
        }

        @Contract(pure = true)
        double get_price() {
                return price;
        }

        @SuppressWarnings("UnstableApiUsage")
        @Contract(mutates = "this")
        private void set_amount(final int amount) {
                this.amount = amount;
        }

}
