public class MakeAnswers {

    /** 解答を格納する配列 */
    private int[] answer;

    /** 答えの数字の数。将来的に拡張する事を考慮して作成 */
    private int numberOfAnswers = 3;

    /** 乱数の幅。この場合、1から6までとなる */
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
     * 答えを作成する。
     * 答えの数が変更されることも考え、numberOfAnswersと照合する。
     */
    public void makeAnswer() {
        if (answer.length != numberOfAnswers) {
            answer = new int[numberOfAnswers];
        }
        for (int i = 0; i < answer.length; i++) {
            //自分より前の要素にかぶるやつがないか確かめる。
            //あったらもう1回random
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