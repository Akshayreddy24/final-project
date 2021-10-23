import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SmallPhotoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallPhoto smallPhoto = new CompleteSmallPhoto();
		
		System.out.println("Small Photo");
		smallPhoto.smallSize();
		smallPhoto.date();
		
		//JUnit test
				Result result = JUnitCore.runClasses(PhotoUnitTest.class);
				for (Failure failure : result.getFailures()) {
			         System.out.println(failure.toString());
			      }
					
			      System.out.println(result.wasSuccessful());
	}

}
