package basicprogram1;
public class UpdateValue {
	public static void main(String[] args) {
		byte b = (byte) -(Math.pow(2, 8 - 1));
		System.out.println(b);
		b = (byte) (Math.pow(2, 8 - 1) - 1);
		System.out.println(b);
		short s = (short) -(Math.pow(2, 16 - 1));
		System.out.println(s);
		s = (short) (Math.pow(2, 16 - 1) - 1);
		System.out.println(s);
		int i = (int) -(Math.pow(2, 32 - 1));
		System.out.println(i);
		i = (int) (Math.pow(2, 32 - 1) - 1);
		System.out.println(i);
		long l = (long) -(Math.pow(2, 64 - 1));
		System.out.println(l);
		l = (long) (Math.pow(2, 64 - 1) - 1);
		System.out.println(l);
		double d = 99.12345678911131516;
		System.out.println(d);
		d = 11.98765432110111213;
		System.out.println(d);
		float f = 99.12345678911131516f;
		System.out.println(f);
		f = 11.98765432110111213f;
		System.out.println(f);
		char c = '@';
		System.out.println(c);
		c = 'Z';
		System.out.println(c);
		boolean boo = true;
		System.out.println(true);boo = false;
		System.out.println(boo);
		String str = "Before updation";
		System.out.println(str);	str = "After updation";
		System.out.println(str);
	}
}
