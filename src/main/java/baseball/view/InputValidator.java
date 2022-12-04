package baseball.view;

public class InputValidator {

	public void validateBaseballNumber(String string) throws IllegalArgumentException {
		isNumberString(string);
		hasThreeCharacters(string);
		isStringWithNonZeroStart(string);
	}

	public void validateRestartNumber(String string) throws IllegalArgumentException {
		isOneOrTwo(string);
	}

	public void isNumberString(String string) {
		if (!string.chars().allMatch(Character::isDigit)) {
			throw new IllegalArgumentException("입력은 숫자로만 구성된 문자열이어야 합니다.");
		}
	}

	public void hasThreeCharacters(String string) {
		if (string.length() != 3) {
			throw new IllegalArgumentException("입력은 세 자리 문자로 구성되어야 합니다.");
		}
	}

	public void isStringWithNonZeroStart(String string) {
		if (string.charAt(0) == '0') {
			throw new IllegalArgumentException("입력은 0이 아닌 문자로 시작되어야 합니다.");
		}
	}

	public void isOneOrTwo(String string) {
		if (!(string.equals("1") || string.equals("2"))) {
			throw new IllegalArgumentException("입력은 1 또는 2여야 합니다.");
		}
	}
}
