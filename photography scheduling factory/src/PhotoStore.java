
public class PhotoStore {
	PhotographySchedulingFactory photographySchedulingFactory;
	
	public PhotoStore(PhotographySchedulingFactory photographySchedulingFactory) {
		this.photographySchedulingFactory = photographySchedulingFactory;
	}
	
	public Photo schedulePhoto(String type) {
		Photo photo;
		photo = photographySchedulingFactory.createScehdule(type);
		photo.schedule();
		photo.photoSize();
		photo.photoDate();
		
		return photo;
		
	}
}
