package chap17_generic.clazz;

public class NoticeBoard {
	private int nboardNo;
	private String nBoardTitle;
	private String nBoardContent;
	
	public int getNoardNo() {
		return nboardNo;
	}
	public void setNoardNo(int noardNo) {
		this.nboardNo = noardNo;
	}
	public String getnBoardTitle() {
		return nBoardTitle;
	}
	public void setnBoardTitle(String nBoardTitle) {
		this.nBoardTitle = nBoardTitle;
	}
	public String getnBoardContent() {
		return nBoardContent;
	}
	public void setnBoardContent(String nBoardContent) {
		this.nBoardContent = nBoardContent;
	}
	
	@Override
	public String toString() {
		return "NoticeBoard [noardNo=" + nboardNo + ", nBoardTitle=" + nBoardTitle + ", nBoardContent=" + nBoardContent
				+ "]";
	}
	
}
