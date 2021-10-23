
public class DisplayState implements State{
	Photo photo;
	public DisplayState(Photo photo) {
		this.photo = photo;
	}
	@Override
	public void schedulePhotography() {
		// TODO Auto-generated method stub
		System.out.println("Scheduled");
	}

	@Override
	public void completePictureDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Photo captured. Ready to display");
	}

	@Override
	public void insertPictureFrame() {
		// TODO Auto-generated method stub
		System.out.println("No frame added");
	}

	@Override
	public void removePictureFrame() {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove");
	}
	
}
