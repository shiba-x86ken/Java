public class Judges {

    private static GUI g = new GUI();
    //	private static MakeInputs mi = new MakeInputs();

    private static int hit = 0; // hit�̏����l

    /** �u���[�̐� */
    private static int blow = 0; // blow�̏����l

    public static boolean judge() {
        // �������f
        int[] ans = g.Answer();
        int[] input = g.Input();
        hit = 0;
        blow = 0;
        //      int[] input = mi.getInput();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && input[i] == ans[j]) {
                    hit++;
                } else if (input[i] == ans[j]) {
                    blow++;
                }
            }
        }
        return (hit == 3);
    }

    public int gethit() {
        return hit; // hit�̐���Ԃ�
    }

    public int getblow() {
        return blow; // blow�̐���Ԃ�
    }

}
