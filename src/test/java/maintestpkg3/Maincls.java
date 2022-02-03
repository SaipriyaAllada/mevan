package maintestpkg3;

import actiontestpkg2.Actioncls;
import exceltestpkg4.Excelcls;
import propertiespkg.propcls;


public class Maincls {
	static String sPath;
	
	public static void main(String[] args) throws Exception {
		sPath = System.getProperty("user.dir")+"\\src\\test\\resources\\Excel2.xlsx";
		Excelcls.setExcelFile(sPath, "sheet1");
		
		Actioncls.openBrowser();
		Actioncls.navigate();

		
		for (int iRow=1;iRow<=5;iRow++){
			
			String searchKeyword = Excelcls.getCellData(iRow, 0);
			System.out.println(searchKeyword);			
			Actioncls.searchFunc(searchKeyword);
			Actioncls.clickSearchBtn();
			Actioncls.verifyTitle(searchKeyword);
			Actioncls.navigateBack();
	}
		Actioncls.closeBrowser();
	}
}
