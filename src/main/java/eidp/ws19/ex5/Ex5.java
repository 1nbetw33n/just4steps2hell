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

package eidp.ws19.ex5;

/*
 * Created by 0x1nbetw33n on 26/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

@SuppressWarnings("unused")
class Ex5 {

	/**
	 * Swaps i and j
	 * @param i first number
	 * @param j second number
	 * @return swapped numbers
	 */
	@SuppressWarnings("unused")
	private static int[] swap (int i, int j){
		if( !(i < j)) {
			return new int[]{j, i};
		} else {
			return new int[]{i, j};
		}
	}

	/**
	 * Approximates pi
	 * @return approximated pi
	 */
	@SuppressWarnings("unused")
	private static double approx_for_pi_1(){
		var i = 0;
		var alter = 1;
		var res = 0.;
		while (i < 10000) {
			res += alter / (2. * i++ + 1.);
			alter *= -1;
		}
		return res;
	}

	/**
	 Performs the caesar cypher
	 * @param k	amount of characters shifted
	 * @param c character to be shifted
	 * @return shifted character
	 */
	private static char caesar_cypher(int k, char c){
		var ch = Character.isUpperCase(c) ? 'A' : 'a';
		if (Character.isAlphabetic(c)){
			return (char)(((c - ch + k) % 26) + ch);
		} else {
			throw new IllegalArgumentException("Invalid character");
		}
	}

	/**
	 * Performs the caesar cypher with a string
	 * @param k amount of characters shifted
	 * @param s string to be shifted
	 * @return shifted string
	 */
	@SuppressWarnings("SameParameterValue")
	private static @NotNull String caesar_encrypt(int k, @NotNull String s){
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char ch: c){
			sb.append(caesar_cypher(k, ch));
		}
		return sb.toString();
	}

	/**
	 * Calculates breading behaviour of rats
	 * @param n number of months
	 * @return number of rats
	 */
	private static int fucking_rats(int n){
		var rats = 2;
		while (n >0){
			rats *= 7;
			n -= 2;
		}
		return rats;
	}

	/**
	 * Counts the length of a chain
	 * @param chain chain to be counted
	 * @return length of the chain
	 */
	static int count_chain(@NotNull String chain){
		var longest = 0;
		var current = 1;
		for (int i = 1; i < chain.length(); i++){
			if(chain.charAt(i) == chain.charAt(i - 1)){
				current++;
			} else {
				if (current > longest){
					longest = current;
				}
				current = 1;
			}
		}
		return longest;
	}

	/**
	 * Calculates the longest chain
	 * @return longest chain
	 */
	static int longest_chain(){
		StringBuilder chain = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while (sc.hasNextInt()){
			chain.append(sc.nextInt());
		}
		return count_chain(chain.toString());
	}

	@SuppressWarnings("CommentedOutCode")
	public static void main(String[] args) {
        /*
        int i = 3;
        int j = 2;
        System.out.println("i = " + i + " j = " + j);
        Stream.<int[]>of(swap(i, j)).map(Arrays::toString).forEach(System.out::println);
        System.out.println(Arrays.toString(swap(i, j)));
        for (int k : swap(i, j)) {
            System.out.print(k + " ");
        }
        System.out.println(approx_for_pi_1());
        String s = "HALLO";
        System.out.println(caesar_cypher(1, 'H'));
        System.out.println(s);
        s = caesar_encrypt(1, s);
        System.out.println(s);
        System.out.println(fucking_rats(12));
        Date d = new Date(2018, 10, 7, 16, 30);
        Date d1 = new Date(2999, 12, 31, 23, 59);
        d.print_date();
        d.extend_date(30);
        d.print_date();
        d.extend_date(39999);
        d.print_date();
        d1.print_date();
        d1.extend_date(1);
         */
		System.out.println(longest_chain());
	}

}