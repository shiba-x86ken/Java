public class Judges {

    private static GUI g = new GUI();
    //	private static MakeInputs mi = new MakeInputs();

    private static int hit = 0; // hitの初期値

    /** ブローの数 */
    private static int blow = 0; // blowの初期値

    public static boolean judge() {
        // 答え判断
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
        return hit; // hitの数を返す
    }

    public int getblow() {
        return blow; // blowの数を返す
    }

}
