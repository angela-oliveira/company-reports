package br.edu.ifpb.report.controller;

public abstract class ReportTemplate {

    public void generate() {
        this.createDatabaseConnection();
        this.executeDatBase();
        this.convert();
    }
    abstract void createDatabaseConnection();
    abstract void executeDatBase();
    abstract void convert();
}
