package ExcelDataDrive_ApachePOI.DataDrive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_data_drive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
			/* create a object for XSSFWorkbook class
			 * using the object get access to sheet
			 * get access to all rows of the sheet
			 * access the specific row in all rows
			 * get access to all the cells of rows
			 * access the data from excel into array
			 * 
			 * */
			//
			FileInputStream fis = new FileInputStream("C:\\Users\\91999\\OneDrive\\Desktop\\Test_Data.xlsx");
			//create a object for XSSFWorkbook class
			XSSFWorkbook workbook_excel = new XSSFWorkbook(fis);
			
			Integer number_of_sheets = workbook_excel.getNumberOfSheets();
			
			for(int i =0; i<number_of_sheets;i++) {
				
				System.out.println(workbook_excel.getSheetName(i));
				
				
				if (workbook_excel.getSheetName(i).contentEquals("test")) {
					XSSFSheet sheet = workbook_excel.getSheetAt(i); //using the object get access to sheet
					/*
					 * after getting access to a particular sheet in the excel
					 * indentify the cell which is having test cases data
					 * from the test case cell column get the values of the data for which testcase we need
					 * 
					 * */
					Iterator<Row> rows = sheet.iterator();
				    Row firstrow = rows.next();
				    Iterator<Cell> cells = firstrow.cellIterator();// rows are collection of cells.
				    int k = 0;
				    int column_required = 0;
				    if(cells.hasNext()) {
				    	
				    	Cell value = cells.next();
				    	if(value.getStringCellValue().equalsIgnoreCase("age")) {
				    		
				    		column_required = k;
				    		break;
				    		
				    	}
				    	
				    	k = k+1;
				    }
					
				    System.out.println(k);
				    
				    while(rows.hasNext()) {
				    	
				    	Row r = rows.next();
				    	if(r.getCell(column_required).getStringCellValue().equalsIgnoreCase("test2")) {
				    		
				    		Iterator<Cell> required_value = r.cellIterator();
				    		while(required_value.hasNext()) {
				    			
				    			System.out.println(required_value.next().getStringCellValue());
				    		}
				    		
				    		
				    	}
				    }
					
					
				}
				
				
				
			}


		


	}



}
