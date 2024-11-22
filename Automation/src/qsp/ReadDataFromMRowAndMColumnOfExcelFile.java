package qsp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromMRowAndMColumnOfExcelFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./data/mROWmCOLUMN.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count1=wb.getSheet("Sheet1").getLastRowNum();
		int count2=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		for(int i=1;i<=count1;i++) {
			
			for(int j=0;j<count2;j++) {
				String mRC = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(mRC);
			}
          
		}
		System.out.println();
	}}
