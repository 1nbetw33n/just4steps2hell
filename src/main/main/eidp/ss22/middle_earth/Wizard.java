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

@SuppressWarnings("unused")
public class Wizard extends Entity{

    public Wizard(String name, int age) {super(name, age);}

    public boolean alive() {return true;}

    public String greet() {return "Hail!";}

    public void getsWounded(int damage) {System.out.println("Wounding an immortal entity is pointless since they're immortal! ^.^");}

    public void heals(Hobbit hobbit){
        if (hobbit.alive()){hobbit.resetMaxAge();}
        else{throw new IllegalStateException("This Hobbit already died! Not even a wizard can resurrect them anymore.");}
    }

    public String toString() {return getName() + " | " + getAge() + " | lives forever";}

}