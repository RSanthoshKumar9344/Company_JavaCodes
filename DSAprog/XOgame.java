package DSAprog;
import java.util.Scanner;

public class XOgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the board
        char[][] board = new char[3][3];
        char currentPlayer = 'X'; // Player 'X' starts
        boolean gameWon = false;
        boolean gameOver = false;

        // Fill the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // Main game loop
        while (!gameOver) {
            // Print the board
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }

            // Player input
            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (1-3) separated by space: ");
            int row = scanner.nextInt() - 1;  // Convert to 0-based index
            int col = scanner.nextInt() - 1;  // Convert to 0-based index

            // Validate the move
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                continue;  // Prompt for the move again
            }

            // Make the move
            board[row][col] = currentPlayer;

            // Check if the current player has won
            gameWon = false;
            for (int i = 0; i < 3; i++) {
                // Check rows and columns
                if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) || 
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                    gameWon = true;
                    break;
                }
            }

            // Check diagonals
            if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
                gameWon = true;
            }

            // Check if the game is a draw
            boolean draw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        draw = false;  // If there's any empty space, it's not a draw yet
                    }
                }
            }

            // Check game result
            if (gameWon) {
                gameOver = true;
                System.out.println("Player " + currentPlayer + " wins!");
            } else if (draw) {
                gameOver = true;
                System.out.println("It's a draw!");
            } else {
                // Switch player turn
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }
}
