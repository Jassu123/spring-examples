/**
 * 
 */
package com.pack.beans;

/**
 * @author siva
 *
 */
public class ExcelReportGenerator implements IreportGenerator {

	@Override
	public void showReport(int tp, int rp) {
		// TODO Auto-generated method stub
		System.out.println("report generated for :   "+  tp  +"   pages with records   "+  rp  +" pagesin excel format");
	}

}
