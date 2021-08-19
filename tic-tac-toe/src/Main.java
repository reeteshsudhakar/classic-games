import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // welcome statement and empty board
        System.out.println("Welcome to Tic Tac Toe! You know the rules, below is a board with positions listed.");
        System.out.println("\n " + 7 + " | " + 8 + " | " + 9 + " ");
        System.out.println("---+---+---");
        System.out.println(" " + 4 + " | " + 5 + " | " + 6 + " ");
        System.out.println("---+---+---");
        System.out.println(" " + 1 + " | " + 2 + " | " + 3 + " \n");
        System.out.println("Let's get started!");
        System.out.println();
        // used to store placements for X and O.
        char [] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        // inputs, variables, turn checker
        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn = 1;

        // game functions
        while (true) {
            // inputting stuff onto board when stuff isn't there
            do {
                System.out.print(turn + ", enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');
            pos[input - 1] = turn;

            // print board
            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " \n");

            // win conditions
            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[6] == turn && pos[3] == turn && pos[0] == turn
                    || pos[7] == turn && pos[4] == turn && pos[1] == turn
                    || pos[8] == turn && pos[5] == turn && pos[2] == turn
                    || pos[6] == turn && pos[4] == turn && pos[2] == turn
                    || pos[8] == turn && pos[4] == turn && pos[0] == turn) {
                System.out.println(turn + " is the winner!");
                break;
            }

            // switch turns
            if (turn == 'X') {
                turn = 'O';
            }
            else if (turn == 'O') {
                turn = 'X';
            }

            // check for draw
            currentTurn += 1;
            if (currentTurn > 9) {
                System.out.println("Draw!");
                break;
            }
        }
    }
}

// general template for a board
//   |    |
//-------------
//   |    |
//-------------
//   |    |

