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
 * Created by 0x1nbetw33n on 30/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public final class util {

    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    public static void println(final String text){
        System.out.println("\t" + text);
    }

    public static void print_list(final List<?> list){
        list.forEach(System.out::println);
    }

    public static void print_green(final String text) {
        System.out.println("\t" + GREEN + text + RESET);
    }

    public static void print_red(final String text) {
        System.out.println("\t" + RED + text + RESET);
    }

    public static void all_tests_passed(){
        System.out.println(GREEN + "\n\n\t\uD83D\uDCD7\tall tests passed!:)\t\uD83D\uDCD7\n" + RESET);
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    public static @NotNull List<? extends String> file2List(@NotNull final String PATH) throws IOException {
        @SuppressWarnings("resource")
        List<? extends String> list = Files
                .lines(Paths.get(PATH))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        //removes empty lines
        list.removeAll(Collections.singleton(""));
        return list;
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    public static @NotNull List<? extends String> file2List(@NotNull final String path, final int skip_lines) throws IOException {
        @SuppressWarnings("resource")
        List<? extends String> list = Files
                .lines(Paths.get(path))
                .skip(skip_lines)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        //removes empty lines
        list.removeAll(Collections.singleton(""));
        return list;
    }

    /*
    gets the path of the file, that contains the keywords we want to search for
    - then using file2List()
    - then checks for each keyword if the keyword has a match on BLACKLIST
    IF a string in TXT is on BLACKLIST, then it is added to matches
    RETURNS a list with all the strings that got a match OR a list containing only the string  'safe to use:)' if there are no matching strings
     */
    public static @NotNull List<? super String> showMatches(@NotNull final String TXT, @NotNull final List<? extends String> BLACKLIST) throws IOException {
        List<? super String> matches = new ArrayList<>();
        List<? extends String> ingredients = file2List(TXT);
        for (String ingredient : ingredients) {
            if (BLACKLIST.stream().anyMatch(ingredient::contentEquals)){
                matches.add(ingredient);
            }
        }
        matches.forEach(System.out::println);
        return matches.isEmpty() ? new ArrayList<>(Collections.singleton("safe to use:)")) : matches;
    }

    //read content of csv file into a list of ints with newline as separator
    public static List<? super Integer> csv2list(final String path, final String regex) throws IOException {
        List<? super Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(regex);
            for (String value : values) {
                list.add(Integer.parseInt(value));
            }
        }
        return list;
    }



}