package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight, height, bmi, n;
		Scanner input;
		String resert;
		// 2. 초기화
		input = new Scanner(System.in);
		System.out.println("몸무게와 키(CM)를 순서대로 입력");
		weight = input.nextDouble();
		height = input.nextDouble()/100;
		
		// 3. 사용
		bmi = weight/(height * height);
		if(bmi < 15) {
			resert ="병적인 저체중";
		}else if(bmi < 18.5) {
			resert ="저체중";
		}else if(bmi < 23) {
			resert ="정상";	
		}else if(bmi < 27.5) {
			resert ="과체중";
		}else if(bmi < 40) {
			resert ="비만";
		}else {
			resert ="병적인 비만";
		}
	System.out.printf("MBI결과는 %.2f, 당신은 %s !!!!!!!",bmi,resert);	
	n = (21 - bmi);
	
	}

}
