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

package advent_of_code;

/*
 * Created by 0x1nbetw33n on 10/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

@SuppressWarnings("SameParameterValue")
public
class Submarine {

    public int x;
    public int y;

    public Submarine(){
        this.x = 0;
        this.y = 0;
    }

    public void forward(int x) {this.x += x;}

    public void down(int y){this.y += y;}

    public void up(int y){this.y -= y;}
}