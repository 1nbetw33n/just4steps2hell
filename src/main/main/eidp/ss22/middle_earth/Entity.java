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

package main.eidp.ss22.middle_earth;

/*
 * Created by 0x1nbetw33n on 07/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

@SuppressWarnings({"unused"})
public abstract class Entity {

    private String name;
    private final int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract boolean alive();

    public abstract String greet();

    public abstract void getsWounded(int damage);

    public void status() {System.out.println(this + " | is alive: " +  alive());}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public int getAge(){return age;}

    public abstract String toString();
}