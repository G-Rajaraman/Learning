package blocks;

public class Print_365days_With_CorrespondingMonths {
	static int i = 1;
	static int y = 2025;

	public static void main(String[] args) {
		for (i = 1; i < 366; i++) {
			if (i <= 31) {
				System.out.println("Day no." + i + " is " + i + " January " + 2025);
			}
			if (i > 31 && i < 60) {
				System.out.println("Day no." + i + " is " + (i - 31) + " February " + y);
			}
			if (i > 59 && i < 91) {
				System.out.println("Day no." + i + " is " + (i - 59) + " March " + y);
			}
			if (i > 90 && i < 121) {
				System.out.println("Day no." + i + " is " + (i - 90) + " April " + y);
			}
			if (i > 120 && i < 152) {
				System.out.println("Day no." + i + " is " + (i - 120) + " May " + y);
			}
			if (i > 151 && i < 182) {
				System.out.println("Day no." + i + " is " + (i - 151) + " June " + y);
			}
			if (i > 181 && i < 213) {
				System.out.println("Day no." + i + " is " + (i - 181) + " July " + y);
			}
			if (i > 212 && i < 244) {
				System.out.println("Day no." + i + " is " + (i - 212) + " August " + y);
			}
			if (i > 243 && i < 274) {
				System.out.println("Day no." + i + " is " + (i - 243) + " September " + y);
			}
			if (i > 273 && i < 305) {
				System.out.println("Day no." + i + " is " + (i - 273) + " October " + y);
			}
			if (i > 304 && i < 335) {
				System.out.println("Day no." + i + " is " + (i - 304) + " November " + y);
			}
			if (i > 334 && i < 366) {
				System.out.println("Day no." + i + " is " + (i - 334) + " December " + y);
			}
			;
		}

	}

}
