/*  1604861 2EP4-27 柴﨑研冶 */

public class InputException extends Exception { // java.lang.Exceptionを継承
    public InputException(String message) {
        // スーパークラスのコンストラクタにメッセージを設定(MakeInputsクラス)
        super(message);
    }
}
