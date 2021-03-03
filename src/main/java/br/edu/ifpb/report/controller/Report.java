package br.edu.ifpb.report.controller;

public abstract class Report {

    public void generate() {
        createDatabaseConnection();
        runQuery();
        convertToFile();
    }

    protected abstract void convertToFile();

    protected abstract void runQuery();

    protected abstract void createDatabaseConnection();

}
