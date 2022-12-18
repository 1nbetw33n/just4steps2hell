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

import java.util.concurrent.atomic.AtomicReference;

/*
 * Created by 0x1nbetw33n on 17. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class WebShop {

        private static final AtomicReference<WebShop> instance = new AtomicReference<>();
        private static final ThreadLocal<Item[]> items = ThreadLocal.withInitial(() -> new Item[10]);
        private static final ThreadLocal<Customer[]> customers = ThreadLocal.withInitial(() -> new Customer[10]);


        /**
         * Hidden constructor, so that the class can only be instantiated by using get_instance().
         */
        @Contract(pure = true)
        private WebShop() {}

        /**
         * Creates a new instance of the WebShop class if there is no instance yet.
         * @return the instance of the WebShop class (singleton) or the existing instance if there is already one.
         */
        static WebShop get_instance(){
                if (instance.get() == null){
                        synchronized (WebShop.class){
                                if (instance.get() == null){
                                        instance.set(new WebShop());
                                }
                        }
                }
                return instance.get();
        }
        /**
         * Adds a new item to the webshop.
         * @param item the item to be added.
         * @throws IllegalStateException if there are already 10 items listed in the webshop.
         */
        void add_new_item(final Item item) {
                if (!has_free_item_slots()){
                        throw new IllegalStateException("No free item slots available!");
                } else {
                        for (int i = 0; i < items.get().length; i++){
                                if (items.get()[i] == null){
                                        items.get()[i] = item;
                                        break;
                                }
                        }
                }
        }

        /**
         * Registers a new customer in the webshop.
         * @param customer the customer to register.
         * @throws IllegalStateException if there are already 10 customers registered in the webshop.
         */
        void register_new_customer(final Customer customer) {
                if (!has_free_customer_slots()){
                        throw new IllegalStateException("No free customer slots available!");
                } else {
                        for (int i = 0; i < customers.get().length; i++){
                                if (customers.get()[i] == null){
                                        customers.get()[i] = customer;
                                        break;
                                }
                        }
                }
        }

        /**
         * Finalizes the order of a customer, checks them out and prints the receipt.
         * @param customer the customer who wants to finalize the order.
         * @param order the items the customer wants to buy.
         * @return the receipt of the order.
         * @throws IllegalStateException if the customer does not exist.
         */
         String checkout(final Customer customer, final String... order) throws IllegalArgumentException {
                StringBuilder receipt = new StringBuilder();
                var total_price = 0.0;
                if(!customer_exists(customer.get_name(), customer.get_surname())){
                        throw new IllegalArgumentException("Customer " + customer.get_name() + " "
                                + customer.get_surname() + " does not exist!");
                } else {
                        receipt.append("Rechnung\tfuer\t")
                                .append(customer.get_name())
                                .append(" ").append(customer.get_surname())
                                .append(":")
                                .append(System.lineSeparator());
                        var discount = 1.;
                        for (String item : order){
                                receipt.append(item)
                                        .append(":\t");
                                if (item_exists(item)){
                                        if (get_item(item).is_available()){
                                                if (customer instanceof GoodCustomer) {
                                                        discount *= (100. - ((GoodCustomer) customer).get_discount()) / 100.;
                                                }
                                                receipt.append(get_item(item).get_price() * discount)
                                                        .append(System.lineSeparator());
                                                get_item(item).decrease_amount();
                                                total_price += get_item(item).get_price() * discount;
                                        } else {
                                                receipt.append("not available anymore")
                                                        .append(System.lineSeparator());
                                        }
                                } else {
                                        receipt.append("not found")
                                                .append(System.lineSeparator());
                                }
                        }
                }
                return receipt.append("Gesamtpreis:\t")
                        .append(total_price)
                        .toString();
        }

        /**
         * Checks if it is possible to add a new item to the webshop.
         * @return true if it is possible to add a new item to the webshop, false otherwise.
         */
        private boolean has_free_item_slots() {
                for (final Item item : items.get()) {
                        if (item == null) {
                                return true;
                        }
                }
                return false;
        }

        /**
         * Checks if it is possible to add a new customer to the webshop.
         * @return true if it is possible to add a new customer to the webshop, false otherwise.
         */
        private boolean has_free_customer_slots() {
                for (final Customer customer : customers.get()){
                        if (customer == null){
                                return true;
                        }
                }
                return false;
        }

        /**
         * Checks whether an item exists in the webshop.
         * @param name the name of the item to check.
         * @return true if the item exists in the webshop, false otherwise.
         * @throws IllegalArgumentException if the name is null, empty or blank.
         */
        @Contract("null -> fail")
        private static boolean item_exists(final String name) {
                if (name == null){
                        throw new IllegalArgumentException("name must not be null!");
                } else if (name.isEmpty() || name.isBlank()){
                        throw new IllegalArgumentException("name must not be empty!");
                } else {
                        for (final Item item : items.get()){
                                if (item != null && item.get_name().equals(name)){
                                        return true;
                                }
                        }
                }
                return false;
        }

        /**
         * Checks whether a customer exists in the webshop.
         * @param name the name of the customer to check.
         * @return true if the customer exists in the webshop, false otherwise.
         * @throws IllegalArgumentException if the name or surname is null, empty or blank.
         */
        @SuppressWarnings("BooleanMethodIsAlwaysInverted")
        @Contract("null, _ -> fail")
        private static boolean customer_exists(final String name, final String surname) {
                if (name == null){
                        throw new IllegalArgumentException("name must not be null!");
                } else if (name.isEmpty() || name.isBlank()){
                        throw new IllegalArgumentException("name must not be empty!");
                } else if (surname == null){
                        throw new IllegalArgumentException("surname must not be null!");
                } else if (surname.isEmpty() || surname.isBlank()){
                        throw new IllegalArgumentException("surname must not be empty!");
                } else {
                        for (final Customer customer : customers.get()){
                                if (customer != null && customer.get_name().equals(name)
                                        && customer.get_surname().equals(surname)){
                                        return true;
                                }
                        }
                }
                return false;
        }

        /**
         * Gets the customer with the given name.
         * @param name The name of the customer.
         * @return The customer with the given name.
         * @see #customer_exists(String, String)
         * @throws IllegalArgumentException if the name or surname is null, empty or blank.
         */
        static Customer get_customer(final String name, final String surname) {
                Customer result = null;
                if (!customer_exists(name, surname)) {
                        throw new IllegalArgumentException("Customer " + name + " " + surname + " does not exist!");
                } else {
                        for (final Customer customer : customers.get()) {
                                if (customer != null && customer.get_name().equals(name)
                                        && customer.get_surname().equals(surname)) {
                                        result = customer;
                                        break;
                                }
                        }
                }
                return result;
        }

        /**
         * Gets the item with the given name.
         * @param name The name of the item.
         * @return The item with the given name.
         * @throws IllegalArgumentException if the name is null, empty or blank.
         * @see #item_exists(String)
         */
        static Item get_item(final String name) {
                Item result = null;
                if (!item_exists(name)) {
                        throw new IllegalArgumentException("Item " + name + " does not exist!");
                } else {
                        for (final Item item : items.get()) {
                                if (item != null && item.get_name().equals(name)) {
                                        result = item;
                                        break;
                                }
                        }
                }
                return result;
        }


}
