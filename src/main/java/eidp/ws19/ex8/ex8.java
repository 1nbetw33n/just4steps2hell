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
 *     - TERFs
 *     - TWERFs
 *     - SWERFs
 *
 * -will be extended if necessary-
 */

package eidp.ws19.ex8;

/*
 * Created by 0x1nbetw33n on 25/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class ex8 {

	static Double calc_regular_chain_fraction(final Double[] A, int i){
		//noinspection LoopStatementThatDoesntLoop
		while (i < A.length) {
			return A[i] + (1 / calc_regular_chain_fraction(A, ++i));
		}
		return 0.;
	}
	static Double calc_chain_fraction(final Double[] A, int i){
		//noinspection LoopStatementThatDoesntLoop
		while (i < A.length) {
			return A[i] + (i  / calc_chain_fraction(A, ++i));
		}
		return 0.;
	}

	public static void main(String[] args) {
		System.out.println(calc_regular_chain_fraction(new Double[]{1., 2., 3., 4., 5., 6., 7., 8., 9., 10.}, 0));
		System.out.println(calc_chain_fraction(new Double[]{1., 2., 3., 4., 5., 6., 7., 8., 9., 10.}, 0));
		System.out.println(calc_chain_fraction(new Double[]{10., 9., 8., 7., 6., 5., 4., 3., 2., 1.}, 0));
	}
}