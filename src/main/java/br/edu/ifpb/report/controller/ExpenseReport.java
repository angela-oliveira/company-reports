package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.Connector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends ReportTemplate {

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    //public void generate() {
      //  createDatabaseConnection();
        //executePostgresQuery();
        //convertToXLS();
    //}

    //public void createDatabaseConnection() {
      //  System.out.println("Creating Database Connection...");
      // connector.openConnection();
    //}
    
    @Override
    protected Connector getConnector() {
    	return new PostgreSQLDatabaseConnector();
    }

    @Override
    public void executeDatBase() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.executeQuery(query);
    }

    @Override
    public void convert() {
        System.out.println("Converting To XLS...");
    }


}
