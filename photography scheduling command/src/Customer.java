
public class Customer {
	Photographer photographer;
	Schedule schedule;
	
	public Customer(Photographer photographer) {
		this.photographer = photographer;
	}
	
	public void createSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	public void photoCaptured() {
		photographer.takePhoto(schedule);
	}
}

