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

public abstract class Saege implements Bearbeiten{

	private String name;


	public void saegen(Baumstamm stamm, double laenge) {
		System.out.println(stamm.getName() + " " + laenge + " m " + "saegen mit " + this.getName());
		stamm.kuerzen(laenge);
	}

	public String getName(){return name;}

	public void setName(String name){this.name = name;}

}
