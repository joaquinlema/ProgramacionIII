package juego;
import java.util.Timer;
import java.util.TimerTask;

public class Temporalizador {
	private Timer time;
	private int segundos;
	
	public class Contador extends TimerTask{
		public void run(){
			segundos++;
		}	
	}
	
	public void start(){
		this.segundos = 0;
		time = new Timer();
		time.schedule(new Contador(),0,1000);
	}
	
	public void stop(){
		time.cancel();
	}
	
	public int valorSeg(){
		return segundos;
	}
}
