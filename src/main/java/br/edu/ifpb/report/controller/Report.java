package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class Report {

    public abstract DatabaseConnector makeConnection();

    public void generate() {
        createDatabaseConnection();
        runQuery();
        convertToFile();
    }

    protected abstract void convertToFile();

    protected abstract void runQuery();

    protected abstract void createDatabaseConnection();

}
