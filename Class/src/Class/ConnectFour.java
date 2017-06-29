package Class;

import java.util.Arrays;
	import java.util.Scanner;
public class ConnectFour {
	

	
		private final int width;
		private final int height;
		 private final char [] [] board;
		 private final static char[] players = new char[] {'X','O'};
		 private final char empty = '_';
		 private int lastRow = -1;
		 private int lastColumn = -1;
		 public ConnectFour (int width, int height){
			 this.width = width;
			 this.height = height;
			 board = new char[height][];
			 for(int i = 0; i < height;i++){
				 Arrays.fill(board[i] = new char[width], empty);
			 }
			 
			 
		 }
		 public String toString(){
			 StringBuilder stringBuilder = new StringBuilder();
			 for(int j = 0; j < height; j++){
				 for(int i = 0; i < width; i++){
					 stringBuilder.append(board[j][i]);
					 stringBuilder.append(" ");
				 }
				 stringBuilder.append("\n");
			 }
			 return stringBuilder.toString();
		 }
	public void makeTurn(char badge, Scanner input){
		do{
			System.out.println("\nPlayer " + badge +" turn:");
			int column = input.nextInt();
			if (column < 0 || column >= width){
				System.out.println("Please enter a number between 0 and" +(width - 1));
				continue;
				
			}
			for(int i = height - 1; i >= 0;i--){
				if(board[i][column] == empty){
					board[lastRow = i][lastColumn = column]= badge;
					return;
				}
			}
			System.out.println("Column" + column + "is full.");
		}while (true);
	}
		public boolean hasWinningCombination(){
			if(lastColumn == -1){
				return false;
			}
			char badge = board[lastRow][lastColumn];
			String winningCombination = String.format("%c%c%c%c",badge,badge,badge,badge);
			return horizontal().contains(winningCombination)||
					vertical().contains(winningCombination)||
					diagonal().contains(winningCombination)||
					backDiagonal().contains(winningCombination);
		}
		private String horizontal(){
			return new String(board[lastRow]);
		}
		private String vertical(){
			StringBuilder sb = new StringBuilder(height);
			for (int i = 0; i< height;i++){
				sb.append(board[i][lastColumn]);
			}
			return sb.toString();
		}
		private String diagonal(){
			StringBuilder sb = new StringBuilder(height);
			for(int i = 0; i < height; i++){
				int j = lastColumn + lastRow - i;
				if(0 <=j && j < width){
					sb.append(board[i][j]);
				}
			}
			return sb.toString();
		}
		private String backDiagonal(){
			StringBuilder sb = new StringBuilder(height);
			for(int i = 0; i < height; i++){
				int j = lastColumn - lastRow + i;
				if(0 <=j && j < width){
					sb.append(board[i][j]);
				}
			}
			return sb.toString();
		}
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			ConnectFour board = new ConnectFour(7,6);
			System.out.println("Connect 4 game. Welcome! :)");
			System.out.println("Enter a number between 0 and 6 for choosing a column.");
			System.out.println(board);
			int moves = 6 * 7;
			int player = 0;
			do{
				char badge = players[player];
				board.makeTurn(badge, input);
				System.out.println(board);
				if(board.hasWinningCombination()){
					System.out.println("Player " + badge + " has won!");
					return;
				}
				player = 1 - player;
				--moves;
				if(moves == 0){
					break;
				}
				
			}while (true);
			System.out.println("Game over, nobody has won.");
		}
	}