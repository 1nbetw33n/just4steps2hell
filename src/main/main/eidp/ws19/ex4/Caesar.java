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

public class Caesar {

	@SuppressWarnings("SameParameterValue")
	private static void caesar_cypher(int k, char c){
		char ch = Character.isUpperCase(c) ? 'A' : 'a';
		if (Character.isAlphabetic(c)){
			System.out.print((char)(((c - ch + k) % 26) + ch));
		} else {
			throw new IllegalArgumentException("Invalid character");
		}
	}

	public static void main(String[] args) {
		caesar_cypher(5, 'X');
	}
}