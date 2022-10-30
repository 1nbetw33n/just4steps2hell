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
 * Created by 0x1nbetw33n on 08/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeMatrixIterator<T> implements Iterator<T> {

    private final T[][] snakeMatrix;
    private int j, i;

    public SnakeMatrixIterator(@NotNull T[][] snakeMatrix) {this.snakeMatrix = snakeMatrix;}

    public boolean hasNext() {
        return i < snakeMatrix[0].length;
    }

    public T next() {
        if (!hasNext()){throw new NoSuchElementException();}
        //EVEN ROWs
        if ((i % 2) == 0){
            //FIRST TO PENULTIMATE INDEX
            if (j < snakeMatrix.length - 1){return snakeMatrix[i][j++];}
            //LAST INDEX
            else {return snakeMatrix[i++][j];}
        }
        //ODD ROws
        else{
            //LAST INDEX TO SECOND INDEX
            if (j > 0){return snakeMatrix[i][j--];}
            //FIRST INDEX
            else{return snakeMatrix[i++][j];}
        }
    }

    public static void main(String[] args){
        Integer[][] snakeMatrix = new Integer[][]{
                                                                                {1, 2, 3},
                                                                                {4, 5, 6},
                                                                                {7, 8, 9}
                                                                                };
        SnakeMatrixIterator<Integer> snakeMatrixIterator = new SnakeMatrixIterator<>(snakeMatrix);
        while(snakeMatrixIterator.hasNext()){
            System.out.println(snakeMatrixIterator.next());
        }
    }

}
