package colln;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXcelUtil {
	private static XSSFWorkbook wb;
	public static ArrayList<ArrayList<String>> ExcelUse() {
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
		try {
			FileInputStream fis=new FileInputStream(new File("src/test/resources/util/user.xlsx"));
			wb = new XSSFWorkbook(fis);
			Sheet sh=wb.getSheetAt(0);
			int rowCount=sh.getLastRowNum();
			for(int i=1;i<=rowCount;i++) {
				ArrayList<String> line=new ArrayList<String>();
				for(int j=0;j<2;j++) {
				String email=sh.getRow(i).getCell(j).getStringCellValue().toString();
				line.add(email);
			}
			list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.println(ExcelUse());
	}
}
