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

package main.prog2.exm_ss22;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prog2.exm_ss22.Schlange;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 21/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class SchlangeTest {
	private Schlange<Integer> schlange;

	@BeforeEach
	void setUp() {
		schlange = new Schlange<>();
	}

	@AfterEach
	void tearDown() {
		schlange = null;
	}

	@Test
	void insertRemoveTest(){
		schlange.insert(1);
		schlange.insert(2);
		schlange.insert(3);
		schlange.insert(4);
		schlange.insert(5);
		assertEquals(5, schlange.size());
		assertEquals(1, schlange.remove());
		assertEquals(2, schlange.remove());
		assertEquals(3, schlange.remove());
		assertEquals(4, schlange.remove());
		assertEquals(5, schlange.remove());
		assertEquals(0, schlange.size());
	}

	@Test
	void removeEmptyExceptionTest(){
		Assertions.assertThrows(RuntimeException.class, () -> schlange.remove());
	}

}