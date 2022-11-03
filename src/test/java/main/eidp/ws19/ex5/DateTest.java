package main.eidp.ws19.ex5;

import eidp.ws19.ex5.Date;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static misc.util.*;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Created by 0x1nbetw33n on 29/10/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class DateTest {

	private @Nullable List<?> leap_years;
	private @Nullable List<?> non_leap_years;
	private @Nullable List<? super Date> leap_dates;
	private @Nullable List<? super Date> non_leap_dates;

	private final Date input_date1 = new Date(2018,10,7,16,30);
	private final Date input_date2 = new Date(2018,12,31,23,59);
	private final Date input_date3 = new Date(2020,2,28,23,59);
	private final Date input_date4 = new Date(2021,2,28,23,59);

	private final Date exp_date1 = new Date(2018,10,7,17,0);
	private final Date exp_date2 = new Date(2019,1,1,0,1);
	private final Date exp_date3 = new Date(2020,2,29,0,1);
	private final Date exp_date4 = new Date(2021,3,1,0,1);


	@BeforeEach
	void setUp() throws IOException{
		leap_years = csv2list("src/test/resources/date/leap_years.csv", "\n");
		non_leap_years = csv2list("src/test/resources/date/non_leap_years.csv", "\n");
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
	@DisplayName("Test if leap years are correctly identified")
	void is_leap_year_test() {
		Objects.requireNonNull(leap_dates).forEach(date -> assertTrue(((Date) date).is_leap_year()));
		Objects.requireNonNull(non_leap_dates).forEach(date -> assertFalse(((Date) date).is_leap_year()));
	}

	@Test
	@DisplayName("Test if dates are correctly extended")
	void extend_date_test(){
		input_date1.extend_date(30);
		input_date2.extend_date(2);
		input_date3.extend_date(2);
		input_date4.extend_date(2);
		assertTrue(input_date1.compare_date(exp_date1));
		assertTrue(input_date2.compare_date(exp_date2));
		assertTrue(input_date3.compare_date(exp_date3));
		assertTrue(input_date4.compare_date(exp_date4));
	}
}