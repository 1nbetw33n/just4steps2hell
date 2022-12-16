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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by 0x1nbetw33n on 16. Dec 2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
@SuppressWarnings("NewClassNamingConvention")
final class Football_Test {

        private Team team;
        private Team team_red;
        private Team team_blue;

        private Person[] spectators;

        @BeforeEach
        void set_up(){
                team = new Team(
                        new Footballer("Horn", 123),
                        new Footballer("Kimmich", 456),
                        new Footballer("Hummels", 789),
                        new Footballer("Lewandoski", 101112),
                        new Footballer("Modeste", 131415));
                team_red = new Team();
                team_blue = new Team();
                for(int i = 0; i < 5; i++){
                        team_red.add_player(new Footballer("Player-red-" + (i + 1), 10000 * (i + 1)));
                }
                for(int i = 0; i < 5; i++){
                        team_blue.add_player(new Footballer("Player-blue-" + (i + 1), 20000 * (i + 1)));
                }
                spectators = new Person[45000];
                for(int i = 0; i < 45000; i++){
                        spectators[i] = new Person("Spectator-" + (i + 1));
                }
        }

        @Contract(mutates = "this")
        @AfterEach
        void tear_down(){
                team_red = null;
                team_blue = null;
                spectators = null;
        }

        @Test
        void test_team_1(){
                assertEquals(
                        (
                                "1. Horn" + System.lineSeparator() +
                                "2. Kimmich" + System.lineSeparator() +
                                "3. Hummels" + System.lineSeparator() +
                                "4. Lewandoski" + System.lineSeparator() +
                                "5. Modeste"
                        ),
                        team.toString());
        }
        @Test
        void test_team_2(){
                assertEquals(
                        (
                                "1. Player-red-1" + System.lineSeparator() +
                                "2. Player-red-2" + System.lineSeparator() +
                                "3. Player-red-3" + System.lineSeparator() +
                                "4. Player-red-4" + System.lineSeparator() +
                                "5. Player-red-5"
                        ),
                        team_red.toString());
                assertEquals(
                        (
                                "1. Player-blue-1" + System.lineSeparator() +
                                "2. Player-blue-2" + System.lineSeparator() +
                                "3. Player-blue-3" + System.lineSeparator() +
                                "4. Player-blue-4" + System.lineSeparator() +
                                "5. Player-blue-5"
                        ),
                        team_blue.toString());

        }

        @Test
        void test_team_salary(){
                assertEquals(150000, team_red.total_salary());
                assertEquals(300000, team_blue.total_salary());
        }

        @Test
        void test_spectators(){
                assertEquals("Spectator-1", spectators[0].toString());
        }

}
