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
/*
1nbetw33n
15.Oct.2021
*/

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static main.misc.util.file2List;
import static main.misc.util.showMatches;

public class IngredientChecker {
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 1L;
    public static List<String> BLACKLIST;

    /*
    this block will always be executed before any method call
     */
    static {
        try {
            //blacklist.txt -> BLACKLIST as List<String>
            BLACKLIST = file2List("src/test/resources/blacklist.txt")
                    .stream()
                    //removes the first 5 lines from the blacklist, since these are only comments
                    .skip(5)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(showMatches("src/test/resources/ingredients.txt", BLACKLIST));
       // BLACKLIST.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

}