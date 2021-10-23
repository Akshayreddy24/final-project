import org.junit.*;

public class PhotoUnitTest {

	@Test
	public void testOrder() {
		Photo photo = new Photo();
		Photographer photographer = new Photographer();
		Customer customer = new Customer(photographer);
		customer.createSchedule(new PhotoOrder(photo));
		customer.photoCaptured();
	}

}
