package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements Connector{

    public void openConnection() {
        System.out.println("Create mysql connetion");
    }

    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
