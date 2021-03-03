package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report {

    private DatabaseConnector connector = makeConnection();

    public DatabaseConnector makeConnection() {
        return new MysqlDatabaseConnector();
    }

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    protected void runQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.runQuery(query);
    }

    protected void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
