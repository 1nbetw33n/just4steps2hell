package main.eidp.ws19.ex5;

import main.misc.util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Created by 0x1nbetw33n on 29/10/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class DateTest{

	private List<?> leap_years;
	private List<?> non_leap_years;
	private List<? super Date> leap_dates;
	private List<? super Date> non_leap_dates;

	@BeforeEach
	void setUp() throws IOException{
		leap_years = util.read_csv("src/test/resources/date/leap_years.txt");
		non_leap_years = util.read_csv("src/test/resources/date/non_leap_years.txt");
		leap_dates = new ArrayList<>();
		non_leap_dates = new ArrayList<>();
		for (Object year : leap_years){
			leap_dates.add(new Date((int) year, 1, 1, 1, 1));
		}
		for (Object year : non_leap_years){
			non_leap_dates.add(new Date((int) year, 1, 1, 1, 1));
		}
	}

	@AfterEach
	void tearDown(){
		leap_years = null;
		non_leap_years = null;
		leap_dates = null;
		non_leap_dates = null;
	}

	@Test
	void is_leap_year_test() {
		leap_dates.forEach(date -> assertTrue(((Date) date).is_leap_year()));
		non_leap_dates.forEach(date -> assertFalse(((Date) date).is_leap_year()));
	}
}