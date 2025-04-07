package executeAround;

import java.util.function.Consumer;

public class DBConnection {
    private String connection;

    private DBConnection(String connection) {
        this.connection = connection;
        System.out.println("Created DB Connection" + "/" + connection);
    }


    private void close(){
        System.out.println("Closing DB Connection" + "/" + connection);
    }
    public DBConnection checkConnection() {
        if(!connection.isEmpty()) {
            System.out.println("DB Connection is established");
        } else {
            System.out.println("DB Connection is not established");
        }
        return this;
    }

    public DBConnection connect() {
        System.out.println("Connecting to " + connection);
        return this;
    }


    public static void use(String connection, Consumer<DBConnection> dbConsumer) {
        DBConnection dbConnection = new DBConnection(connection);

        try{
            dbConsumer.accept(dbConnection);
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConnection.close();
        }
    }
}
