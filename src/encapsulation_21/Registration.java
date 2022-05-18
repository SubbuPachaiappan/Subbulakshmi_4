package encapsulation_21;
import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		Student details=new Student();
		System.out.println("Admission Number -" );
		details.setAdmissionId(scan.nextInt());
		System.out.println("Name of Student -" );
		details.setName(scan.next());
		System.out.println("Phone Number -" );
		details.setPhoneNumber(scan.nextLong());
		System.out.println("Mail Id -" );
		details.seteMailId(scan.next());
		scan.close();
		System.out.println("\nAfter Updating the details");
		details.setAdmissionId(1411);
		details.setPhoneNumber(981763450L);
		details.setName("Lakshmi");
		details.seteMailId("1999.pvs@gmail.com");
		System.out.println("Admission Number -" + details.getAdmissionId());
		System.out.println("Name of Student -" + details.getName());
		System.out.println("Phone Number -" + details.getPhoneNumber());
		System.out.println("Mail Id -" + details.geteMailId());

	}

}
