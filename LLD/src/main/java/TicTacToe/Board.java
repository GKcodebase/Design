package TicTacToe;

/**
 * The type Board.
 */
public class Board {

    /**
     * The Boxes.
     */
    public Cell[][] boxes;
    /**
     * The No of cell.
     */
    private final int noOfCell;

    /**
     * Instantiates a new Board.
     *
     * @param noOfCell the no of cell
     */
    public Board(int noOfCell) {
        this.noOfCell = noOfCell;
        boxes = new Cell[noOfCell][noOfCell];
        initializeBoard();
    }

    /**
     * Get boxes cell [ ] [ ].
     *
     * @return the cell [ ] [ ]
     */
    public Cell[][] getBoxes() {
        return boxes;
    }

    /**
     * Sets boxes.
     *
     * @param boxes the boxes
     */
    public void setBoxes(Cell[][] boxes) {
        this.boxes = boxes;
    }

    /**
     * Print board status.
     */
    public void printBoardStatus() {
        System.out.println(" ----------------------");
        for (int i = 0; i < noOfCell; i++) {
            for (int j = 0; j < noOfCell; j++) {
                if(boxes[i][j].getPiece() == null){
                    System.out.print(" | " + "  " + " | ");
                }else {
                    System.out.print(" | " + boxes[i][j].getPiece() + "  | ");
                }
            }
            System.out.println();
            System.out.println(" ----------------------");
        }
    }

    /**
     * Initialize board.
     */
    public void initializeBoard() {
        for (int i = 0; i < noOfCell; i++) {
            for (int j = 0; j < noOfCell; j++) {
                boxes[i][j] = new Cell(i, j, null);
            }
        }
        System.out.println("GAME STARTED");
        printBoardStatus();
    }

}
