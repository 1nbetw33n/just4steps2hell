/*
 *
 * 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 *
 * I dont give a fuck about copyright - this code is free to use for everybody - EXCEPTION:
 *     - entities that support:
 *         > queer hostility
 *         > any kind of religion
 *         > authoritarianism
 *         > sexism
 *         > racism
 *         > ableism
 *     - (most) boomer
 *     - conservatives
 *     - nazis
 *     - TERFs
 *     - TWERFs
 *     - SWERFs
 *
 * -will be extended if necessary-
 */

package main.eidp.ws19.ex5;

/*
 * Created by 0x1nbetw33n on 29/10/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

@SuppressWarnings("unused")
final class Date{

    int year;
    int month;
    int day;
    int hour;
    int minute;

    Date(int year, int month, int day, int hour, int minute){
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

    boolean is_leap_year(){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    void print_date(){
        System.out.println(year +"\t" + month +"\t" + day +"\t" +hour +"\t" +minute + "\n");
    }

    void extend_date(int new_minute) {
        if (!(0 <= new_minute && new_minute <= 40000)) {
            throw new IllegalArgumentException("Invalid minutes");
        } else {
            minute += new_minute;
            while(minute >= 60) {
                minute -= 60;
                hour++;
            }
            while (hour >= 24) {
                hour -= 24;
                day++;
            }
            while (day >= 31) {
                day -= 31;
                month++;
            }
            while (month >= 12) {
                month -= 12;
                year++;
            }
            if (year >= 3000) {
                throw new IllegalArgumentException("year overflow");
            }
        }

    }
}


