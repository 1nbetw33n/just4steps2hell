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

package misc;
/*
1nbetw33n
12.Apr.2022
*/


import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Fib_IterativeVsExplicit {

    /**
     * Hidden constructor, because this is a utility class and shall not be instantiated.
     */
    @Contract(value = " -> fail", pure = true)
    private Fib_IterativeVsExplicit() {
        throw new IllegalStateException("Utility class");
    }

    private static class
    FibException extends Exception{
        @Serial
        private static final long serialVersionUID = 1L;
        public FibException(){
            super("n needs to be equal or greater than 0");
        }
    }

@SuppressWarnings("UnusedReturnValue")
private static long fibIterative(int n) throws FibException {
    if (n < 0) {
        throw new FibException();
    } else {
        long fib0 = 0,
                fib1 = 1,
                fibN = 1;
        for (int i = 1; i < n; i++) {
            fibN = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibN;
        }
        return fibN;
    }
}

@SuppressWarnings("UnusedReturnValue")
private static @NotNull BigInteger fibIterativeBIG(int n) throws FibException {
    if(n < 0){
        throw new FibException();
    } else {
        BigInteger   fib0 = BigInteger.valueOf(0),
                            fib1 = BigInteger.valueOf(1),
                            fibN = BigInteger.valueOf(1);
        for (int i = 1; i < n; i++){
            fibN = fib0.add(fib1);
            fib0 = fib1;
            fib1 = fibN;
        }
        return fibN;
    }
}

    /*
            double firstTerm = 1 / Math.sqrt(5);
            double leftInnerTerm = (1 + Math.sqrt(5)) / 2;
            double rightInnerTerm = (1 - Math.sqrt(5)) / 2;
            double rightTerm = Math.pow(leftInnerTerm, n) - Math.pow(rightInnerTerm, n);
            return (long) (firstTerm * rightTerm);
*/
@SuppressWarnings("UnusedReturnValue")
private static long fibExplicit(int n) throws FibException {
    if(n < 0){
        throw new FibException();
    } else {
        return (long) (((1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n))));
    }
}

/*
        BigDecimal firstTerm = BigDecimal.valueOf(1 / Math.sqrt(5));
        BigDecimal leftInnerTerm = BigDecimal.valueOf((1 + Math.sqrt(5)) / 2);
        BigDecimal rightInnerTerm = BigDecimal.valueOf((1 - Math.sqrt(5)) / 2);
        BigDecimal rightTerm = leftInnerTerm.pow(n).subtract(rightInnerTerm.pow(n));
        return firstTerm.multiply(rightTerm).toBigInteger();
 */
@SuppressWarnings("UnusedReturnValue")
private static @NotNull BigInteger fibExplicitBIG(int n) throws FibException {
    if(n < 0){
        throw new FibException();
    } else {
        return BigDecimal.valueOf(1 / Math.sqrt(5)).multiply(BigDecimal.valueOf((1 + Math.sqrt(5)) / 2).pow(n).subtract(BigDecimal.valueOf((1 - Math.sqrt(5)) / 2).pow(n))).toBigInteger();
    }
}

    private static void iterativeVsExplicit(int n) throws FibException {
        long time0,
                time1 = 0,
                time2 = 0;
        for(int i = 0; i < 50; i++){
            time0 = System.nanoTime();
            fibIterative(n);
            time1 += System.nanoTime() - time0;
            time0 = System.nanoTime();
            fibExplicit(n);
            time2 += System.nanoTime() - time0;
        }
        System.out.println("iterative: " + time1 + " ns | explicit: " + time2 + " ns");
    }

private static void iterativeBIGVsExplicitBIG(int n) throws FibException {
    long time0,
            time1 = 0,
            time2 = 0;
    for(int i = 0; i < 50; i++){
        time0 = System.nanoTime();
        fibIterativeBIG(n);
        time1 += System.nanoTime() - time0;
        time0 = System.nanoTime();
        fibExplicitBIG(n);
        time2 += System.nanoTime() - time0;
    }
    System.out.println("iterativeBIG: " + time1 + " ns | explicitBIG: " + time2 + " ns");
}

    @SuppressWarnings("CommentedOutCode")
    public static void main(String[] args) throws Exception {
        int n = 39;
        iterativeVsExplicit(n);
        iterativeBIGVsExplicitBIG(n);
        //System.out.println(fibIterative(n));
        //System.out.println(fibExplicit(n));
        //System.out.println(fibIterativeBIG(n));
        //System.out.println(fibExplicitBIG(n));
    }
}
