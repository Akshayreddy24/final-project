
public class SmallPhotoAdapter implements LargePhoto{
	SmallPhoto smallPhoto;
	
	public SmallPhotoAdapter(SmallPhoto smallPhoto) {
		this.smallPhoto = smallPhoto;
	}
	@Override
	public void largeSize() {
		// TODO Auto-generated method stub
		smallPhoto.smallSize();
	}

	@Override
	public void date() {
		// TODO Auto-generated method stub
		smallPhoto.date();
	}

}
