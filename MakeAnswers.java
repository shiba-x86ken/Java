public class MakeAnswers {

    /** �𓚂��i�[����z�� */
    private int[] answer;

    /** �����̐����̐��B�����I�Ɋg�����鎖���l�����č쐬 */
    private int numberOfAnswers = 3;

    /** �����̕��B���̏ꍇ�A1����6�܂łƂȂ� */
    private int widthOfRandom = 6;

    public MakeAnswers() {
        answer = new int[numberOfAnswers];
        makeAnswer();
    }

    public MakeAnswers(int numberOfAnswers) {
        this.numberOfAnswers = numberOfAnswers;
        answer = new int[numberOfAnswers];
        makeAnswer();
    }

    /**
     * �������쐬����B
     * �����̐����ύX����邱�Ƃ��l���AnumberOfAnswers�Əƍ�����B
     */
    public void makeAnswer() {
        if (answer.length != numberOfAnswers) {
            answer = new int[numberOfAnswers];
        }
        for (int i = 0; i < answer.length; i++) {
            //�������O�̗v�f�ɂ��Ԃ����Ȃ����m���߂�B
            //�����������1��random
            boolean flag = false;
            answer[i] = (int) (Math.random() * widthOfRandom + 1);
            do {
                flag = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (answer[i] == answer[j]) {
                        flag = true;
                        answer[i] = (int) (Math.random() * widthOfRandom + 1);
                    }
                }

            } while (flag == true);
        }
    }

    public int[] getAnswer() {
        return answer;
    }

}