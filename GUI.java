import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GUI extends Application {
	private static ChoiceBox<String> choiceBox1; // チョイスボックス
	private static ChoiceBox<String> choiceBox2; // チョイスボックス
	private static ChoiceBox<String> choiceBox3; // チョイスボックス
	TextArea textArea; // テキストエリア
	Button button; // ボタン
	private static MakeAnswers ma = new MakeAnswers();
	private static Judges j = new Judges();
	private static MakeInputs mi = new MakeInputs();
	static int[] input = new int[3];

	public void start(Stage stage) {
		stage.setTitle("数当てゲーム");
		stage.setWidth(500);
		stage.setHeight(350);

		choiceBox1 = new ChoiceBox<>();
		choiceBox1.getItems().addAll("1", "2", "3", "4", "5", "6");
		choiceBox1.setValue("1");

		choiceBox2 = new ChoiceBox<>();
		choiceBox2.getItems().addAll("1", "2", "3", "4", "5", "6");
		choiceBox2.setValue("1");

		choiceBox3 = new ChoiceBox<>();
		choiceBox3.getItems().addAll("1", "2", "3", "4", "5", "6");
		choiceBox3.setValue("1");

		button = new Button("ジャッジ");
		button.setOnAction(event -> buttonPressed());

		textArea = new TextArea("数字１\t数字２\t数字３\tヒット\t\tブロー\t");

		VBox box = new VBox(3);
		box.setPadding(new Insets(20, 25, 25, 25));

		box.getChildren().addAll(choiceBox1, choiceBox2, choiceBox3, button);

		BorderPane root = new BorderPane();
		root.setLeft(box);
		root.setCenter(textArea);

		stage.setScene(new Scene(root));
		stage.show();
	}

	void buttonPressed() {

		input[0] = Integer.parseInt(choiceBox1.getValue());
		input[1] = Integer.parseInt(choiceBox2.getValue());
		input[2] = Integer.parseInt(choiceBox3.getValue());

		j.judge();
		//		textArea.clear();
		textArea.appendText("\n\t" + choiceBox1.getValue());
		textArea.appendText("\t\t" + choiceBox2.getValue());
		textArea.appendText("\t\t" + choiceBox3.getValue());
		textArea.appendText("\t\t" + j.gethit());
		textArea.appendText("\t\t" + j.getblow());

		// 終了条件
		int judgehit = j.gethit();
		if (judgehit == 3) {
			textArea.appendText("\n-----------全ての数字がヒットしました。-----------");
		}

	}

	// MakeInputsとjudgesで使う
	public static int[] Input() {
		input[0] = Integer.parseInt(choiceBox1.getValue());
		input[1] = Integer.parseInt(choiceBox2.getValue());
		input[2] = Integer.parseInt(choiceBox3.getValue());
		try {
			for (int i = 0; i < 3; i++) {
				mi.inputAnswer(i, input[i]);
			}
		} catch (InputException e) {

		}

		return input;
	}

	// judgesで使う
	public static int[] Answer() {
		int[] answer = ma.getAnswer();
		return answer;
	}

	public static void main(String[] args) {
		//コンソールに表示させる。確認用
		int[] ans = ma.getAnswer();
		System.out.println("答え");
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}

		launch();

		//////確認用///////
		/*
		input[0] = Integer.parseInt(choiceBox1.getValue());
		input[1] = Integer.parseInt(choiceBox2.getValue());
		input[2] = Integer.parseInt(choiceBox3.getValue());
		
		System.out.println();
		    System.out.println("入力");
		    for (int i = 0; i < input.length; i++) {
		        System.out.print(input[i]);
		    }
		*/

		/*
		int[] in = new int[3];
		in = Input();
		
		System.out.println();
		    System.out.println("入力");
		    for (int i = 0; i < input.length; i++) {
		        System.out.print(in[i]);
		    }
		*/

		/*
		System.out.println();
		System.out.println("hit");
		System.out.print(j.hit);
		
		System.out.println();
		System.out.println("blow");
		System.out.print(j.blow);
		System.out.println();
		*/

	}
}
