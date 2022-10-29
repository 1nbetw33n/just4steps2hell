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


package main.c.ex4;

/*
 * Created by 0x1nbetw33n on 13/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class No5 {

    private static final List<? super Character> FILTER_LIST;
    private static final String filterString = "abcdefghijklmnopqrstuvwxyz0123456789";

    static{FILTER_LIST = filterString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());}

    @SuppressWarnings("SameParameterValue")
    static void countOccurrences(@NotNull String text, List< ? super Character> filterList){
        int unknownCharactersCount = 0;
        HashMap<? super Character, ? super Integer> matches = new HashMap<>();
        List<? extends Character> textAsList = text.chars().mapToObj(c -> (char) c).toList();
    for (Character c : textAsList) {
        if (filterList.contains(c)) {
            if (matches.containsKey(c)) {matches.put(c, ((int) matches.get(c)) + 1);}
            else {matches.put(c, 1);}
        } else {
            if(c != ' '){unknownCharactersCount++;}}
    }
    matches.forEach((key, value) -> System.out.println(key + ": " + value + "\n"));
    System.out.println("unknown characters: " + unknownCharactersCount);
    }

    public static void main(String[] args) {
        String text1 = "Hello World!";
        countOccurrences(text1, FILTER_LIST);
    }

}