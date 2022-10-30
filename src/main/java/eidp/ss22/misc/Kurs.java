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

package eidp.ss22.misc;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class Kurs {

    private String name;
    private double price;
    private List<Member> memberList = new ArrayList<>();
    private static double totalAmountOfAllKurses;

    public Kurs(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected int getNumberOfMembers() {return this.memberList.size();}

    public double getPrice() {return this.price;}

    protected static double getTotalAmountOfAllKurses(){return totalAmountOfAllKurses;}

    public String toString() {return this.name;}

    public void anmelden(Member member) {
        this.memberList.add(member);
        totalAmountOfAllKurses += this.price;
    }
}
