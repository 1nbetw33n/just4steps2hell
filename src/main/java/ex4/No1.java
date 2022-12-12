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

public class No1 {

    /**
     * Hidden constructor, because this is a utility class and shall not be instantiated.
     */
    @Contract(value = " -> fail", pure = true)
    private No1() {
        throw new IllegalStateException("Utility class");
    }

    @Contract(pure = true)
    static int @NotNull [] createStaticArray(){
        int[] staticIntArray = new int[10];
        for (int i = 0; i < staticIntArray.length; i++){
            staticIntArray[i] = i +1;
        }
        return staticIntArray;
    }

    static void printIntArray(int @NotNull [] array){
        for(int integer : array){
            System.out.println(integer);
        }
    }

    static void testCreateStaticArray(){
        printIntArray(createStaticArray());
    }

    public static void main(String[] args){
        testCreateStaticArray();
    }

}
