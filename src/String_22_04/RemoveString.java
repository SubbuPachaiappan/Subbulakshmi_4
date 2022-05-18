package String_22_04;

class Removechar {
	public void removeString(String line1, String line2) {
		String result = new String(line1);

		for (int index = 0; index < line2.length(); ++index)

		{
			String temporary = Character.toString(line2.charAt(index));
			result = result.replaceAll(temporary, "");
		}

		System.out.println(" Given str1 : " + line1);
		System.out.println(" Given str2 : " + line2);
		System.out.println(" Result : " + result);
	}
}

public class RemoveString {
	public static void main(String[] args) {
		Removechar task = new Removechar();
		String line1 = "Sky is blue";
		String line2 = "S";
		line1 = line1.toLowerCase();
		line2 = line2.toLowerCase();
		task.removeString(line1, line2);
	}

}
