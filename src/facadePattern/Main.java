package facadePattern;

public class Main {

	public static void main(String[] args) {
		
		Television tv = new Television();
		SoundSystem ss = new SoundSystem();
		RoomLight rl = new RoomLight();
		
		HomeTheater ht = new HomeTheater(tv, ss, rl);
		
		ht.startWatching();
		System.out.println("Tv on\n");
		ht.stopWatching();
		System.out.println("Tv off\n");

	}

}
