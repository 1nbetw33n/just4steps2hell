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

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Student extends Person{

    private final String name;
    private final String surname;


    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public @NotNull String toString() {
        return getName() + " " + getSurname();
    }
}