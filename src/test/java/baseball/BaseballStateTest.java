package baseball;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BaseballStateTest {

	private static class DummyBaseballNumberGenerator implements baseball.BaseballNumberGenerator {
		int callCount = 0;
		public int generateSingleDigit() {
			return incrementCallCount();
		}
		public int generateNonZeroSingleDigit() {
			if (this.callCount == 0) {
				this.callCount++;
			}
			return incrementCallCount();
		}

		private int incrementCallCount() {
			int callCount = this.callCount;
			this.callCount++;
			this.callCount %= 10;
			return callCount;
		}
	}

	private DummyBaseballNumberGenerator baseballNumberGenerator = new DummyBaseballNumberGenerator();
	private BaseballState baseballState = new BaseballState(baseballNumberGenerator);

	@Test
	void isCorrectTest() {
		String input = "123";
		Assertions.assertTrue(baseballState.isCorrect(input));
	}

	@ParameterizedTest
	@MethodSource("inputAnswerSource")
	void getScoreStringTest(String input, String expected) {
		org.assertj.core.api.Assertions.assertThat(baseballState.getScoreString(input)).isEqualTo(expected);
	}

	private static Stream<Arguments> inputAnswerSource() { // argument source method
		return Stream.of(
			Arguments.of("123", "3스트라이크"),
			Arguments.of("231", "3볼"),
			Arguments.of("456", "낫싱"),
			Arguments.of("391", "2볼"),
			Arguments.of("713", "1볼 1스트라이크")
		);
	}
}
