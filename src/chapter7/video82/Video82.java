package chapter7.video82;

public class Video82 {
	public static void main(String[] args) {

		Song s = new Song("shape of you", "Ed Sheeran");
		Video v = new Video("Inception", "140");

		Playable[] pl = { s, v };

		for (Playable playable : pl) {
			playable.play();
			playable.pause();
			System.out.println();
		}
	}
}
