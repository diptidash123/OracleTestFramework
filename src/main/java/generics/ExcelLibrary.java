package generics;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstant
{ 
	public static String fetchdata(String path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream file=new FileInputStream(excelfilepath);
		XSSFWorkbook variable=new XSSFWorkbook(file);
		String store=variable.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return store;
	}

}