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

package main.eidp.ss22.bib;

/*
 * Created by 0x1nbetw33n on 06/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal", "unused"})
public abstract class Media {

    private static int objectCounter = 1;
    private String title;
    private int id;
    private User owner;

    public Media(String title){this.title = title;}

    public abstract String signature();

    public int getID(){return id;}

    public void setOwner(User owner) {this.owner = owner;}

    public User getOwner() {return this.owner;}

}