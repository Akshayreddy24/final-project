import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class LargePhotoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargePhoto largePhoto = new CompleteLargePhoto();
		
		System.out.println("Large Photo");
		largePhoto.largeSize();
		largePhoto.date();
		
		//JUnit test
		Result result = JUnitCore.runClasses(PhotoUnitTest.class);
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());

		
	}

}
