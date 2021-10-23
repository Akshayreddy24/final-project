import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PhotoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Photo photo = new Photo();
		Photographer photographer = new Photographer();
		Customer customer = new Customer(photographer);
		customer.createSchedule(new PhotoOrder(photo));
		customer.photoCaptured();
		
		//JUnit test
				Result result = JUnitCore.runClasses(PhotoUnitTest.class);
				for (Failure failure : result.getFailures()) {
			         System.out.println(failure.toString());
			      }
					
			      System.out.println(result.wasSuccessful());
			

	}

}
