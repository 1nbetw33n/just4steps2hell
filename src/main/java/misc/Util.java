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
import java.util.stream.Stream;

@SuppressWarnings("unused")
public final class Util {

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

    /**
     Same stuff as System.out.println() but with shorter name
     * @param text the text to be printed
     */
    public static void println(final Object text){
        System.out.println("\t" + text);
    }

    /**
     Brief method to print an iterable elementwise
     * @param iterable the iterable to be printed (the iterable can be of any type)
     */
    public static void print_iterable(final @NotNull Iterable<?> iterable){
        iterable.forEach(System.out::println);
    }

    /**
     Same stuff as println() but with green color
     * @param text the text to be printed
     */
    public static void print_green(final Object text) {
        System.out.println("\t" + GREEN_BOLD_BRIGHT + text + RESET);
    }

    /**
     Same stuff as println() but with red color
     * @param text the text to be printed (can be anything)
     */
    public static void print_red(final Object text) {
        System.out.println("\t" + RED_BOLD_BRIGHT + text + RESET);
    }

    /**
     Simply prints a message saying {@code "all tests passed"}
     */
    public static void all_tests_passed(){
        System.out.println(GREEN_BOLD_BRIGHT + "\n\n\t\uD83D\uDCD7\tall tests passed!:)\t\uD83D\uDCD7\n" + RESET);
    }

    /**
     Reads a file (e.g. a text file) and returns a list of strings with each string representing a line in the file
     * @param path the path to the file
     * @return the content of the file as a list of strings
     * @throws IOException if the file is not found
     */
    public static @NotNull List<? extends String> file2List(@NotNull final String path) throws IOException {
        try (Stream<? extends String> lines = Files.lines(Paths.get(path))) {
            return lines
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     Reads a file (e.g. a text file) and returns a list of strings with each string representing a line in the file
     * @param path the path to the file
     * @param skip_lines the number of lines to skip at the beginning of the file
     * @return the content of the file as a list of strings
     * @throws IOException if the file is not found
     */
    public static @NotNull List<? extends String> file2List(@NotNull final String path, final int skip_lines) throws IOException {
        try (Stream<? extends String> lines = Files.lines(Paths.get(path))) {
            return lines
                    .skip(skip_lines)
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     Gets the path of the file, that contains the keywords we want to search for.
     * <ul>
     *     <li>(1) then calling file2List()</li>
     *     <li>(2) then checks for each keyword if the keyword has a match on blacklist</li>
     * </ul>
     * IF a string in the file is on blacklist, then it is added to matches.
     * <p>
     * @param path path to the file that contains the ingredients
     * @param blacklist list of keywords we want to filter the ingredients for
     * @return
     * <ul>
     *     <li>(1) a list with all the strings that got a match</li>
     *     <p></p>
     *     OR
     *     <p></p>
     *     <li>(2) a list containing only the string  'safe to use:)' if there are no matching strings</li>
     * </ul>
     * @throws IOException if the file is not found
     */
    public static @NotNull Iterable<? super String> showMatches(@NotNull final String path, @NotNull final List<? extends String> blacklist) throws IOException {
        List<? super String> matches = new ArrayList<>();
        Iterable<? extends String> ingredients = file2List(path);
        for (String ingredient : ingredients) {
            if (blacklist.stream().anyMatch(ingredient::contentEquals)){
                matches.add(ingredient);
            }
        }
        return matches.isEmpty() ? new ArrayList<>(Collections.singleton("safe to use:)")) : matches;
    }

    /**
     Reads the content of a csv file into a list of strings.
     * @param path path to the file that contains the ingredients
     * @param regex regex that is used to split the strings
     *              <p>(ex. "," or "\n" or ... for csv files)
     * @return a List of Integers from the csv file
     * @throws IOException if the file is not found
     */
    public static @NotNull Iterable<? super Integer> csv2list(final @NotNull String path, final @NotNull String regex) throws IOException {
        List<? super Integer> list = new ArrayList<>();
        var br = new BufferedReader(new FileReader(path));
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