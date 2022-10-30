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

package eidp.ws19.ex5;

/*
 * Created by 0x1nbetw33n on 29/10/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public final class Date {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public Date(int year, int month, int day, int hour, int minute){
        if (!((1600 <= year && year <= 3000) || (1 <= month && month <= 12) || (1 <= day && day <= 31) || (0 <= hour && hour <= 23) || (0 <= minute && minute <= 59))){
            throw new IllegalArgumentException("Invalid date");
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
            this.hour = hour;
            this.minute = minute;
        }
    }

    public boolean is_leap_year(){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void print_date(){
        System.out.println(year +"\t" + month +"\t" + day +"\t" +hour +"\t" +minute + "\n");
    }

    public boolean compare_date(@NotNull Date date){
        return (year == date.year && month == date.month && day == date.day && hour == date.hour && minute == date.minute);
    }

    public void extend_date(int added_minutes) {
        if (!(0 <= added_minutes && added_minutes <= 40000)) {
            throw new IllegalArgumentException("Invalid minutes");
        } else {
            minute += added_minutes;
            while(minute >= 60) {
                minute -= 60;
                hour++;
            }
            while (hour >= 24) {
                hour -= 24;
                day++;
            }
            while (true) {
                if (month == 2) {
                    if (is_leap_year()) {
                        if (day > 29) {
                            day -= 29;
                            month++;
                        } else {
                            break;
                        }
                    } else {
                        if (day > 28) {
                            day -= 28;
                            month++;
                        } else {
                            break;
                        }
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        day -= 30;
                        month++;
                    } else {
                        break;
                    }
                } else {
                    if (day > 31) {
                        day -= 31;
                        month++;
                    } else {
                        break;
                    }
                }
            }
            while (month > 12) {
                month -= 12;
                year++;
            }
            if (year >= 3000) {
                throw new IllegalArgumentException("year overflow");
            }
        }
    }

}


