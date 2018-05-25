/*  1604861 2EP4-27 �������� */

public class MakeInputs {

	private int[] input; // �𓚂��i�[����z��
	private int[] answer; // �����̐������i�[����z��
	private int numberOfAnswers = 3; // �����̐����̐�

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
				throw new InputException("���͂������͈̔͊O�ł�");
			}
		} else {
			throw new InputException("���͂���ꏊ���Ԉ���Ă��܂�");
		}
	}

	public void inputAnswer(int index, String string) throws InputException {
		int answer;
		try {
			answer = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			throw new InputException("���͂������͈̔͊O�ł�");
		}
		inputAnswer(index, answer);
	}

	public int[] getInput() {
		return input;
	}

}
