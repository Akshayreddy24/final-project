
public class Photo {
	String photo_size;
	String client_name;
	String photo_date;
	
	public String getClientName() {
		return client_name;
	}
	
	public void schedule() {
		System.out.println("Scheduled to "+ client_name);
	}
	
	public void photoSize() {
		System.out.println("Photo Size "+ photo_size);
	}
	
	public void photoDate() {
		System.out.println("Photo Date "+ photo_date);
	}
}
