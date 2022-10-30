package main.prog2.misc;

import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prog2.misc.SnakeMatrixIterator;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 08/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
@SuppressWarnings({"unused", "CommentedOutCode"})
class SnakeMatrixIteratorTest {

	private Integer[] @Nullable [] snakeMatrix;
	private SnakeMatrixIterator<?> snakeMatrixIterator;

	@BeforeEach
	void setup() {
		snakeMatrix = new Integer[][]{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		snakeMatrixIterator = new SnakeMatrixIterator<>(snakeMatrix);
	}

	@AfterEach
	void tearDown(){
		snakeMatrix = null;
	}

	@Test
	void testHasNext() {
		while (snakeMatrixIterator.hasNext()) {
			assertEquals(1, snakeMatrixIterator.next());
			assertEquals(2, snakeMatrixIterator.next());
			assertEquals(3, snakeMatrixIterator.next());
			assertEquals(6, snakeMatrixIterator.next());
			assertEquals(5, snakeMatrixIterator.next());
			assertEquals(4, snakeMatrixIterator.next());
			assertEquals(7, snakeMatrixIterator.next());
			assertEquals(8, snakeMatrixIterator.next());
			assertEquals(9, snakeMatrixIterator.next());
		}
		//noinspection ConstantConditions
		assertFalse(snakeMatrixIterator.hasNext());
	}

    /*
    @Test
    void testNext() {
        Object result = snakeMatrixIterator.next();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
    */
}