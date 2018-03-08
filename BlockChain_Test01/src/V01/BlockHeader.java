package V01;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BlockHeader {
	private int version;							//SW�Ǵ� PROTOCOL���� ���׷��̵带 �����ϱ� ���� ����
	private byte[] previousBlockHash;//���ü�� ���� ���� ���(�θ� ���)�� �ؽð�
	private int merkleRootHash;			//��ŬƮ���� ��Ʈ�� ���� �ؽð�
	private int timestamp;						//�ش� ����� �����ð�
	private int difficultyTarget;				//ä���������� �ʿ��� �۾� ����(Proof of Work)�˰����� ���̵� ��ǥ
	private int nonce;								//ä���������� �۾� ������ ���Ǵ� ī����
	
	public BlockHeader(byte[] previousBlockHash, Object[] transaction) {
		this.previousBlockHash = previousBlockHash;
		this.merkleRootHash = this.someMethod(transaction);
	}
	
	
	private int someMethod(Object[] transaction) {
		return Arrays.hashCode(transaction);
	}
}
