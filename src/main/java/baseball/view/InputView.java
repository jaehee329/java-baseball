package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	private static InputValidator inputValidator = new InputValidator();

	public static String getBaseballNumber() {
		String input = Console.readLine();
		inputValidator.validateBaseballNumber(input);
		return input;
	}
}
