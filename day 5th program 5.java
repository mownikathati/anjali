
    class LoginTracker {

    // static variable: shared by all users
    static int totalLogins = 0;

    // instance variable: unique for each user
    String sessionId;

    // constructor called on every login
    LoginTracker(String sessionId) {
        this.sessionId = sessionId;
        totalLogins++;   // increase total login count
    }

    void printLoginDetails() {
        System.out.println("Session ID: " + sessionId);
        System.out.println("Total Logins So Far: " + totalLogins);
        System.out.println("---------------------------");
    }
}

public class Application {
    public static void main(String[] args) {

        LoginTracker user1 = new LoginTracker("SID-101");
        user1.printLoginDetails();

        LoginTracker user2 = new LoginTracker("SID-102");
        user2.printLoginDetails();

        LoginTracker user3 = new LoginTracker("SID-103");
        user3.printLoginDetails();
    }
}

}