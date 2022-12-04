package baseball.view;

public class InputValidator {

	public boolean isNumberString(String string) {
		return string.chars().allMatch(Character::isDigit);
	}
}
