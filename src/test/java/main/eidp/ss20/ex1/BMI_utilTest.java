package main.eidp.ss20.ex1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Created by 0x1nbetw33n on 07/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
@SuppressWarnings("NewClassNamingConvention")
class BMI_util_test {
	final BMI_util bMI_util = new BMI_util();

	double weight1;
	double weight2;
	double weight3;
	double height1;
	double height2;
	double height3;
	double result1;
	double result2;
	double result3;

	@BeforeEach
	void set_up(){
		weight1 = 70.;
		weight2 = 63.;
		weight3 = 85.;
		height1 = 1.60;
		height2 = 1.78;
		height3 = 1.85;
		result1 = bMI_util.calc_bmi(weight1, height1);
		result2 = bMI_util.calc_bmi(weight2, height2);
		result3 = bMI_util.calc_bmi(weight3, height3);
	}

	@AfterEach
	void tear_down(){
		weight1 = 0.;
		weight2 = 0.;
		weight3 = 0.;
		height1 = 0.;
		height2 = 0.;
		height3 = 0.;
	}


	@Test
	void testCalc_bmi() {
		Assertions.assertTrue(27.34375 - result1 < 0.00001);
		Assertions.assertTrue(19.883853049 - result2 < 0.00001);
		Assertions.assertTrue(24.835646457 - result3 < 0.00001);
	}
}