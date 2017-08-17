package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Utils {
	
	public static String getURLFromJenkins(String data){
			String element = null;
	      try {	
	         File inputFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\Tookitaki\\config.xml");
	         DocumentBuilderFactory dbFactory 
	            = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" 
	            + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("prebuilders");
	         System.out.println("----------------------------");
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" 
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("hudson.plugins.seleniumhq.SeleniumhqBuilder : " 
	                  + eElement.getAttribute("plugin"));
	               System.out.println("browser: " 
	                  + eElement
	                  .getElementsByTagName(data)
	                  .item(0)
	                  .getTextContent());
	               element = eElement
	 	                  .getElementsByTagName(data)
		                  .item(0)
		                  .getTextContent();
	               String Values[]=element.split(",");
	               System.out.println(Values[0]);
	               System.out.println(Values[1]);
	              /* System.out.println("startURL : " 
	               + eElement
	                  .getElementsByTagName("startURL")
	                  .item(0)
	                  .getTextContent());*/
	            }
	         }
	         return element;
	      } 
	      catch (Exception e) {
	         e.printStackTrace();
	         return null;
	      }
	   }
	
	public static String getUsernameFromJenkins(String data){
		String element = null;
		String userName = null;
      try {	
         File inputFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\Tookitaki\\config.xml");
         DocumentBuilderFactory dbFactory 
            = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :" 
            + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("prebuilders");
         System.out.println("----------------------------");
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" 
               + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("hudson.plugins.seleniumhq.SeleniumhqBuilder : " 
                  + eElement.getAttribute("plugin"));
               System.out.println("browser: " 
                  + eElement
                  .getElementsByTagName(data)
                  .item(0)
                  .getTextContent());
               element = eElement
 	                  .getElementsByTagName(data)
	                  .item(0)
	                  .getTextContent();
               String Values[]=element.split(",");
               userName = (Values[0]);
               String password = (Values[1]);
               System.out.println(Values[0]);
               System.out.println(Values[1]);
              /* System.out.println("startURL : " 
               + eElement
                  .getElementsByTagName("startURL")
                  .item(0)
                  .getTextContent());*/
            }
         }
         return userName;
      } 
      catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }
	
	public static String getPasswordFromJenkins(String data){
		String element = null;
		String password = null;
      try {	
         File inputFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\Tookitaki\\config.xml");
         DocumentBuilderFactory dbFactory 
            = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :" 
            + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("prebuilders");
         System.out.println("----------------------------");
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" 
               + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("hudson.plugins.seleniumhq.SeleniumhqBuilder : " 
                  + eElement.getAttribute("plugin"));
               System.out.println("browser: " 
                  + eElement
                  .getElementsByTagName(data)
                  .item(0)
                  .getTextContent());
               element = eElement
 	                  .getElementsByTagName(data)
	                  .item(0)
	                  .getTextContent();
               String Values[]=element.split(",");
               password = (Values[1]);
               /*System.out.println(Values[0]);
               System.out.println(Values[1]);*/
              /* System.out.println("startURL : " 
               + eElement
                  .getElementsByTagName("startURL")
                  .item(0)
                  .getTextContent());*/
            }
         }
         return password;
      } 
      catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }
	
	 public static String readUserNameFromConsole(){  
		   Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter Username:");  
		   String userName=sc.next();  
		   return userName;
		   /*System.out.println("Enter Password");  
		   String password=sc.next();  
		   System.out.println("Username:"+userName+" Password:"+password);  
		   sc.close();*/
		   
		 } 
	 public static String readPasswordFromConsole(){  
		   Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter Password");  
		   String password=sc.next();  
		   return password;
		 } 
	
	
	
	
	public static String getDataFromTestData(String autoTestCaseNameVal, String label) {
		String requiredCellVal = "";
		try {
			FileInputStream fis = new FileInputStream("data\\TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet("Sheet1");
			int rowNum = ws.getLastRowNum() + 1;

			Iterator rowIterator = ws.rowIterator();
			int numberOfCells = 0;
			if (rowIterator.hasNext()) {
				Row headerRow = (Row) rowIterator.next();
				// get the number of cells in the header row
				numberOfCells = headerRow.getLastCellNum();
			}
			for (int index = 0; index < rowNum; index++) {

				XSSFRow row = ws.getRow(index);
				XSSFCell cell = row.getCell(0);
				String cellVal = cellToString(cell);
				//System.out.println(cellVal);
				if (cellVal.equals(autoTestCaseNameVal)) {
					//System.out.println("Entered"+cellVal+"Row Index:"+index);
					for (int cellIndex = 1; cellIndex < numberOfCells; cellIndex++) {
						XSSFCell findLable = row.getCell(cellIndex);
						String labelString = cellToString(findLable);
						if (labelString.equals(label)) {
							//System.out.println("Cell Index: "+cellIndex);
							XSSFRow nextRow = ws.getRow(index + 1);
							XSSFCell adjacentRowCell = nextRow
									.getCell(cellIndex);
							String adjacentRowCellVal = cellToString(adjacentRowCell);
							//System.out.println("Cell Val: "+adjacentRowCellVal);
							requiredCellVal = adjacentRowCellVal;
							break;
						}
					}

					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return requiredCellVal.trim();
	}
	
	
	public static String getDataFromTestConfig(String component)
	{
		String requiredCellVal = "";
		try {
			FileInputStream fis = new FileInputStream("data\\TestConfiguration.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet("Sheet1");

			int rowNum = ws.getLastRowNum() + 1;

			java.util.Iterator<Row> rowIterator = ws.rowIterator();
            int numberOfCells = 0;
            if (rowIterator.hasNext())
            {
                Row headerRow = (Row) rowIterator.next();
                //get the number of cells in the header row
                numberOfCells = headerRow.getLastCellNum();
            }
            
			for (int index = 0; index < rowNum; index++) 
			{
				XSSFRow row = ws.getRow(index);
				
				for(int cellIndex=0; cellIndex<numberOfCells; cellIndex++)
				{
					XSSFCell cell = row.getCell(cellIndex);
					String cellVal = cellToString(cell);
					if (cellVal.equals(component)) 
					{
						XSSFCell adjacentCell = row.getCell(cellIndex+1);
						String adjacentCellVal = cellToString(adjacentCell);
						requiredCellVal = adjacentCellVal;
						break;
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return requiredCellVal;
	}
	public static String cellToString(XSSFCell cell) 
	{
			int type;
			String result;
			type = cell.getCellType();

			switch (type) {

			case Cell.CELL_TYPE_NUMERIC: // numeric value in Excel
				result = "" + cell.getNumericCellValue();
				break;
			case Cell.CELL_TYPE_FORMULA: // precomputed value based on formula
				result = "" + cell.getNumericCellValue();
				break;
			case Cell.CELL_TYPE_STRING: // String Value in Excel
				result = "" + cell.getStringCellValue();
				break;
			case Cell.CELL_TYPE_BLANK:
				result = "";
				break;
			case Cell.CELL_TYPE_BOOLEAN: // boolean value
				result = "" + cell.getBooleanCellValue();
				break;
			case Cell.CELL_TYPE_ERROR:
				result = "Error";
			default:
				throw new RuntimeException(
						"There is no support for this type of cell");
			}

			return result.toString();
	}
}