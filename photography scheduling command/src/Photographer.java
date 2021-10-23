
public class Photographer {
	Schedule schedule;
	public Photographer() {};
	public void takePhoto(Schedule schedule) {
		this.schedule = schedule;
		schedule.schedulePhoto();
	}
}
