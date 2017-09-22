package QQ2016;

import java.io.Serializable;

import javax.swing.text.StyledDocument;

public class SendMsg implements Serializable{
	int cmd;
	AccountVO myinfo,friendinfo;
	StyledDocument doc;
	byte[] b;
	String msgstr;
	String filename;
}
