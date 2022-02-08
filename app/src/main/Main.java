import java.util.Random;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		int cpuAnswer = getCpuAnswer();
 
		while (true) {
 
			int playerAnswer = getPlayerAnswer();
 
			boolean judge = isJudge(cpuAnswer, playerAnswer);
 
			if (judge) {
				break; 

			}else { 
				
			}
		}
	}
 

	public static int getCpuAnswer() {
		return 50;
	}
 
	
	public static int getPlayerAnswer() {
		int answer;
		
		Scanner i = new Scanner(System.in);
 
		while (true) {
			try {
				System.out.println("数字(1~100）を入力してください！");
				answer = i.nextInt();
				break; 

			} catch (Exception e) {
				i.next();
			}
		}
		return answer;
	}
 
	
	public static boolean isJudge(int cpu, int player) {
	
		if (cpu < player) {
			return false;

		} else if (cpu > player) {
			return false;

		} else {
			return true;
		}
	}
}