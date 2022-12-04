package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	private static InputValidator inputValidator = new InputValidator();

	public String getBaseballNumber() {
		System.out.print("숫자를 입력해주세요 : ");
		String input = Console.readLine();
		inputValidator.validateBaseballNumber(input);
		return input;
	}

	public String getRestartNumber() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		String input = Console.readLine();
		inputValidator.validateRestartNumber(input);
		return input;
	}
}
