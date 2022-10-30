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

//
//created by 0x1nbetw33n on 29/05/2022
//

package eidp.ws19.admission_tests.saegewerk3;

public abstract class Baumstamm {

	private double laenge;
	private String name;

	public Baumstamm(double laenge) {this.laenge = laenge;}

	void kuerzen(double laenge){this.laenge -= laenge;}

	abstract double gewicht();

	public double getLaenge(){return laenge;}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}
}