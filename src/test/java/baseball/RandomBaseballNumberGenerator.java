package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomBaseballNumberGenerator implements BaseballNumberGenerator {

	public int generateSingleDigit() {
		return Randoms.pickNumberInRange(0, 9);
	}

	public int generateNonZeroSingleDigit() {
		return Randoms.pickNumberInRange(1, 9);
	}
}
