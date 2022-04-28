package addressbook;

import java.sql.SQLException;

import addressbook.view.CustomerConsole;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        CustomerConsole customerConsole = new CustomerConsole();
        customerConsole.start();
    }

}
