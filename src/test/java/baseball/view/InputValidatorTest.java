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
		assertFalse(inputValidator.isNumberString(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {" ", "-1", "가나", "abcd", "+123"})
	void hasThreeCharactersAssertFalseTest(String string) {
		assertFalse(inputValidator.hasThreeCharacters(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {"123", "087", "가나다", "abc", "+12", "-5-"})
	void hasThreeCharactersAssertTrueTest(String string) {
		assertTrue(inputValidator.hasThreeCharacters(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {"-0", "가나다", "abc", "+00", "105"})
	void isStringWithNonZeroStartAssertTrueTest(String string) {
		assertTrue(inputValidator.isStringWithNonZeroStart(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {"0", "012", "0가나", "0asd"})
	void isStringWithNonZeroStartAssertFalseTest(String string) {
		assertFalse(inputValidator.isStringWithNonZeroStart(string));
	}
}
