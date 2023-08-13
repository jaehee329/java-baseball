package baseball.view;

public class InputValidator {

	public void validateBaseballNumber(String string) throws IllegalArgumentException {
		isStringPositiveThreeDigit(string);
		isCharactersDistinct(string);
	}

	public void validateRestartNumber(String string) throws IllegalArgumentException {
		isOneOrTwo(string);
	}

	private void isStringPositiveThreeDigit(String string) {
		if (!string.matches("^[1-9]{3}")) {
			throw new IllegalArgumentException("입력은 0이 없는 세 자리의 자연수여야 합니다");
		}
	}

	private void isCharactersDistinct(String string) {
		if (string.chars().distinct().count() != 3) {
			throw new IllegalArgumentException("입력 숫자에는 중복이 없어야 합니다.");
		}
	}

	private void isOneOrTwo(String string) {
		if (!(string.equals("1") || string.equals("2"))) {
			throw new IllegalArgumentException("입력은 1 또는 2여야 합니다.");
		}
	}
}
