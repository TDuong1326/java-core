package chapter7.video82;

public class Video implements Playable {
	private String title;
	private String duration;

	public Video(String title, String duration) {
		this.title = title;
		this.duration = duration;
	}

	@Override
	public void play() {
		System.out.println("Playing video: " + this.title + " (" + this.duration + " mins)");

	}

	@Override
	public void pause() {
		System.out.println("Pausing song: " + this.title);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
