package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String input = scanner.nextLine();
		return input;
	}
    
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		double randomNum = Math.random() * 3;
		int index = (int)Math.floor(randomNum);
		return hands[index];
	}
	
	//じゃんけんを行う
	public void playGame(String myChoice, String cpuChoice) {
		HashMap<String, String> handsMap = new HashMap<>();
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");

		System.out.println("自分の手は" + handsMap.get(myChoice) + ", 対戦相手の手は" + handsMap.get(cpuChoice));

		if (myChoice.equals(cpuChoice)) {
			System.out.println("あいこです");
		} else if (
			(myChoice.equals("r") && cpuChoice.equals("s")) ||
			(myChoice.equals("s") && cpuChoice.equals("p")) ||
			(myChoice.equals("p") && cpuChoice.equals("r"))
		) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
