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

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unused")
public class A2D<T> implements Iterable<T>{

   final int zeilen , spalten;
   final T[][] array;

   @SuppressWarnings("unchecked")
   public A2D(int zeilen, int spalten) {
       this.zeilen = zeilen;
       this.spalten = spalten;
       array = (T[][]) new Object[zeilen][spalten];
   }

   public void insert(T element, int zeile, int spalte) {
       array[zeile][spalte] = element;
   }

   public T get(int zeile, int spalte) {
       return array[zeile][spalte];
   }

   public Iterator<T> iterator() {
       return new A2DIterator();
   }

   private class A2DIterator implements Iterator<T> {

       private final OddIterator oddIterator;
       private final EvenIterator evenIterator;

       public A2DIterator() {
           oddIterator = new OddIterator();
           evenIterator = new EvenIterator();
       }

       public boolean hasNext() {
           return oddIterator.hasNext() || evenIterator.hasNext();
       }

       public T next() {
           if (!hasNext()) {
               throw new NoSuchElementException();
           } else {
                if (oddIterator.hasNext()) {
                     return oddIterator.next();
                } else {
                     return evenIterator.next();
                }
           }

       }

       private class OddIterator implements Iterator<T> {

           private int zeile = 1;
           private int spalte = 0;

           public boolean hasNext() {
               return zeile < zeilen;
           }

           @SuppressWarnings("DuplicatedCode")
           public T next() {
               if (!hasNext()){
                     throw new NoSuchElementException();
               } else{
                   if(spalte == spalten - 1 && zeile < zeilen - 1){
                       zeile += 2;
                       spalte = 0;
                   }
                   return array[zeile][spalte++];
               }
           }

       }

       private class EvenIterator implements Iterator<T> {

           private int zeile = 0;
           private int spalte = 0;

           public boolean hasNext() {
               return zeile < zeilen;
           }

           @SuppressWarnings("DuplicatedCode")
           public T next() {
               if (!hasNext()){
                   throw new NoSuchElementException();
               } else{
                   if(spalte == spalten - 1 && zeile < zeilen - 1){
                       zeile += 2;
                       spalte = 0;
                   }
                   return array[zeile][spalte++];
               }
           }

       }

   }


         



   public static void main(String[] args) {
        A2D<Integer> a2d = new A2D<>(3, 4);
        int[][] ints2d = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int z = 0; z < ints2d.length; z++) {
            for (int s = 0; s < ints2d[0].length; s++) {
                a2d.insert(ints2d[z][s], z, s);
            }
            System.out.println("a2D = " + a2d);
            System.out.println("Iterator liefert: ");
            for (Integer i : a2d) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}