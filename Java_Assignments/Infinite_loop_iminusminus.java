package basicprogram1;

public class Infinite_loop_iminusminus {

	public static void main(String[] args) {
	for(float i=1f; i<2f;i--) {
		System.out.println("The value of i= "+i);
		try {
		Thread.sleep(500);}
		catch(InterruptedException e){
		e.printStackTrace();
		}
	}
	}

}
