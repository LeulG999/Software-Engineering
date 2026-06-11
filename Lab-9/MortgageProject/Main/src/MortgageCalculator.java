import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {

	public double computeMaxMortgage(
			int yearOfBirth,
			int month,
			int day,
			double monthlyIncome,
			boolean isMarried,
			double monthlyIncomePartner,
			String profession) {

		double maximumMortgage = 0;

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(yearOfBirth, month, day);

		Period period = Period.between(birthday, today);
		int age = period.getYears();

		if (age < 18) {
			return 0;
		}

		double totalIncome = monthlyIncome;

		if (isMarried) {
			totalIncome += monthlyIncomePartner * 0.94;
		}

		if (2000 <= totalIncome && totalIncome < 3000) {
			if (profession.equals("Developer") ||
					profession.equals("Architect") ||
					profession.equals("Scrum master")) {
				maximumMortgage = 160000;
			}

			if (profession.equals("Tester") ||
					profession.equals("System Administrator") ||
					profession.equals("Technical writer")) {
				maximumMortgage = 120000;
			}

			if (profession.equals("Department head") ||
					profession.equals("Professor")) {
				maximumMortgage = 220000;
			}
		}

		if (3000 <= totalIncome && totalIncome < 5000) {
			if (profession.equals("Developer") ||
					profession.equals("Architect") ||
					profession.equals("Scrum master")) {
				maximumMortgage = 180000;
			}

			if (profession.equals("Tester") ||
					profession.equals("System Administrator") ||
					profession.equals("Technical writer")) {
				maximumMortgage = 140000;
			}

			if (profession.equals("Department head") ||
					profession.equals("Professor")) {
				maximumMortgage = 250000;
			}
		}

		if (5000 <= totalIncome) {
			if (profession.equals("Developer") ||
					profession.equals("Architect") ||
					profession.equals("Scrum master")) {
				maximumMortgage = 220000;
			}

			if (profession.equals("Tester") ||
					profession.equals("System Administrator") ||
					profession.equals("Technical writer")) {
				maximumMortgage = 160000;
			}

			if (profession.equals("Department head") ||
					profession.equals("Professor")) {
				maximumMortgage = 280000;
			}
		}

		return maximumMortgage;
	}
}
