package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;


public class _01_useOfGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자유게시판 게시글에 대한 첨부파일
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
		//아래 2가지의 방식으로 선언할수있다.
		fBoardFile.setT(new FreeBoard());
	    fBoardFile.getT().setfBoardNo(1);
		fBoardFile.getT().setfBoardTitle("test");
		fBoardFile.getT().setfBoardContent("test입니다.");
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());
		
		fBoardFile.setType(fBoardFile.getT().
				           getClass().
				           getSimpleName().
				           equals("FreeBoard")
				           ? 1 : 2);
		
//		FreeBoard fboard = new FreeBoard();
//		fboard.setfBoardNo(1);
//    //2.fboard.setfBoardTitle("test");
//		fboard.setfBoardContent("test입니다.");
//		fBoardFile.setT(fboard);
		
		
		//공지사항 게시글에 대한 첨부파일
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		
		NoticeBoard nboard = new NoticeBoard();
		nboard.setNoardNo(2);
		nboard.setnBoardTitle("test");
		nboard.setnBoardContent("test 입니다.");
		nBoardFile.setT(nboard);
		nBoardFile.setType(nBoardFile
				          .getT()
				          .getClass()
				          .getSimpleName()
				          .equals("nboard")
				          ? 1 : 2);
		
	
		System.out.println(nboard + "-" + nBoardFile);
	
		
		
		
	}

}
