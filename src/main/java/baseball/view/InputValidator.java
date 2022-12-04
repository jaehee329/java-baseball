package baseball.view;

public class InputValidator {

	public boolean isNumberString(String string) {
		return string.chars().allMatch(Character::isDigit);
	}

	public boolean hasThreeCharacters(String string) {
		return string.length() == 3;
	}

	public boolean isStringWithNonZeroStart(String string) {
		return string.charAt(0) != '0';
	}
}
