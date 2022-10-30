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

import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static ex4.No2.toBinaryString;
import static ex4.No2.toBinaryString2;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Created by 0x1nbetw33n on 27/05/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class No2Test {

	private int no1;
	private int no2;
	private int no3;
	private int no4;
	private int no5;
	private int @Nullable [] binaryString1;
	private int @Nullable [] binaryString2;
	private int @Nullable [] binaryString3;
	private int @Nullable [] binaryString4;
	private int @Nullable [] binaryString5;
	private int @Nullable [] intArray1;
	private int @Nullable [] intArray2;
	private int @Nullable [] intArray3;
	private int @Nullable [] intArray4;
	private int @Nullable [] intArray5;
	private @Nullable String expectedValue1;
	private @Nullable String expectedValue2;
	private @Nullable String expectedValue3;
	private @Nullable String expectedValue4;
	private @Nullable String expectedValue5;



	@BeforeEach
	void setUp() throws Exception {
		no1 = 17;
		no2 = 8;
		no3 = 32;
		no4 = 56;
		no5 = 35;
		expectedValue1 = "10001";
		expectedValue2 = "1000";
		expectedValue3 = "100000";
		expectedValue4 = "111000";
		expectedValue5 = "100011";
		binaryString1 = toBinaryString(no1);
		binaryString2 = toBinaryString(no2);
		binaryString3 = toBinaryString(no3);
		binaryString4 = toBinaryString(no4);
		binaryString5 = toBinaryString(no5);
		intArray1 = toBinaryString2(no1);
		intArray2 = toBinaryString2(no2);
		intArray3 = toBinaryString2(no3);
		intArray4 = toBinaryString2(no4);
		intArray5 = toBinaryString2(no5);
	}

	@AfterEach
	void tearDown(){
		no1 = 0;
		no2 = 0;
		no3 = 0;
		no4 = 0;
		no5 = 0;
		expectedValue1 = null;
		expectedValue2 = null;
		expectedValue3 = null;
		expectedValue4 = null;
		expectedValue5 = null;
		binaryString1 = null;
		binaryString2 = null;
		binaryString3 = null;
		binaryString4 = null;
		binaryString5 = null;
		intArray1 = null;
		intArray2 = null;
		intArray3 = null;
		intArray4 = null;
		intArray5 = null;
	}

	@Test
	@DisplayName("checks if the array contains the expected number as binary number in the correct order")
	void testToBinaryString1() {
		assertEquals(Arrays.toString((Objects.requireNonNull(expectedValue1)).toCharArray()), Arrays.toString(binaryString1));
		assertEquals(Arrays.toString((Objects.requireNonNull(expectedValue2)).toCharArray()), Arrays.toString(binaryString2));
		assertEquals(Arrays.toString((Objects.requireNonNull(expectedValue3)).toCharArray()), Arrays.toString(binaryString3));
		assertEquals(Arrays.toString((Objects.requireNonNull(expectedValue4)).toCharArray()), Arrays.toString(binaryString4));
		assertEquals(Arrays.toString((Objects.requireNonNull(expectedValue5)).toCharArray()), Arrays.toString(binaryString5));
		assertEquals(Arrays.toString((expectedValue1).toCharArray()), Arrays.toString(intArray1));
		assertEquals(Arrays.toString((expectedValue2).toCharArray()), Arrays.toString(intArray2));
		assertEquals(Arrays.toString((expectedValue3).toCharArray()), Arrays.toString(intArray3));
		assertEquals(Arrays.toString((expectedValue4).toCharArray()), Arrays.toString(intArray4));
		assertEquals(Arrays.toString((expectedValue5).toCharArray()), Arrays.toString(intArray5));
	}

}
