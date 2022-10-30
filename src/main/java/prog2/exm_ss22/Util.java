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

package prog2.exm_ss22;

/*
 * Created by 0x1nbetw33n on 21/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Collections.*;

public class Util {

    public static <T> int numElementesInCollection(Collection<T> c, T t){
        int count = 0;
        for (T e : c) {
            if (e.equals(t)) {
                count++;
            }
        }
        return count;
    }

    public static <T> void sCopy(Schlange<? extends T> src, Schlange<? super T> dst){
        dst.addAll(src);
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    public static void main(String[] args) {
        var s1 = new Student("Anton", "Aurich", 111111);
        var s2 = new Student("Anton", "Aurich", 111111);
        var s3 = s1;
        var students = new Student[]{s1, s2, s3};
        Collection<Person> col2  = new ArrayList<>();
        addAll(col2, students);
        System.out.println("Col enthält " + s1 + " " +Util.numElementesInCollection(col2, s1) + " mal.\n");
    }

}