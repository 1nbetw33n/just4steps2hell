package main.misc;

import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static misc.IngredientChecker.BLACKLIST;
import static misc.util.file2List;
import static misc.util.showMatches;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 29/10/2021
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class IngredientCheckerTest {

	private @Nullable String ingredients0;
	private @Nullable String ingredients1;
	private @Nullable String ingredients2;
	private @Nullable String olaplex5;
	private @Nullable List<? super String> referenceList;

	@BeforeEach
	void setUp() {
		ingredients0 = "src/test/resources/ingredient_checker/ingredientsTest0_file2List.txt";
		ingredients1 = "src/test/resources/ingredient_checker/ingredientsTest1_file2List.txt";
		ingredients2 = "src/test/resources/ingredient_checker/ingredientsTest2_file2List.txt";
		olaplex5 = "src/test/resources/ingredient_checker/OLAPLEX5.txt";
		referenceList = new ArrayList<>();
		referenceList.add("aplha");
		referenceList.add("beta");
		referenceList.add("gamma");
		referenceList.add("delat");
	}

	@AfterEach
	void tearDown() {
		ingredients0 = null;
		ingredients1 = null;
		ingredients2 = null;
		olaplex5 = null;
		referenceList = null;
	}


	@Test
	@DisplayName("checks if file content is converted correctly into a list")
	void file2ListTest() throws IOException {
		assertEquals(referenceList, file2List(Objects.requireNonNull(ingredients0)));
	}

	@Test
	@DisplayName("positive checks if any ingredient is on the blacklist")
	void checkProductPositiveTest() throws IOException {
		//there should be hits for "methylparabene", "bisaminopropyl dimethicone","isopropanol"
		assertEquals(Arrays.asList("methylparabene", "bisaminopropyl dimethicone","isopropanol"), showMatches(Objects.requireNonNull(ingredients1), BLACKLIST));
	}

	@Test
	@DisplayName("checks with a real product")
	void checkOlaplex5() throws IOException {
		//there should be hits for "cetyl esters", "isododecane", "quaternium-95", "peg-8", "c11-15 pareth-7", "amodimethicone", "c12-13 pareth-23", "c12-13 pareth-3", "laureth-9", "phenoxyethanol"
		assertEquals(Arrays.asList("cetyl esters", "isododecane", "quaternium-95", "peg-8", "c11-15 pareth-7", "amodimethicone", "c12-13 pareth-23", "c12-13 pareth-3", "laureth-9", "phenoxyethanol"), showMatches(Objects.requireNonNull(olaplex5), BLACKLIST));
	}

	@Test
	@DisplayName("false checks if any ingredient is on the blacklist")
	void checkProductFalseTest() throws IOException {
		//there should be no hits -> only 'safe to use:)' should be in the list
		assertEquals(showMatches(Objects.requireNonNull(ingredients2), BLACKLIST), new ArrayList<>(Collections.singleton("safe to use:)")));
	}

}