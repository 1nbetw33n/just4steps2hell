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

package eidp.ws19.ex7;

/*
 * Created by 0x1nbetw33n on 11/09/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import misc.Util;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static misc.Util.all_tests_passed;

final class exercise7{

    private static int count_occurrences(final int @NotNull [] slice, final int n){
        int count  = 0;
        for(int i: slice){
            if(i == n){
                count++;
            }
        }
        return count;
    }

    private static int[] get_reverse_slice(final int @NotNull [] slice) {
        final int LEN = slice.length;
        int[] reverse_slice = new int[LEN];
        for(int i = 0; i < LEN; i++){
            reverse_slice[i] = slice[LEN - i - 1];
        }
        return reverse_slice;
    }

    private static void reverse_slice(final int @NotNull [] slice){
        for(int i = 0, tmp, len = slice.length; i < len / 2; i++){
            tmp = slice[i];
            slice[i] = slice[len - i - 1];
            slice[len - i - 1] = tmp;
        }
    }

    private static int[] concat_slices(final int @NotNull [] slice1, final int @NotNull [] slice2){
        final int LEN_1 = slice1.length;
        final int LEN_2 = slice2.length;
        final int LEN_C = LEN_1 + LEN_2;
        final int[] concat = new int[LEN_C];
        for(int i = 0, j = 0, k = 0; i < LEN_C; i++){
            if(i < LEN_1) {concat[i] = slice1[j++];} else {concat[i] = slice2[k++];}
        }
        return concat;
    }

    @SuppressWarnings({"ImplicitArrayToString", "ConstantConditions", "NewObjectEquality"})
    public static void main(String[] args){
        int[] slice = {1, 2, 2, 4, 3, 2};
        assert count_occurrences(slice, 2) == 3;
        assert count_occurrences(slice, 1) == 1;
        assert count_occurrences(slice, 3) == 1;
        assert count_occurrences(slice, 4) == 1;
        assert count_occurrences(slice, 5) == 0;
        final int[] reverse_slice = get_reverse_slice(slice);
        assert Arrays.equals(reverse_slice, new int[]{2, 3, 4, 2, 2, 1});
        assert !Arrays.equals(reverse_slice, new int[]{2, 3, 4, 3, 2, 1});
        reverse_slice(slice);
        assert Arrays.equals(slice, new int[]{2, 3, 4, 2, 2, 1});
        final int[] slice1 = {1, 2, 3};
        final int[] slice2 = {4, 5, 6};
        final int[] concat = concat_slices(slice1, slice2);
        assert Arrays.equals(concat, new int[]{1, 2, 3, 4, 5, 6});
        all_tests_passed();

        //proof that I can mutate the contents of an object that references a collection of objects, but not the reference itself
        final int[] a= new int[]{1, 2, 3, 4, 5, 6};
        final int[] b= new int[]{1, 2, 3, 4, 5, 7};
        assert a != b;
        assert !Arrays.equals(a, b);
        Util.println("\ta:\t" + Arrays.toString(a));
        Util.println("\tb:\t" + Arrays.toString(b));
        Util.println("reference a:\t" + a.toString());
        Util.println("reference b:\t" + b.toString());
        System.arraycopy(b, 0, a, 0, a.length);
        assert Arrays.equals(a, b);
        assert a != b;
        Util.print_red("proof that I can mutate the contents of a final assigned array, but not the reference");
        Util.print_red("\ta:\t" + Arrays.toString(a));
        Util.print_red("\tb:\t" + Arrays.toString(b));
        Util.println("reference a:\t" + a.toString());
        Util.println("reference b:\t" + b.toString());
    }

}