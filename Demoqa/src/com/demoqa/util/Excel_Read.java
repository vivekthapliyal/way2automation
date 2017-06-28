package com.demoqa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Read {

		public String readExcel(String filePath,String fileName,String sheetName,int rownumber,int column) throws IOException{

			String value=null;
			
		    //Create a object of File class to open xlsx file
			
		    File file =    new File(filePath+"/"+fileName);

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(file);

		    XSSFWorkbook guru99Workbook = null;

		    //Find the file extension by spliting file name in substring and getting only extension name

		    String fileExtensionName = fileName.substring(fileName.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    guru99Workbook = new XSSFWorkbook(inputStream);

		    }

		    //Check condition if the file is xls file

		    else if(fileExtensionName.equals(".xls")){

		        //If it is xls file then create object of XSSFWorkbook class

		        guru99Workbook = new XSSFWorkbook(inputStream);

		    }

		    //Read sheet inside the workbook by its name

		    XSSFSheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		    //Find number of rows in excel file

		    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it
		    

		    for (int i = 0; i < rowCount+1; i++) {

		        XSSFRow row = guru99Sheet.getRow(rownumber);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {
		        	

		          value=(row.getCell(column).getStringCellValue());
		            
		         
		        }

		        System.out.println();

		    }

		    
		    return value;

		    }

		    

		    //Main function is calling readExcel function to read data from excel file
		
			
		    public static void main(String[] strings) {

		    //Create a object of ReadGuru99ExcelFile class

		    Excel_Read objExcelFile = new Excel_Read();

		    //Prepare the path of excel file

		    String filePath = "./resource";

		    //Call read file method of the class to read data

		    try {
				String name =objExcelFile.readExcel(filePath,"Userdata.xlsx","Sheet2", 1, 0);
				String password =objExcelFile.readExcel(filePath,"Userdata.xlsx","Sheet2", 1, 1);
				String address =objExcelFile.readExcel(filePath,"Userdata.xlsx","Sheet2", 1, 2);
				System.out.println("User Name is ="+name);
				System.out.println("Password us ="+password);
				System.out.println("Address is ="+address);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    }

}
