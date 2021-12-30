package testngtraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class readdatafromexcel {
	
	public static void getdatafromexcel() throws IOException{
		//Apache POI jar is used to read data from excel sheet
		ArrayList<String> data = new ArrayList<>();
		System.out.println("coming here");
		//get the excel sheet
		FileInputStream fis = new FileInputStream("C:\\Users\\Yerapa.Reddy\\Documents\\userDetails.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);
		for(int i=0;i<sheets;i++){
			System.out.println(workbook.getSheetName(i));
			if(workbook.getSheetName(i).equalsIgnoreCase("Data")){
				System.out.println("coming here");
				//get the sheet data
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows= sheet.iterator();
				while(rows.hasNext()){
					Row row = rows.next();
					Iterator<Cell> col = row.cellIterator();
					int column=0;
					int columnindex=0;
					while(col.hasNext()){
						Cell value = col.next();
						if(value.getStringCellValue().equalsIgnoreCase("Username")){
							columnindex=column;
						}
						column++;
					}
					System.out.println(row.getCell(columnindex).getStringCellValue());
					/*if(row.getCell(columnindex).getStringCellValue().equalsIgnoreCase("virat")){
						Iterator<Cell> cl = row.cellIterator();
						while(cl.hasNext()){
						Cell c = cl.next();
						data.add(String.valueOf(c.getStringCellValue()));
						}
					}*/
					Iterator<Cell> cl = row.cellIterator();
					while(cl.hasNext()){
					Cell c = cl.next();
					System.out.println(c.getStringCellValue());
					data.add(String.valueOf(c.getStringCellValue()));
					}
					
				}
				
			}
		}
		System.out.println(data);
	}
	
	public static void main(String[] args) throws IOException{
		getdatafromexcel();
	}

}
