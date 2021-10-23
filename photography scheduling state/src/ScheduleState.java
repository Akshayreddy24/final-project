
public class ScheduleState implements State {
	Photo photo;
	public ScheduleState(Photo photo) {
		this.photo = photo;
	}

	@Override
	public void schedulePhotography() {
		// TODO Auto-generated method stub
		System.out.println("Already scheduled. Cannot schedule more");
	}

	@Override
	public void completePictureDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Nothing to display");
	}

	@Override
	public void insertPictureFrame() {
		// TODO Auto-generated method stub
		System.out.println("No frame added");
	}

	@Override
	public void removePictureFrame() {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove frame");
	}
}
