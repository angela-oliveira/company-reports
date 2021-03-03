package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report {

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    protected void runQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    protected void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
