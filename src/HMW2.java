/* Tyler Nunez CMPS 280-02 HMW2
 * Keep Away Chess
 * When your program starts, it should ask the user if they want to play with Rooks 
 * (which move horizontally and vertically) or Bishops (which move diagonally).  
 * Your program should then take turns asking Player 1 and Player 2 where they want to place their next piece,
 * add this piece to the board, and then check to see if this causes the player to lose.
 */
import java.util.Scanner;
public class HMW2 {
//Main Method plays the Game, goes through turns and checks if the game is over or not.
	public static void main(String[] args) {
		String[][] board = getGameBoard();
		int turn = 1;
		int choice1 = choosePiece();
		int choice2 = player2Choice(choice1);
		printBoard(board,0,0,0);
		while(gameState() == 1){
		System.out.println("Turn "+ turn  +": Player one ");
		printBoard(board,getRow(),getColumn(), choice1);
		//2 indicates Failure
		if(gameState()==2){
			System.out.println("Sorry, you lose.");
			System.exit(0);
		}
		System.out.println("Turn "+ turn +": Player two ");
		printBoard(board,getRow(),getColumn(),choice2);
		if(gameState()==2){
			System.out.println("Sorry, you lose.");
			System.exit(0);
		}
		++turn;
		}
		

	}
	//Gets the Coordinate for Row
	public static int getRow(){
		Scanner chooseRow = new Scanner(System.in);
		System.out.println("Enter a Row: ");
		int row = chooseRow.nextInt();
		
		return row;	
	}
	//Gets the Coordinate for Column
	public static int getColumn(){
		Scanner chooseColumn = new Scanner(System.in);
		System.out.println("Enter a Column: ");
		int column = chooseColumn.nextInt();
		
		return column;	
	}
	//Lets the players decide the pieces
	public static int choosePiece(){
		Scanner choosePiece = new Scanner(System.in);
		System.out.println("Player One, choose your piece: " + '\n' + "1.) Bishop" + '\n' + "2.) Rook");
		System.out.println("Enter 1 or 2: ");
		int choice = choosePiece.nextInt();
		return choice;
	}
	//Makes the piece of Player 2 the opposite of player 1
	public static int player2Choice(int playerOneChoice){
		int choice = 0; 
		if(playerOneChoice == 1){
			choice = 2;
		}else{}
		if(playerOneChoice == 2){
			choice = 1;
		}else{}
		return choice;
	}
	//creates the 8x8 array to store piece values
	public static String[][] getGameBoard(){
		String[][] gameBoardValues = {{" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "},
				                      {" "," "," "," "," "," "," "," "}};
		
		
		return gameBoardValues;
	}
	//Used to print out the game board
	public static void printBoard(String[][] gameBoard,int row, int column, int piece){
		//Places the Pieces in the appropriate space
		if(piece == 1){
			gameBoard[row][column] = "B";
		}
		else if(piece == 2){
			gameBoard[row][column] = "R";
		}else{
		}
		for(int i=0;i<8;++i){
			for(int j=0;j<8;++j){
				if(j== 0){
					System.out.println("+---+---+---+---+---+---+---+---+");
				}
				System.out.print("| ");
				System.out.print(gameBoard[i][j] + " ");
				if(j==7){
					System.out.println("|");
				}
				if(i + j == 14){
					System.out.println("+---+---+---+---+---+---+---+---+");
				}
				
			}
			
		}
			
	
		
	}
	
	public static int gameState(){
		int state = 1;
		return state;
	}

}