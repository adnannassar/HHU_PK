package Exception;

public class FinalyExample {

    public static void main(String[] args) {
        DbConnection db = new DbConnection();
        try {
            db.openConnection("Admin", "12345");
            readDataFromDb(db);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            db.closeConnection();
        }
    }

    static void readDataFromDb(DbConnection db) {
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " Item");
        }
    }
}

class DbConnection {
    String connectionStatus;

    void openConnection(String username, String password) throws Exception {
        if (username.equals("Admin") && password.equals("12345")) {
            System.out.println("Connected to DB");
            this.connectionStatus = "Opened!";
            System.out.println("Status: " + this.connectionStatus);

        } else {
            throw new Exception("Es ist etwas schief gelaufen!");
        }
    }

    void closeConnection() {
        this.connectionStatus = "Closed!";
        System.out.println("Status: " + this.connectionStatus);
    }

}
