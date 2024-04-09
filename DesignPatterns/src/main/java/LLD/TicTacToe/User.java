package LLD.TicTacToe;

/**
 * The type User.
 */
public class User {
    /**
     * The User name.
     */
    String userName;
    /**
     * The User id.
     */
    final String  userId;

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param userId   the user id
     */
    public User(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

}
