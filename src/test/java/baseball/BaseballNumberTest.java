package baseball;

class BaseballNumberTest {

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
}
