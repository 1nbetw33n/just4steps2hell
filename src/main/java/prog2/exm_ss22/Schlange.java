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

package prog2.exm_ss22;

/*
 * Created by 0x1nbetw33n on 21/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.Vector;

public class Schlange<E> extends Vector<E> {

    public boolean isEmpty() {
        return size() == 0;
    }

    @SuppressWarnings("unused")
    E peek() {
        if (isEmpty()) {throw new ArrayIndexOutOfBoundsException();
        } else {return get(0);}
    }

    public E remove() {
        if (isEmpty()) {throw new ArrayIndexOutOfBoundsException();
        } else {return remove(0);}
    }

    @SuppressWarnings("UnusedReturnValue")
    public E insert(E item) {
        add(item);
        return item;
    }

    public static void main(String[] args) {
        Schlange<Integer> sch = new Schlange<>();
        int[] ints = new int[]{8, 3, 9, 2, 5, 1, 8};
        for (int i : ints){
            sch.insert(i);
        }
        System.out.println("\nremoved  ");
        while (!sch.isEmpty()) {
            System.out.print(sch.remove() + " ");
        }
        System.out.println("\n");
    }

}