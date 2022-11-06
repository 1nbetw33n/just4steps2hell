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

package eidp.ws19.ex4;

/*
 * Created by 0x1nbetw33n on 10/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

public class Substring {

	/**
	 * Returns the substring of a string from position of param c (exclusive) to the end of the string (inclusive).
	 * @param c the character to start the substring from
	 * @param s the string to get the substring from
	 * @throws IllegalArgumentException if c is not in s
	 */
	@SuppressWarnings("SameParameterValue")
	static void get_sub_string(char c, @NotNull String s){
		if (s.contains(String.valueOf(c))){
			System.out.println(s.substring(s.indexOf(c + 1)));
		} else {
			throw new IllegalArgumentException("no such character!");
		}
	}

	public static void main(String[] args) {
		get_sub_string('s', "durstiger");
	}
}