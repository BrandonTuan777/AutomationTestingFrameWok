package TDT.excelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TDT.TestComponents.BaseTest;

public class dataProvide extends BaseTest {
    DataFormatter formatter = new DataFormatter();

    @Test(dataProvider = "driverTest")
    public void login_With_Excel_Data(String phone, String password) throws InterruptedException {
        loginPage.LoginApplication(phone, password);
        Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='sc-bljvhv-1 bpNYcO'])[1]")).getText(),
                "Bất động sản");
    }

    @DataProvider(name = "driverTest")
    public Object[][] getData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Documents\\excelDriven.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int colcount = row.getLastCellNum();
        Object data[][] = new Object[rowCount - 1][colcount];
        for (int i = 0; i < rowCount - 1; i++) {
            row = sheet.getRow(i + 1);
            for (int j = 0; j < colcount; j++) {
                XSSFCell cell = row.getCell(j);
                data[i][j] = formatter.formatCellValue(cell);
            }
        }
        return data;
    }
}
