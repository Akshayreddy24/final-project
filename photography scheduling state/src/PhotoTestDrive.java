
public class PhotoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Photo photo = new Photo();
		
		ScheduleState scheduleState = new ScheduleState(photo);
		System.out.println("Schedule State");
		scheduleState.schedulePhotography();
		scheduleState.completePictureDisplay();
		scheduleState.insertPictureFrame();
		scheduleState.removePictureFrame();
		
		DisplayState displayState = new DisplayState(photo);
		System.out.println("Display State");
		displayState.schedulePhotography();
		displayState.completePictureDisplay();
		displayState.insertPictureFrame();
		displayState.removePictureFrame();
		
		InsertPictureFrameState frameState = new InsertPictureFrameState(photo);
		System.out.println("Frame State");
		frameState.schedulePhotography();
		frameState.completePictureDisplay();
		frameState.insertPictureFrame();
		frameState.removePictureFrame();
		
		RemovePictureFrameState removePictureFrameState = new RemovePictureFrameState(photo);
		System.out.println("Remove Frame State");
		removePictureFrameState.schedulePhotography();
		removePictureFrameState.completePictureDisplay();
		removePictureFrameState.insertPictureFrame();
		removePictureFrameState.removePictureFrame();
	}

}
