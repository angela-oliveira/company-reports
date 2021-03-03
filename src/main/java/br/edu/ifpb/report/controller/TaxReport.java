package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report {

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    protected void runQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    protected void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
