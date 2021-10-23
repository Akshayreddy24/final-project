
public class PhotographySchedulingFactory {
	public Photo createScehdule(String type) {
		Photo photo = null;
		if(type.equals("Large Photo")) {
			photo = new LargePhoto();
		}else if(type.equals("Medium Photo")) {
			photo = new MediumPhoto();
		}
		return photo;
	}
}
