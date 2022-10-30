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

@SuppressWarnings("SameParameterValue")
final class InterestCalculator {

    @SuppressWarnings("unused")
    private static double calculateInterest(final double TOTAL_AMOUNT, final double ANNUAL_INTEREST_RATE, final double ANNUAL_REPAYMENT_RATE){
        double annualInterestRatePercentage = ANNUAL_INTEREST_RATE / 100;
        double annualRepaymentAmount = TOTAL_AMOUNT * ANNUAL_REPAYMENT_RATE / 100;
        double remainingAmount = TOTAL_AMOUNT;
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

    @SuppressWarnings({"SameParameterValue", "unused"})
    private static double calculateCompoundedInterest(final double ANNUAL_INTEREST_RATE , final double INVESTMENT, final int INVESTMENT_HORIZON) {
        int yearCounter = 0;
        double compoundedInterest = INVESTMENT;
        while(yearCounter < INVESTMENT_HORIZON) {
            yearCounter++;
            compoundedInterest *= ANNUAL_INTEREST_RATE;
        }
        return compoundedInterest;
    }

    public static void main(String[] args) {
        System.out.println(calculateInterest(1000000., 1.5, 2.));
        //System.out.println(calculateCompoundedInterest(1.15, 10000., 10));
    }

}
