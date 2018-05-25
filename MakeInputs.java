/*  1604861 2EP4-27 Äú±Œ¤–è */

public class MakeInputs {

	private int[] input; // ‰ğ“š‚ğŠi”[‚·‚é”z—ñ
	private int[] answer; // “š‚¦‚Ì”š‚ğŠi”[‚·‚é”z—ñ
	private int numberOfAnswers = 3; // “š‚¦‚Ì”š‚Ì”

	/*public MakeInputs(int[] answer) {
		input = new int[numberOfAnswers];
		this.answer = answer;
		for (int i = 0; i < numberOfAnswers; i++) {
			inputAnswer(i, answer[i]);
		}
	}*/

	public MakeInputs() {
		input = new int[numberOfAnswers];
		answer = new int[numberOfAnswers];
	}

	public void inputAnswer(int index, int answer) throws InputException {
		if (index > -1 && index < numberOfAnswers) {
			if (answer > 0 && answer <= 6) {
				input[index] = answer;
			} else {
				throw new InputException("“ü—Í‚ª“š‚¦‚Ì”ÍˆÍŠO‚Å‚·");
			}
		} else {
			throw new InputException("“ü—Í‚·‚éêŠ‚ğŠÔˆá‚Á‚Ä‚¢‚Ü‚·");
		}
	}

	public void inputAnswer(int index, String string) throws InputException {
		int answer;
		try {
			answer = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			throw new InputException("“ü—Í‚ª“š‚¦‚Ì”ÍˆÍŠO‚Å‚·");
		}
		inputAnswer(index, answer);
	}

	public int[] getInput() {
		return input;
	}

}
