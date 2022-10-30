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

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Member {

    private static int memberNoCounter;
    private static double membershipFee = 90;
    private final String name;
    private final int memberNo;
    private final List<Kurs> kursList = new ArrayList<>();

    public Member(String name){
        this.name = name;
        this.memberNo = memberNoCounter++;
    }

    @SuppressWarnings("unused")
    protected void setMembershipFee(double membershipFee){Member.membershipFee = membershipFee;}

    @SuppressWarnings("unused")
    protected int getNoOfKurses(){return kursList.size();}

    @SuppressWarnings("unused")
    protected double getTotalFee(){return membershipFee + kursList.stream().mapToDouble(Kurs::getPrice).sum();}

    @SuppressWarnings("unused")
    protected void buchen(@NotNull Kurs kurs){
        this.kursList.add(kurs);
        kurs.anmelden(this);
    }

    public @NotNull String toString(){return this.name + " | " + this.memberNo;}

}
