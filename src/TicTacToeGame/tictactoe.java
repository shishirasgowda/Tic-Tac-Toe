package TicTacToeGame;

public class tictactoe {
	{	
		static char[][] tBoard = new char[3][3];
		
		
		public static void createBoard()
		{
			for(int i=0; i<tttBoard.length; i++)
			{
				for (int j=1; j<tBoard.length; j++)
				{	
					tBoard[i][j] = ' '; 
				}
			}
		}
		
		public static void main(String[] args) 
		{	
			//calling the createBoard method
			createBoard();
		}
	}
}
