package GiteeTest;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GetDataFromExcel {


public String[] getCellValue(int nameColum, int passwordColum, String filePath, String sheetName,int rowNum) {

    Workbook wb = null;
    int index = filePath.lastIndexOf(".");
    String fileSuffix = filePath.substring(index,filePath.length());
    if(fileSuffix.equals(".xlsx")){
        try {
            wb = new XSSFWorkbook(new FileInputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    else if(fileSuffix.equals(".xls")){
        try {
            wb = new HSSFWorkbook(new FileInputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    else{
        System.out.println("所提供的Excel格式文件有误");
    }
    FileOutputStream fileOutputStream = null;
    Sheet sheet = wb.getSheet(sheetName);

        Row row = sheet.getRow(rowNum);
        Cell nameCell = row.getCell(nameColum);
        Cell passwordCell = row.getCell(passwordColum);
        String nameValue = nameCell.getStringCellValue();
        String passwordValue = passwordCell.getStringCellValue();

        String[] value = new String[2];
        value[0] = nameValue;
        value[1] = passwordValue;
        return value;
  }
}

