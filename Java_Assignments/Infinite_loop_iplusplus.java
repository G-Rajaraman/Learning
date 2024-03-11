package basicprogram1;

public class Infinite_loop_iplusplus {

	public static void main(String[] args) {
		for(float i=0.0f; i>-1f;i++) {
			System.out.println("This loop is for i="+i);
		  try {
			Thread.sleep(1000);
            } 		  
		  catch (InterruptedException e) {
            // This block is executed if an InterruptedException occurs
            e.printStackTrace();
		     }
	}

  }
}