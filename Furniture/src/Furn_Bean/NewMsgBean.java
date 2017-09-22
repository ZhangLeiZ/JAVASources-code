package Furn_Bean;

public class NewMsgBean {
	private int newMsgId;//��Ѷid
	private String msgName;//��Ѷ���
	private String oneWord;//һ�仰
	private String msgContent;//html��ҳ(����)
	private String msgContentUrl;//������ַ
	private String publishDate;//����ʱ��
	private String publishUsername;//������
	private int effective;//0��Ч��1��Ч
	private int seq;//�����(�����ǰ���*10)
	private int newsType;//0��֪ͨ��1�ǹ���
	private String imageUrl;//ͼƬ��ַ
	public int getNewMsgId() {
		return newMsgId;
	}
	public void setNewMsgId(int newMsgId) {
		this.newMsgId = newMsgId;
	}
	public String getMsgName() {
		return msgName;
	}
	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}
	public String getOneWord() {
		return oneWord;
	}
	public void setOneWord(String oneWord) {
		this.oneWord = oneWord;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgContentUrl() {
		return msgContentUrl;
	}
	public void setMsgContentUrl(String msgContentUrl) {
		this.msgContentUrl = msgContentUrl;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPublishUsername() {
		return publishUsername;
	}
	public void setPublishUsername(String publishUsername) {
		this.publishUsername = publishUsername;
	}
	public int getEffective() {
		return effective;
	}
	public void setEffective(int effective) {
		this.effective = effective;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getNewsType() {
		return newsType;
	}
	public void setNewsType(int newsType) {
		this.newsType = newsType;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
