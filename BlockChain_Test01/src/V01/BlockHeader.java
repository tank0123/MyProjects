package V01;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BlockHeader {
	private int version;							//SW또는 PROTOCOL등의 업그레이드를 추적하기 위한 버전
	private byte[] previousBlockHash;//블록체인 상의 이전 블록(부모 블록)의 해시값
	private int merkleRootHash;			//머클트리의 루트에 대한 해시값
	private int timestamp;						//해당 블록의 생성시각
	private int difficultyTarget;				//채굴과정에서 필요한 작업 증명(Proof of Work)알고리즘의 난이도 목표
	private int nonce;								//채굴과정에서 작업 증명에서 사용되는 카운터
	
	public BlockHeader(byte[] previousBlockHash, Object[] transaction) {
		this.previousBlockHash = previousBlockHash;
		this.merkleRootHash = this.someMethod(transaction);
	}
	
	
	private int someMethod(Object[] transaction) {
		return Arrays.hashCode(transaction);
	}
}
