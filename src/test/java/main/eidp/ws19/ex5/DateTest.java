package main.eidp.ws19.ex5;

import main.misc.util;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static main.misc.util.print_list;

/*
 * Created by 0x1nbetw33n on 29/10/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class DateTest{



	@Test
	void is_leap_year_test() throws IOException {
		List<?> leap_years = util.file2List("src/test/resources/leap_years.txt");
		print_list(leap_years);
	}
}