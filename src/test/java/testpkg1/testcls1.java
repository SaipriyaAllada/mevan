package testpkg1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class testcls1 {


		public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
			
			
			InputStream exlFile = new FileInputStream("C:\\Users\\91903\\Desktop\\tinku\\j\\MevanProject2\\src\\test\\resources\\Excel1.xls");
			
			Workbook wb = WorkbookFactory.create(exlFile);
			Sheet ShtIndex = wb.getSheetAt(0);
			
			
			for(int i=0; i<=4; i++)
			{
				
				Row rowNum = ShtIndex.getRow(i);
				Cell cellValue = rowNum.getCell(0);
				System.out.println(cellValue);
				
			}
			
			


	}

}
