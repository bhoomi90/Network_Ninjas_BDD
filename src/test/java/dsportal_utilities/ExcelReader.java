package dsportal_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReader {

		public static void writeExcelSheet() throws IOException{
			 XSSFWorkbook workbook = new XSSFWorkbook();
			 XSSFSheet worksheet = workbook.createSheet("Sheet 1");
			 
			 int rowNum = 0;

				 Row row = worksheet.createRow(rowNum);
				 int colNum=0;

					Cell cell1 = row.createCell(colNum);
					cell1.setCellValue("print'hello'");
					
					Cell cell2 = row.createCell(1);
					cell2.setCellValue("prt'hello'");

			 
			 String path = System.getProperty("user.dir")+"/src/test/resources/TestCode/pythonCode.xlsx";
			 File Excelfile = new File(path);
			 FileOutputStream Fos = null;
			 try {
				Fos = new FileOutputStream(Excelfile);
				 workbook.write(Fos);
				 workbook.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
				Fos.close();  
			 }	  
		}
		
		public static void readExcelSheet() throws IOException {
			 String path = System.getProperty("user.dir")+"/src/test/resources/TestCode/pythonCode.xlsx";
			 File Excelfile = new File(path);
			 
			 FileInputStream Fis = new FileInputStream(Excelfile);
			 XSSFWorkbook workbook = new XSSFWorkbook(Fis);
			 XSSFSheet sheet = workbook.getSheet("Sheet 1");
			 
			 int rows = sheet.getLastRowNum();
			 System.out.println("Last ROW: "+rows);
			 int cols = sheet.getRow(0).getLastCellNum();
			 System.out.println("Last col: " +cols);
				
			 String validCode, invalidCode ;
			 
			 
			 for(int r=0; r<=rows; r++){		
				 for(int c=0;c<cols; c++){
				 	validCode = sheet.getRow(0).getCell(0).getStringCellValue();
				 	System.out.print(sheet.getRow(0).getCell(0).getStringCellValue());
				 	
					invalidCode = sheet.getRow(0).getCell(1).getStringCellValue();
				 	System.out.print(sheet.getRow(0).getCell(1).getStringCellValue());
				}
			}	
			 
			 workbook.close();
			 Fis.close();		
		}
		
		public static void main(String[] args) throws IOException {
	 		//writeExcelSheet();
	 		readExcelSheet();
		}
}
