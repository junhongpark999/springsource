package com.study.calc;

import org.springframework.stereotype.Component;

//재귀호출로 factorial 구현
//재귀호출 : 메소드 안에서 자신의 메소드를 다시 호출
//		   기본단계와 재귀단계로 나뉨

@Component("rec")
public  class RecCalc implements Calc{

	@Override
	public long factorial(long num) {
		if(num==0) {
		return 1;
		}else {
			return num * factorial(num-1);
		}
	}
	
//	void countdown(int i){
//		
//		if(i>=0) {
//		//기본단계
//		return;
//		}else {
//		//재귀단계(내가 나를 다시 호출하는 부분)
//		countdown(i-1);
//		}
//	}

	

}
