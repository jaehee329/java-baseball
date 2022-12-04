package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

public class FlowController {

	private InputView inputView = new InputView();
	private OutputView outputView = new OutputView();
	private BaseballState baseballState;


	public void run() {
		baseballState = new BaseballState(new RandomBaseballNumberGenerator());
		outputView.printStartMessage();
		String baseballNumber = "000";
		while (!baseballState.isCorrect(baseballNumber)) {
			baseballNumber = inputView.getBaseballNumber();
			String score = baseballState.getScoreString(baseballNumber);
			outputView.printScore(score);
		}
		if (inputView.getRestartNumber().equals("1")) {
			run();
		}
	}
}
