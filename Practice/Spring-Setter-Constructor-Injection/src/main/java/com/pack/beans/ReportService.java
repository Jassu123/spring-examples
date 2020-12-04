/**
 * 
 */
package com.pack.beans;

/**
 * @author siva
 *
 */
public class ReportService {
	private int totalPages;
	private int recordsPerPage;
	private IreportGenerator reportGenerator;

	/**
	 * @param totalPages
	 * @param recordsPerPage
	 */
	public ReportService(int totalPages, int recordsPerPage) {

		this.totalPages = totalPages;
		this.recordsPerPage = recordsPerPage;
	}

	public void setReportGenerator(IreportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}

	public void printReport() {
		reportGenerator.showReport(totalPages, recordsPerPage);
	}
}
