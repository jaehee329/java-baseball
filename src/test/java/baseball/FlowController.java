package baseball;

import baseball.view.InputView;

public class FlowController {
	private InputView inputView = new InputView();

	public void run() {
		try {
			runGame();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void runGame() {

	}
}
