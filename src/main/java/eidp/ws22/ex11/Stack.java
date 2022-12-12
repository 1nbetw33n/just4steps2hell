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

package eidp.ws22.ex11;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Created by 0x1nbetw33n on 12. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
public final class Stack<E> {

        private E[] stack;
        private int index;


        /**
         * Creates a new stack with one free slot.
         */
        @SuppressWarnings("unchecked")
        @Contract(pure = true)
        public Stack() {
                stack = (E[]) new Object[1];
                index = 0;
        }

        /**
         * Pushes an element to the top of the stack.
         * @param value The element to push.
         */
        @SuppressWarnings("unchecked")
        public void push(final E value) {
                if (index == stack.length) {
                        final E[] newStack = (E[]) new Object[stack.length * 2];
                        System.arraycopy(stack, 0, newStack, 0, stack.length);
                        stack = newStack;
                }
                stack[index++] = value;
        }

        /**
         * Pops the top element of the stack.
         * @return The element on the top of the stack and removes it.
         */
        @Contract(mutates = "this")
        public E pop() {
                if (index == 0) {
                        throw new IllegalStateException("Stack is empty.");
                }
                return stack[--index];
        }

        /**
         * Checks if the stack is empty.
         * @return True if the stack is empty, false otherwise.
         */
        @Contract(pure = true)
        public boolean is_empty() {
                return index == 0;
        }

        /**
         * Converts the stack to a string.
         * @return The stack as a string.
         */
        public @NotNull String toString() {
                final StringBuilder sb = new StringBuilder();
                for (int i = 0; i < index; i++) {
                        if(stack[i] instanceof String) {sb.append(stack[i]);}
                        else {
                                if (i < index - 1) {sb.append(stack[i]).append(" ");}
                                else { sb.append(stack[i]);}
                        }

                }
                return sb.toString();
        }

}
