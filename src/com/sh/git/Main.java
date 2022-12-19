package com.sh.git;

/**
 * 되돌리기
 * - revert : 지정한 커밋의 작업내용을 취소한 버전을 새로운 커밋으로 만든다.(conflict 날 수 잇음)
 * 
 * - reset : 지정한 커밋으로 돌아간다.
 * 		- hard : 지정 커밋 이후 변경사항 버림
 * 		- mixed : 지정 커밋 이후 변경사항을 unstaging area에 보관. 재추가 후 커밋 가능.
 * 		- soft : 지정 커밋 이후 변경사항을 staging area에 보관. 즉시 커밋 가능
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println("Hello git");
	}

}
