package dsportal_Commons;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class ExcelReader {
	
	@DataProvider 
	public static String[][] getTestData() throws Exception {
        FileInputStream fis = new FileInputStream("src/test/resources/TestData/Excel_TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("SheetName");

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rows][cols];

        for (int r = 1; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                data[r - 1][c] = (cell == null) ? "" : cell.getStringCellValue();
            }
        }
        workbook.close();
        fis.close();
        System.out.println(data);
        return data;
    }
}


