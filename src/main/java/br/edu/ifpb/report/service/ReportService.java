package br.edu.ifpb.report.service;

// import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.ReportTemplate;
// import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    // ExpenseReport expenseReport = new ExpenseReport();
    // TaxReport taxReport = new TaxReport();

    public void generateReport(ReportTemplate report) {
    	
    	report.generate();
    }

}
