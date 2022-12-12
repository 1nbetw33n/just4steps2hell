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

package misc;
/*
1nbetw33n
24.Mar.2022
*/

import org.jetbrains.annotations.Contract;

@SuppressWarnings("SameParameterValue")
final class InterestCalculator {

    /**
     * Hidden constructor, because this is a utility class and shall not be instantiated.
     */
    @Contract(value = " -> fail", pure = true)
    private InterestCalculator() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Calculates the compounded interest for a given amount of money {@code amount}, a given annual interest rate {@code interestRate} and a given number of years {@code years}.
     * @param total_amount the total amount of money
     * @param annual_interest_rate the annual interest rate
     * @param annual_repayment_rate the annual repayment rate
     * @return the compounded interest
     */
    @SuppressWarnings("unused")
    private static double calculateInterest(final double total_amount, final double annual_interest_rate, final double annual_repayment_rate){
        double annualInterestRatePercentage = annual_interest_rate / 100;
        double annualRepaymentAmount = total_amount * annual_repayment_rate / 100;
        double remainingAmount = total_amount;
        double compoundedInterest = 0.;
        int yearCounter = 0;
        while (remainingAmount > 0.001) {
            compoundedInterest += (remainingAmount * annualInterestRatePercentage);
            remainingAmount -= annualRepaymentAmount;
            yearCounter++;
            if (yearCounter == 20){
                annualRepaymentAmount *= 2;
            }
        }
        return compoundedInterest;
    }

    /**
     * Calculates the compounded interest for a given annual interest rate {@code annualInterestRate}, a given investment amount {@code investmentAmount} and a given number of years {@code investment_horizon}.
     * @param annual_interest_rate the annual interest rate
     * @param investement amount the investment amount
     * @param investment_horizon the investment horizon
     * @return the compounded interest
     */
    @SuppressWarnings({"SameParameterValue", "unused"})
    private static double calculateCompoundedInterest(final double annual_interest_rate , final double investement, final int investment_horizon) {
        int yearCounter = 0;
        double compoundedInterest = investement;
        while(yearCounter < investment_horizon) {
            yearCounter++;
            compoundedInterest *= annual_interest_rate;
        }
        return compoundedInterest;
    }

    public static void main(String[] args) {
        System.out.println(calculateInterest(1000000., 1.5, 2.));
        //System.out.println(calculateCompoundedInterest(1.15, 10000., 10));
    }

}
