package ShowDemo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Privacebean implements Serializable{

	public int privaceid;
	public String privaceName;
	public int getPrivaceid() {
		return privaceid;
	}
	public void setPrivaceid(int privaceid) {
		this.privaceid = privaceid;
	}
	public String getPrivaceName() {
		return privaceName;
	}
	public void setPrivaceName(String privaceName) {
		this.privaceName = privaceName;
	}
	
}
