package main.prog2.exm_ss22;

import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prog2.exm_ss22.Person;
import prog2.exm_ss22.Schlange;
import prog2.exm_ss22.Student;
import prog2.exm_ss22.Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 21/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class UtilTest {

	private @Nullable Collection<Person> studentsEmpty;
	private @Nullable Collection<Person> studentsFilled;
	private @Nullable Student student1;
	private @Nullable Student student2;
	private @Nullable Student student3;

	private @Nullable Schlange<Integer> src;
	private @Nullable Schlange<Integer> dst;


	@BeforeEach
	void setUp(){
		studentsEmpty = new ArrayList<>();
		studentsFilled = new ArrayList<>();
		student1 = new Student("Anton", "Aurich", 111111);
		student2 = new Student("Anton", "Aurich", 111111);
		student3 = student1;
		studentsFilled.add(student1);
		studentsFilled.add(student2);
		studentsFilled.add(student3);
		src = new Schlange<>();
		src.insert(1);
		src.insert(2);
		src.insert(3);
		src.insert(4);
		src.insert(5);
		dst = new Schlange<>();
	}

	@AfterEach
	void tearDown() {
		studentsEmpty = null;
		studentsFilled = null;
		student1 = null;
		student2 = null;
		student3 = null;
		src = null;
		dst = null;
	}

	@Test
	void testNumElementesInCollection() {
		assertEquals(0, Util.numElementesInCollection(Objects.requireNonNull(studentsEmpty), student1));
		assertEquals(2, Util.numElementesInCollection(Objects.requireNonNull(studentsFilled), student1));
	}

	@Test
	void test_sCopy() {
		Util.sCopy(src, Objects.requireNonNull(dst));
		assertEquals(Objects.requireNonNull(src).size(), dst.size());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
		assertEquals(src.remove(), dst.remove());
	}

}