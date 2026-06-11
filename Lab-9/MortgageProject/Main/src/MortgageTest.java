import static org.junit.Assert.*;

import org.junit.Test;

public class MortgageTest {

	@Test
	public void shouldReturn180000ForSingleArchitectWithIncome3000() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();

		double maximumMortgage = mortgageCalculator.computeMaxMortgage(
				1967, 5, 2, 3000, false, 0, "Architect");

		assertEquals(180000, maximumMortgage, 0.001);
	}

	@Test
	public void shouldReturnZeroForUnderageApplicant() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();

		double maximumMortgage = mortgageCalculator.computeMaxMortgage(
				2001, 5, 2, 3000, false, 0, "Architect");

		assertEquals(0, maximumMortgage, 0.001);
	}

	@Test
	public void shouldReturn220000ForMarriedDeveloperWithCombinedIncomeOver5000() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();

		double maximumMortgage = mortgageCalculator.computeMaxMortgage(
				1977, 12, 2, 4000, true, 2000, "Developer");

		assertEquals(220000, maximumMortgage, 0.001);
	}

	@Test
	public void shouldReturn280000ForProfessorWithHighIncome() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();

		double maximumMortgage = mortgageCalculator.computeMaxMortgage(
				1954, 5, 12, 5500, false, 0, "Professor");

		assertEquals(280000, maximumMortgage, 0.001);
	}
}