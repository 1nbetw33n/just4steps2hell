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

package ex4;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Scanner;

public class No2 {

    /**
     * Hidden constructor, because this is a utility class and shall not be instantiated.
     */
    @Contract(value = " -> fail", pure = true)
    private No2() {
        throw new IllegalStateException("Utility class");
    }

    //EVERYTHING ALLOWED
    public static int @NotNull [] toBinaryString(int integer) throws Exception {
        if (integer < 0){
            throw new Exception("Outside of interval [0, infinity]");
        }
        int[] binaryString;
        LinkedList<? super Integer> bytes = new LinkedList<>();
        while(integer > 0){
            bytes.addFirst(integer % 2);
            integer /= 2;
        }
        binaryString = new int[bytes.size()];
        for (int i = 0; i < binaryString.length; i++){
            binaryString[i] = (int) bytes.removeFirst();
        }
        return binaryString;
    }

    //ARRAYS ONLY
    @Contract(pure = true)
    public static int @NotNull [] toBinaryString2(int integer) throws Exception {
        if (integer < 0){
            throw new Exception("Outside of interval [0, infinity]");
        }
        int[] bytes = new int[32];
        int[] binaryString;
        int zeroCounter;
        //DECIMAL -> BINARY (LEAST SIGNIFICANT BIT STORED AT LAST INDEX)
        for (int i = bytes.length - 1; true; i--){
            if(!(integer > 0)){
                zeroCounter = i +1;
                break;
            }
            bytes[i] = (integer % 2);
            integer /= 2;
        }
        binaryString = new int[bytes.length - zeroCounter];
        //REMOVING LEADING ZEROS
        for (int i = 0, j = zeroCounter; i < binaryString.length; i++, j++){
            binaryString[i] = bytes[j];
        }
        return binaryString;
    }

    static void testToBinaryString(int input) throws Exception {
        StringBuilder output = new StringBuilder();
        int[] binaryString= toBinaryString(input);
        for(int bit : binaryString){
           output.append(bit);
        }
       System.out.println(output);
    }

    static void testToBinaryString2(int input) throws Exception {
        StringBuilder output = new StringBuilder();
        int[] binaryString= toBinaryString2(input);
        for(int bit : binaryString){
            output.append(bit);
        }
        System.out.println(output);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int input = sc.nextInt();
        testToBinaryString(input);
        testToBinaryString2(input);
    }

}
