package QQ2016;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class sounds {
	public sounds() {
		String filename="sounds/system.wav";
//		switch (cmd) {
//		case Cmd.CMD_ADDFRI:
//			filename="sounds/system.wav";
//			break;
//		case Cmd.CMD_SEND:
//			filename="sounds/msg.wav";
//			break;
//		case Cmd.CMD_SHAKE:
//			filename="sounds/shake.wav";
//			break;
//		}
		File file=new File(filename);
		
		try {
			InputStream is = new FileInputStream(file);
			int size = is.available();
			byte b[] = new byte[size];
			is.read(b, 0, size);
			AudioData ad = new AudioData(b);
			AudioDataStream ds = new AudioDataStream(ad);
			AudioPlayer.player.start(ds);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new sounds() ;
	}
}
