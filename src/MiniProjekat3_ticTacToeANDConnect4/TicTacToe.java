package MiniProjekat3_ticTacToeANDConnect4;


import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.control.*;

/*
 * Tic Tac Toe igra iz knjige, sa malim izmjenama
 */

public class TicTacToe extends Application {
	// napravi stage
	Stage window;
	// kreiraj scene
	Scene scene1, scene2;
	// Odabir ciji je red za igru, by default je X igrac
	private char whoseTurn = 'X';

	// Napravi polja za igru
	private Cell[][] cell = new Cell[3][3];

	// Kreiraj i inicijaliziraj opis
	private Label lblStatus = new Label("X's turn to play");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;

		// Button 1
		Label label1 = new Label("Welcome to the game Tic Tac Toe");
		// kreiraj button za novu igru
		Button button1 = new Button("New game");
		// postavi button aktivan
		button1.setOnAction(e -> window.setScene(scene2));
		// kreiraj button za izlaz
		Button exitButton = new Button("Exit");
		exitButton.setOnAction(e -> window.close());

		// Layout 1 za prvi scene
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1, exitButton);
		// postavi centrirarano buttone i ispis
		layout1.setAlignment(Pos.CENTER);

		scene1 = new Scene(layout1, 300, 200);
		// Pane koji drzi polja
		GridPane pane = new GridPane();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				pane.add(cell[i][j] = new Cell(), j, i);

		// Button 2
		Button button2 = new Button("Home");
		// restartovanje aplikacije
		button2.setOnAction(e -> {
			window.setScene(scene1);
			System.out.println("Restarting app!");
			window.close();
			Platform.runLater(() -> new TicTacToe().start(new Stage()));
		});

		window.setScene(new Scene(new StackPane(button2)));
		// Drugi prikaz
		BorderPane borderPane = new BorderPane();
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		borderPane.setCenter(pane);
		borderPane.setTop(layout2);
		borderPane.setBottom(lblStatus);
		scene2 = new Scene(borderPane, 600, 300);

		// Prikazi najprije prvu scenu
		window.setScene(scene1);
		window.setTitle("Tic Tac Toe");
		window.show();
	}

	// provjeri jesu li sva polja ispunjena
	public boolean isFull() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (cell[i][j].getToken() == ' ')
					return false;
		return true;
	}

	// provjeri za pobjedu
	public boolean isWon(char token) {
		for (int i = 0; i < 3; i++)
			if (cell[i][0].getToken() == token && cell[i][1].getToken() == token && cell[i][2].getToken() == token) {
				return true;
			}

		for (int j = 0; j < 3; j++)
			if (cell[0][j].getToken() == token && cell[1][j].getToken() == token && cell[2][j].getToken() == token) {
				return true;
			}

		if (cell[0][0].getToken() == token && cell[1][1].getToken() == token && cell[2][2].getToken() == token)

		{
			return true;

		}

		if (cell[0][2].getToken() == token && cell[1][1].getToken() == token && cell[2][0].getToken() == token) {
			return true;

		}

		return false;
	}

	// Klasa za polje
	public class Cell extends Pane {
		// Token koristen za polje
		private char token = ' ';

		public Cell() {
			setStyle("-fx-border-color: black");
			this.setPrefSize(2000, 2000);
			this.setOnMouseClicked(e -> handleMouseClick());

		}

		// vrati token
		public char getToken() {
			return token;

		}

		// Napravi tokene (iks i oks)
		public void setToken(char c) {
			token = c;

			if (token == 'X') {
				Line line1 = new Line(10, 10, this.getWidth() - 10, this.getHeight() - 10);
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				Line line2 = new Line(10, this.getHeight() - 10, this.getWidth() - 10, 10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));

				// dodaj dvije linije kao iks
				this.getChildren().addAll(line1, line2);
			}

			else if (token == 'O') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
				ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.WHITE);

				getChildren().add(ellipse); // dodaj elipsu kao oks
			}
		}

		/* Handle a mouse click event */
		private void handleMouseClick() {
			// Ukoliko je polje prazno i igra nije gotova
			if (token == ' ' && whoseTurn != ' ') {
				setToken(whoseTurn); // Postavi token u polje

				// Check game status
				if (isWon(whoseTurn)) {
					lblStatus.setText(whoseTurn + " won! The game is over");
					whoseTurn = ' '; // Igra je zavrsena

				} else if (isFull()) {
					lblStatus.setText("Draw! The game is over");
					whoseTurn = ' '; // Igra je zavrsena

				} else {
					// Promijeni red za igru
					if (whoseTurn == 'X')
						whoseTurn = 'O';
					else
						whoseTurn = 'X';
					// Prikazi ciji je red za igru
					lblStatus.setText(whoseTurn + "'s turn to play ");

				}
			}
		}

	}
}
