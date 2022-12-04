package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseballState {

	private List<Integer> answer;

	public BaseballState(BaseballNumberGenerator baseballNumberGenerator) {
		List<Integer> answer = new ArrayList<>();
		answer.add(baseballNumberGenerator.generateNonZeroSingleDigit());
		while (answer.size() < 3) {
			int number = baseballNumberGenerator.generateSingleDigit();
			if (!answer.contains(number)) {
				answer.add(number);
			}
		}
		this.answer = answer;
	}

	public boolean isCorrect(String string) {
		List<Integer> input = new ArrayList<>();
		string.chars().forEach(c -> input.add(c-'0'));
		return input.equals(answer);
	}

	public String getScoreString(String string) {
		List<Integer> input = new ArrayList<>();
		string.chars().forEach(c -> input.add(c-'0'));
		int ball = (int)input.stream().filter(i -> answer.contains(i)).count();
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			if (answer.get(i) == input.get(i)) {
				strike++;
			}
		}
		ball -= strike;
		return convertToString(ball, strike);
	}

	private String convertToString(int ball, int strike) {
		if (ball == 0 && strike == 0) {
			return "낫싱";
		}
		StringBuilder sb = new StringBuilder();
		buildString(ball, strike, sb);
		return sb.toString();
	}

	private static void buildString(int ball, int strike, StringBuilder sb) {
		if (ball != 0) {
			sb.append(ball + "볼");
		}
		if (ball != 0 && strike != 0) {
			sb.append(" ");
		}
		if (strike != 0) {
			sb.append(strike + "스트라이크");
		}
	}
}
