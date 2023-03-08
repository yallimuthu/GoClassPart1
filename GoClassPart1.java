class GoClassPart1 {

    private final int boardLength = 19;
    private final String emptyCell = " E ";
    private final String blackStone = " B ";
    private final String whiteStone = " W "; 
    private String whoseTurn = "  ";

    private String[][] board = new String[boardLength][boardLength];

    GoClassPart1() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }

        whoseTurn =  blackStone;
    }

    private void changeTurn() {
        if (whoseTurn == blackStone) {
            whoseTurn = whiteStone;
        } else {
            whoseTurn = blackStone;
        }
    }

    public void updateBoard(int x, int y) {
        if (x >= boardLength
            || x < 0 
            || y >= boardLength 
            || y < 0) {
                System.out.println("invalid coordinate x: " + x + "y: " + y);
            } 

        if (board[x][y] != emptyCell) {
            System.out.println("invalid move. cell not empty");
        } else {
            board[x][y] = whoseTurn;
            changeTurn();
        }
    }

    public void initializeBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = " X ";
    }

    public void printBoard() {
        System.out.println("current turn: " + whoseTurn);
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}

class GoClassPart1Demo {
    public static void main(String[] args) {
        GoClassPart1 board = new GoClassPart1();
        board.printBoard();
        board.updateBoard(0, 0);
        board.printBoard();
        board.updateBoard(0, 1);
        board.printBoard();
board.updateBoard(0,1);
    }
}