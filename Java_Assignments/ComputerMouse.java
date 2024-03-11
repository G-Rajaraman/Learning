package demo;
public class ComputerMouse {
	public static void main(String[] args) {
		for (int i = 1; i <= 500; i++) 
		{
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("ComputerMouse " + i);
			} 
			else if (i % 5 == 0) {
				System.out.println("Mouse " + i);
			} 
			else if (i%3==0) {
				System.out.println("Computer " + i);
			}
		}
	}
}