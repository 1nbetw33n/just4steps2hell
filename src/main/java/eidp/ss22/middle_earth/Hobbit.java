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

package eidp.ss22.middle_earth;

/*
 * Created by 0x1nbetw33n on 07/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Hobbit extends Entity{

    private int maxAge = 150;

    public Hobbit(String name, int age) {
        super(name, age);
    }

    public boolean alive() {return getAge() - getMaxAge() < 0;}

    public @NotNull String greet() {return "Hallo!";}

    public void getsWounded(int damage) {
        setMaxAge(getMaxAge() - damage);
        if (getAge() < getMaxAge()){System.out.println("This damage just killed that hobbit!");}
        else {System.out.println("The remaining life expectancy is " + (getMaxAge() - getAge()));}
    }

    public int getMaxAge() {return maxAge;}
    public void setMaxAge(int age) {maxAge = age;}

    public void resetMaxAge() {maxAge = 150;}

    public @NotNull String toString() {return getName() + " | " + getAge() + " | " + getMaxAge();}
}