package baseball.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputValidatorTest {

	InputValidator inputValidator = new InputValidator();

	@ParameterizedTest
	@ValueSource(strings = {" ", "-12", "1234", "057", "902", "840", "asd", "가나1"})
	void isStringPositiveThreeDigitTest(String string) {
		assertThrows(IllegalArgumentException.class, () -> inputValidator.validateBaseballNumber(string));
	}


	@ParameterizedTest
	@ValueSource(strings = {"", "-1", "가나", "abcd", "+123"})
	void isOneOrTwoTest1(String string) {
		assertThrows(IllegalArgumentException.class, () -> inputValidator.isOneOrTwo(string));
	}

	@ParameterizedTest
	@ValueSource(strings = {"1", "2"})
	void isOneOrTwoTest2(String string) {
		inputValidator.isOneOrTwo(string);
	}
}
