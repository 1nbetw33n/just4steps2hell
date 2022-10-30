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

package eidp.ws19.admission_tests.saegewerk2;

public class Baumstamm {

	final private double laenge;
	final private double dicke;
	private double bruchfestigkeit;
	private double gewicht;


	public Baumstamm(double laenge, double dicke){
		this.laenge = laenge;
		this.dicke = dicke;
	}

	public double kuerzen(double laenge, double dicke){
		return laenge * dicke * getGewicht();
	}

	public double getLaenge(){return this.laenge;}

	public double getDicke(){return this.dicke;}

	public void setBruchfestigkeit(double bruchfestigkeit) {this.bruchfestigkeit = bruchfestigkeit;}

	public double getBruchfestigkeit() {return this.bruchfestigkeit;}

	public void setGewicht(double gewicht){this.gewicht = gewicht;}

	public double getGewicht() {return gewicht;}

}