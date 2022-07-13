package prjctpractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class MyInsurancepvt {
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM YYYY h:mm a");

	public void expirydateofpolicy() {

		// System.out.println("Policy Register Date -"+formatter.format(now));
		LocalDateTime tenYearAfter = now.plusYears(10);
		System.out.println("Policy expire date for the today registered policy - " + formatter.format(tenYearAfter));
		System.out.println("_____________________________________");
	}

	public void registerexpiredate() {

		LocalDateTime oneyearAfter = now.plusYears(1);
		LocalDateTime beforeNineyear = oneyearAfter.minusYears(10);
		System.out.println("Policy gonna expire on -" + formatter.format(oneyearAfter));
		System.out.println("Policy registered on - " + formatter.format(beforeNineyear));
		System.out.println("_____________________________________");

	}

	public void expiredate() {
		LocalDateTime registerDate = LocalDateTime.of(2015, Month.APRIL, 1, 7, 00);
		LocalDateTime expiredate = registerDate.plusYears(10);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM YYYY h:mm a");
		System.out.println("Register date - " + formatter2.format(registerDate));
		System.out.println("Polict expire on " + formatter2.format(expiredate));

	}
}

public class MyInsurancepvtltd {
	public static void main(String[] args) {
		MyInsurancepvt policy = new MyInsurancepvt();
		policy.expirydateofpolicy();
		policy.registerexpiredate();
		policy.expiredate();
	}
}