package br.edu.ifpb.report.database;

public interface Connector {

	  public void openConnection();
	  public void executeQuery(String query);

}
