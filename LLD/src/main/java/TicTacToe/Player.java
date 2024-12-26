package TicTacToe;

/**
 * The type Player.
 */
public class Player extends User {

    /**
     * The Piece.
     */
    private final Piece piece;

    /**
     * Instantiates a new Player.
     *
     * @param userName the user name
     * @param userId   the user id
     * @param piece    the piece
     */
    public Player(String userName, String userId, Piece piece) {
        super(userName, userId);
        this.piece = piece;
    }

    /**
     * Gets piece.
     *
     * @return the piece
     */
    public Piece getPiece() {
        return piece;
    }

}
