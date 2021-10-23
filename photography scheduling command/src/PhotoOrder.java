
public class PhotoOrder implements Schedule{
	Photo photo;
	public PhotoOrder(Photo photo) {
		this.photo = photo;
	}
	@Override
	public void schedulePhoto() {
		// TODO Auto-generated method stub
		photo.takePhoto();
		photo.printPhoto();
	}

}
