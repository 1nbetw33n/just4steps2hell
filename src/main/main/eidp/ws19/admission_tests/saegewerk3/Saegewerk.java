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

package main.eidp.ws19.admission_tests.saegewerk3;

public class Saegewerk {


	public static void main(String[] args) {
		Saege stichsaege = new Stichsaege();
		Saege kettensaege = new Kettensaege();
		Baumstamm eiche = new Eichenstamm(5.);
		Baumstamm buche = new Buchenstamm(7.);
		stichsaege.saegen(eiche, 1.);
		kettensaege.saegen(buche, 2.);
		System.out.println("Eiche hat ein Restgewicht von " + eiche.gewicht());
		System.out.println("Eiche hat ein Restgewicht von " + buche.gewicht());
	}

}
