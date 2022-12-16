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

package eidp.ws22.ex11.football;

import org.jetbrains.annotations.Contract;

/*
 * Created by 0x1nbetw33n on 16. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
final class Team {

        private final Footballer[] team;

        /**
         * Default Constructor for Team for convenience.
         * <p>
         * Initializes the team with 5 players, so players can be added later.
         */
        @Contract(pure = true)
        Team() {
                team = new Footballer[5];
        }

        /**
         * Constructor for Team.
         * @param p1 player 1
         * @param p2 player 2
         *...
         */
        @Contract(pure = true)
        Team(final Footballer p1, final Footballer p2, final Footballer p3, final Footballer p4, final Footballer p5) {
                team = new Footballer[]{p1, p2, p3, p4, p5};
        }

        /**
         * Checks if the has free space for a new player.
         * @return true if there is free space, false if not
         */
        @Contract(pure = true)
        private boolean has_free_slot() {
                for (Footballer footballer : team) {
                        if (footballer == null) {
                                return true;
                        }
                }
                return false;
        }

        /**
         * Adds a player to an empty slot in the team, if there is a free slot.
         * @param player player to add
         * @throws IllegalStateException if there is no free slot
         */
        void add_player(final Footballer player) {
                if(!has_free_slot()) {
                        throw new IllegalStateException("Team is full!");
                } else {
                        for (int i = 0; i < team.length; i++) {
                                if (team[i] == null) {
                                        team[i] = player;
                                        break;
                                }
                        }
                }
        }

        /**
         * Calculates the total salary of the team.
         * @return total salary of the team
         */
        @Contract(pure = true)
        public int total_salary() {
                int total = 0;
                for (Footballer p : team) {
                        total += p.getSalary();
                }
                return total;
        }

        public String toString() {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < team.length; i++) {
                        sb.append(i + 1).append(". ").append(team[i].getName());
                        if(i < team.length - 1) {
                                sb.append("\n");
                        }
                }
                return sb.toString();
        }
}
