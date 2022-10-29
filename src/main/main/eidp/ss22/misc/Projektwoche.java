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

package main.eidp.ss22.misc;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class Projektwoche {

    private String name;
    private Person projektleitung;
    private int maxParticipants;
    private boolean intern;

    public Projektwoche(String name, Person projektleitung){
        this.name = name;
        this.projektleitung = projektleitung;
    }

    public Projektwoche(String name, Person projektleitung, int maxParticipants, boolean intern){
        this(name, projektleitung);
        this.maxParticipants = maxParticipants;
        this.intern = intern;
    }

    protected void setMaxParticipants(int maxParticipants){this.maxParticipants = maxParticipants;}

    protected void setIntern(boolean intern){this.intern = intern;}

    protected boolean checkIfBigEnough(int NoOfStudents){return this.maxParticipants <= NoOfStudents;}

    public String toString(){return this.name + " | " + this.projektleitung;}

}
