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

package eidp.ws19.ex3;

/*
 * Created by 0x1nbetw33n on 09/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class Parity_Bit {

	static boolean parity_bit_is_valid(int no){
		int count = 0;
		while(no > 0){
			count += no & 1;
			no >>= 1;
		}
		return count % 2 == 0;
	}

	public static void main(String[] args){
		System.out.println(parity_bit_is_valid(24));
		System.out.println(parity_bit_is_valid(29));
		System.out.println(parity_bit_is_valid(31));
	}
}