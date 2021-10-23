
public class LargePhotoAdapter implements SmallPhoto{
	LargePhoto largePhoto;
	
	public LargePhotoAdapter(LargePhoto largePhoto) {
		this.largePhoto = largePhoto;
	}
	
	@Override
	public void smallSize() {
		// TODO Auto-generated method stub
		largePhoto.largeSize();
	}

	@Override
	public void date() {
		// TODO Auto-generated method stub
		largePhoto.date();
	}
	
}
