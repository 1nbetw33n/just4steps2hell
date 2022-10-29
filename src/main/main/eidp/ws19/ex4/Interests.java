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

package main.eidp.ws19.ex4;

/*
 * Created by 0x1nbetw33n on 10/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import static java.lang.Math.pow;

public class Interests {

	/*
	k0 = initial investment
	p = interest rate
	n = number of years
	m = number of interests / year
	 */
	static void calc_interest(double k0, double p, double n, double m){
		double i = p/100;
		System.out.println(k0 * (1. + i * n));
		System.out.println(k0 * pow(1. + i, n ));
		System.out.println(k0 * pow((1. + i/m), (m * n)));
	}

	public static void main(String[] args){
		double k0 = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double m = Double.parseDouble(args[3]);
		calc_interest(k0, p, n, m);
	}

}