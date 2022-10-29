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

package main.misc;

public class InfinityLoop {

    @SuppressWarnings("InfiniteLoopStatement")
    static void initLoop(){
        long x = 1;
        while(true){
            x *= x * Math.negateExact(x);
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        initLoop();
    }
}
