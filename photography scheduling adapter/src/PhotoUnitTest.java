import org.junit.*;

public class PhotoUnitTest {

	@Test
	public void testSmallPhoto() {
		SmallPhoto smallPhoto = new CompleteSmallPhoto();
		
		System.out.println("Small Photo");
		smallPhoto.smallSize();
		smallPhoto.date();
	}
	
	public void testLargePhoto() {
		LargePhoto largePhoto = new CompleteLargePhoto();
		
		System.out.println("Large Photo");
		largePhoto.largeSize();
		largePhoto.date();
	}

}
