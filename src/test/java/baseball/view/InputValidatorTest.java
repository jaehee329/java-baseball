package baseball.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputValidatorTest {

	InputValidator inputValidator = new InputValidator();

	@ParameterizedTest
	@ValueSource(strings = {" ", "-12", "가나", "abcd", "+123"})
	void isNumberStringTest(String string) {
		assertThrows(IllegalArgumentException.class, () -> inputValidator.isNumberString(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {" ", "-1", "가나", "abcd", "+123"})
	void hasThreeCharactersTest1(String string) {
		assertThrows(IllegalArgumentException.class, () -> inputValidator.hasThreeCharacters(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {"123", "087", "가나다", "abc", "+12", "-5-"})
	void hasThreeCharactersTest2(String string) {
		inputValidator.hasThreeCharacters(string);
	}

	@ParameterizedTest
	@ValueSource(strings = {"-0", "가나다", "abc", "+00", "105"})
	void isStringWithNonZeroStartTest1(String string) {
		inputValidator.isStringWithNonZeroStart(string);
	}

	@ParameterizedTest
	@ValueSource(strings = {"0", "012", "0가나", "0asd"})
	void isStringWithNonZeroStartTest2(String string) {
		assertThrows(IllegalArgumentException.class, () -> inputValidator.isStringWithNonZeroStart(string));
	}
}
