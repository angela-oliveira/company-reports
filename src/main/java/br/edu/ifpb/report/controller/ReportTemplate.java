package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.Connector;

public abstract class ReportTemplate {

    abstract protected Connector getConnector();
    protected Connector connector;
    public void generate() {
        this.createDatabaseConnection();
        this.executeDatBase();
        this.convert();
    }
    public void createDatabaseConnection() {

        System.out.println("Creating Database Connection...");
        this.connector = this.getConnector();
        connector.openConnection();
    };
    abstract void executeDatBase();
    abstract void convert();
}
