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
}
