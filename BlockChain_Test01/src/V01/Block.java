package V01;

public class Block {
	private int blockSize;							//블럭의 크기를 뜻함
	private BlockHeader blockHeader;		//해당 블록의 메타데이터를 담고 있는 객체
	private int transactionCount;				//거래의 수를 저장하는 변수
	private Object[] transactions;			//거래 정보를 담고 있는 컬렉션
}
