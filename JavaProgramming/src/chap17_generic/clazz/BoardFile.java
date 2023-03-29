package chap17_generic.clazz;

import java.util.List;

public class BoardFile<T>  { // <T> freeboard나 noticeboard같은 
	                         //클래스형태로된 어떠한변수든 올수있게 하는 선언
	//T == FreeBoard는 boardNo == fBoardNo
	//T == NoticeBoard는 boarNo == nBoardNo
	private int boardNo;
	private int type;
	private String fileNm;
	private T t;  // 반드시 멤버변수로 <T>타입의 변수를 선언
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", type=" + type + ", fileNm=" + fileNm + ", t=" + t + "]";
	}

}
