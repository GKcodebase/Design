package LLD.TicTacToe;

/**
 * The type Cell.
 */
public class Cell {
    /**
     * The Row.
     */
    int row;
    /**
     * The Col.
     */
    int col;
    /**
     * The Piece.
     */
    Piece piece;

    /**
     * Instantiates a new Cell.
     *
     * @param row   the row
     * @param col   the col
     * @param piece the piece
     */
    public Cell(int row, int col, Piece piece) {
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    /**
     * Gets row.
     *
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * Sets row.
     *
     * @param row the row
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Gets col.
     *
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * Sets col.
     *
     * @param col the col
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Gets piece.
     *
     * @return the piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Sets piece.
     *
     * @param piece the piece
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
