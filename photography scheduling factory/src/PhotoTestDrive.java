
public class PhotoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhotographySchedulingFactory photographySchedulingFactory = new PhotographySchedulingFactory();
		PhotoStore photoStore = new PhotoStore(photographySchedulingFactory);
		
		Photo photo = photoStore.schedulePhoto("Large Photo");
		System.out.println("Schedule for "+photo.getClientName()+"\n");
		
		
		photo = photoStore.schedulePhoto("Medium Photo");
		System.out.println("Schedule for "+photo.getClientName()+"\n");
		
	}

}
