package array.multi;

import java.util.Scanner;

/**
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그중 가장 방어율이 낮은 최고의 투수를 탖는 클래서
 * @author Administrator
 *
 */
public class BestPitcher {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		// 3. 각 팀별로 각 투수의 방어율을 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율을 입력");
		
		for (int i = 0; i < ERA.length; i++) {
			System.out.println((i+1) + "번째 팀 1~5 선발 투수 방어율 : ");
				 for(int lo = 0; lo < 5; lo++) {
					 ERA[i][lo] = scan.nextDouble();
				 }
		}
		int ii=0;
		int jj =0;
		System.out.println("최고의 투수는");
		for(int t = 0;t<ERA.length;t++) {
			for(int llo=0;llo < 5;llo++) {
				if(min>ERA[t][llo]) {
					min=ERA[t][llo];
					ii=t+1;
					jj=llo+1; 
				}
				continue;
			}
			
		}
		System.out.printf(" 최고의 선수는 %d팀 %d번째 선수!! 방어률은 %f",ii, jj,min);
	}

}
