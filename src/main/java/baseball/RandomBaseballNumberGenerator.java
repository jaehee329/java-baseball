package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomBaseballNumberGenerator implements BaseballNumberGenerator {

	public int generateNonZeroSingleDigit() {
		return Randoms.pickNumberInRange(1, 9);
	}
}
