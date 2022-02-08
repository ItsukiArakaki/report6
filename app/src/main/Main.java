import java.util.Random;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// cpuの答えを取得
		int cpuAnswer = getCpuAnswer();
 
		while (true) {
 
			// playerの予想値を取得
			int playerAnswer = getPlayerAnswer();
 
			// 正解/不正解のチェック
			boolean judge = isJudge(cpuAnswer, playerAnswer);
 
			// 正解の場合処理を終了、不正解の場合次のループへ
			if (judge) {
				break; 

			}else { 
				
			}
		}
	}
 
	// cpuの答えを返すメソッド
	public static int getCpuAnswer() {
		// 乱数を返す
		return new Random().nextInt(100)+1;
	}
 
	// playerが入力した数値を返すメソッド
	public static int getPlayerAnswer() {
		int answer;
		
		Scanner i = new Scanner(System.in);
 
		while (true) {
			try {
				System.out.println("数字(1~100）を入力してください！");
				answer = i.nextInt();
				break; 

			} catch (Exception e) {
				System.out.println("数字は整数(1~100)を入力してください！");
				i.next();
			}
		}
		return answer; // 入力された数値を返す
	}
 
	// cpuの答えとplayerの答えが一致するかどうかを判定するメソッド
	public static boolean isJudge(int cpu, int player) {
	
		if (cpu < player) { // 答えの方が小さい場合
			System.out.println("もっと小さな値です！");
			return false;

		} else if (cpu > player) { // 答えの方が大きい場合
			System.out.println("もっと大きな値です！");
			return false;

		} else { // 答えと予想値が一致した場合
			System.out.println("正解です！！おめでとう！！");
			return true;
		}
	}
}