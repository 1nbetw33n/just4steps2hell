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

package main.advent_of_code;

import advent_of_code.Submarine;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by 0x1nbetw33n on 29/10/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class SubmarineTest {
	@Nullable Submarine submarine;

	@BeforeEach
	void setup(){submarine = new Submarine();}

	@AfterEach
	void tearDown(){submarine = null;}

	@Test
	@DisplayName("tests if submarine methods moving the submarine like expected")
	void testSubmarineMoving() {
		Objects.requireNonNull(submarine).forward(5);
		submarine.down(5);
		submarine.forward(8);
		submarine.up(3);
		submarine.down(8);
		submarine.forward(2);
		assertEquals(15, submarine.x);
		assertEquals(10, submarine.y);
		assertEquals(150, submarine.x * submarine.y);
	}

}