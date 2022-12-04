package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	private static InputValidator inputValidator = new InputValidator();

	public String getBaseballNumber() {
		String input = Console.readLine();
		inputValidator.validateBaseballNumber(input);
		return input;
	}

	public String getRestartNumber() {
		String input = Console.readLine();
		inputValidator.validateRestartNumber(input);
		return input;
	}
}
