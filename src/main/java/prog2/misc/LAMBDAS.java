
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

package prog2.misc;

/*
 * Created by 0x1nbetw33n on 10/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.*;
import java.util.function.Predicate;

@SuppressWarnings({"SameParameterValue", "unused", "MismatchedReadAndWriteOfArray"})
public class LAMBDAS{

    static int ggT(int no1, int no2){
        int max = Math.max(no1, no2);
        int min = Math.min(no1, no2);
        int remainder;
        while (min > 0 ){
            remainder = Math.max(min, max) % Math.min(min, max);
            max = Math.min(min, max);
            min = remainder;
        }
        return max;
    }

    static boolean isPrime(int possiblePrime){
        for (int i = 2; i < possiblePrime; i++) {
            if(ggT(possiblePrime, i) != 1){
                return false;
            }
        }
        return true;
    }

    static void printPrimes(List<? extends Integer> list){
        list.stream().filter(LAMBDAS::isPrime).forEach(System.out::println);
    }

    static void printNotPrimes(List<? extends Integer> list){
        list.stream().filter(((Predicate<Integer>) LAMBDAS::isPrime).negate()).forEach(System.out::println);
    }

    static void greet(List<? super String> list){
        list.forEach(name -> System.out.println("hello " + name));
    }

    //copy datastructure from source to target
    static <T> void copyDatastructure(List<? extends T> source, List<? super T> target){
        target.addAll(source);
    }

    static void copyLighterThan(List<? extends Portable> source, List<? super Portable> target, double threshold){
        for (Portable portable : source) {
            if(portable.getWeight() < threshold){target.add(portable);}
        }
    }

    public static void main(String[] args) {

        Integer[] ints = new Integer[100];
        for (int i = 0; i < ints.length; i++){
            ints[i] = i + 1;
        }
        printPrimes(Arrays.asList(ints));
        printNotPrimes(Arrays.asList(ints));

        List<? super String> names = Arrays.asList("purp", "pinq", "cyan");
        greet(names);

        Map<? super String, ? super Integer> data = new HashMap<>();
        data.put("purp", 932);
        data.put("pinq", 23);
        data.put("cyan", 523);
        data.forEach((name, no) -> System.out.println(name + " | "  + no));

        Pen pen = new Pen();
        pen.setWeight(10.);
        Cup cup = new Cup();
        cup.setWeight(100.);


        List<? extends Portable> src = Arrays.asList(pen, cup);
        List<? super Portable> dst = new ArrayList<>();

        copyLighterThan(src, dst, 20.);
        System.out.println(dst.size());
        Object result = dst.get(0);

        Integer[] source = {1, 2, 3, 4};
        Integer[] target = new Integer[4];
        List<? extends Integer> intList1 = Arrays.asList(source);
        List<? extends Integer> intList2 = Arrays.asList(target);


        //copyDatastructure(intList1, intList2);

       intList2.forEach(System.out::println);


    }




}

