package facadePattern;

public class HomeTheater {

	Television tv;
	SoundSystem ss;
	RoomLight rl;
	
	public HomeTheater(	Television tv, SoundSystem ss, RoomLight rl) {
	
		this.tv = tv;
		this.ss = ss;
		this.rl = rl;
		
	}
	
	public void startWatching() {
		tv.tvOn();
		rl.lightOn();
		ss.soundOn();
	}
	
	public void stopWatching() {
		tv.tvOff();
		rl.lightOff();
		ss.soundOff();
	}
	
}
