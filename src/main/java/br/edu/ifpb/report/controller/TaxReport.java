package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.Connector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class TaxReport extends ReportTemplate {

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    // public void generate() {
    //     createDatabaseConnection();
      //  executeMySQLQuery();
        //convertToPDF();
    // }
    //@Override
    //public void createDatabaseConnection() {
      //  System.out.println("Creating Database Connection...");
        //connector.openConnection();
    //}

    @Override
    protected Connector getConnector() {
    	return new PostgreSQLDatabaseConnector();
    }

    @Override
    public void executeDatBase() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }
    @Override
    public void convert() {
        System.out.println("Converting To PDF...");
    }


}
