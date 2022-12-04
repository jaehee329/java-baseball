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

}
