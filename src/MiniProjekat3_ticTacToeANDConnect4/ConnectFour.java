package MiniProjekat3_ticTacToeANDConnect4;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class ConnectFour extends Application {
	private char player = 'R';

	// pravimo board / matricu velicine 6 * 7
	private CellX[][] board = new CellX[6][7];

	private Label statusLabel = new Label("Igra crveni.");

	//  priprema za pravljenje izgleda igre
	public void start(Stage pocetniStage) {
		GridPane grid1 = new GridPane();
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				grid1.add(board[i][j] = new CellX(), j, i);

		// nakon petlje, dodajemo tu sve u grid
		// te njega dodajemo u naš "box"
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(grid1);
		borderPane.setBottom(statusLabel);

		// main - frame box u koji smještamo kutijce za klikanje
		// visina x širina igre je 700 x 600
		Scene scena = new Scene(borderPane, 700, 600);
		// na vrhu stavljamo koja je igra
		pocetniStage.setTitle("ConnectFour igra");
		pocetniStage.setScene(scena);
		pocetniStage.show();
	}
//provjerava je li se doslo do kraja
	public boolean checkFull() {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				if (board[i][j].vratiToken() == ' ')
					return false;
		return true;
	}

	public boolean checkWin(char token) {
		//check rows
		for (int i = 0; i < 6; i++)
			for(int j=0; j<4; j++){
			if (board[i][j].vratiToken() == token && board[i][j+1].vratiToken() == token
					&& board[i][j+2].vratiToken() == token && board[i][j+3].vratiToken() == token) {
				return true;
			}
			}
		
		//check columns
		for (int i = 0; i < 7; i++)
			for(int j=0; j<3; j++){
			if (board[j][i].vratiToken() == token && board[j+1][i].vratiToken() == token
					&& board[j+2][i].vratiToken() == token && board[j+3][i].vratiToken() == token) {
				return true;
			}
	
			}
		int rowMax=board.length;
		int colMax=board[0].length;
			
		 // ascendingDiagonalCheck 
	    for (int i=3; i<rowMax; i++){
	        for (int j=0; j<colMax-3; j++){
	            if (board[i][j].vratiToken() == token && board[i-1][j+1].vratiToken() == token && board[i-2][j+2].vratiToken() == token && board[i-3][j+3].vratiToken() == token)
	                return true;
	        }
	    }
	    // descendingDiagonalCheck
	    for (int i=3; i<rowMax; i++){
	        for (int j=3; j<colMax; j++){
	            if (board[i][j].vratiToken() == token && board[i-1][j-1].vratiToken() == token && board[i-2][j-2].vratiToken() == token && board[i-3][j-3].vratiToken() == token)
	                return true;
	        }
	    }

		return false;
	}

	public class CellX extends Pane {
		// ispunjavamo je praznim mjestima, na koje mogu ici R ili Y
		private char token1 = ' ';

		public CellX() {
			setStyle("-fx-border-color: black");
			this.setPrefSize(2000, 2000);
			this.setOnMouseClicked(e -> onMouseClick());
		}

		// vraca token onog igraca koji je pritisnuo u odredjeno polje
		public char vratiToken() {
			return token1;
		}

		// postavlja novi token
		public void postaviToken(char x) {
			token1 = x;
			
	
			// pravimo vizuelni token "R" - crveni krug
			if (token1 == 'R') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));

				ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.RED);
				getChildren().add(ellipse);

				// te pravimo vizuelni izgled tokena "Y" - žuti krug
			} else if (token1 == 'Y') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));

				ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.YELLOW);
				getChildren().add(ellipse);
			}
		}

		private void onMouseClick() {
			// ako celija je prazna i nije kraj
			if (token1 == ' ' && player != ' ') {
				// postavlja token trenutnog igraca u to polje
				postaviToken(player);

				// provjerava status igre
				if (checkWin(player)) {
					statusLabel.setText(player + " je pobijedio! Game Over");
					player = ' ';
				} else if (checkFull()) {
					statusLabel.setText("Neriješeno!");
					player = ' ';
				} else {
					// promjena reda
					player = (player == 'R') ? 'Y' : 'R';
					// ispisuje ko je na redu u status labelu
					statusLabel.setText(player + " je na redu.");
				}
			}
		}
	}
	
	public static void main(String[] args){
		launch(args);
	}
}