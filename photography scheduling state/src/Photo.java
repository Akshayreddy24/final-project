
public class Photo {
	State schedulePhotography;
	State completePictureDisplay;
	State insertPictureFrame;
	State removePictureFrame;
	
	State state = schedulePhotography;
	
	public Photo() {
		schedulePhotography = new ScheduleState(this);
		completePictureDisplay = new DisplayState(this);
		insertPictureFrame = new InsertPictureFrameState(this);
		removePictureFrame = new RemovePictureFrameState(this);
	}
	
	public void schedulePhotography() {
		state.schedulePhotography();
	}
	
	public void completePictureDisplay() {
		state.completePictureDisplay();
	}
	
	public void insertPictureFrame() {
		state.insertPictureFrame();
	}
	
	public void removePictureFrame() {
		state.removePictureFrame();
	}
	
	public void setState() {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public State getSchedulePhotography() {
		return schedulePhotography;
	}

	public State getCompletePictureDisplay() {
		return completePictureDisplay;
	}

	public State getInsertPictureFrame() {
		return insertPictureFrame;
	}

	public State getRemovePictureFrame() {
		return removePictureFrame;
	}
	
	
}
