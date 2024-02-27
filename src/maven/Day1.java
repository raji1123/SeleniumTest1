package maven;

import java.io.FileInputStream;



public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//build management tool
		
		//main java
		//resource code
		
		//test java
		
		//test resource
		//dependency---add 3rd party
		//plugin--fo configgure
		
		
		
		//life cycle of maven---stages in maven 
		
		//validate  / compile/  test/  package/   integration test / verify/  Install /deployment
		
		String inputpath=System.getProperty("user.dir");
		
		
		System.out.println( inputpath);
		
		
		
		String inputpath =System.getProperty("user.dir")+"/Rajifile.xlsx";//getting input path
		
		//System.out.println(inputpath);
		
		
			FileInputStream stream= new FileInputStream (inputpath);
			
			
				/*XSSFWorkbook book = new XSSFWorkbook(stream);//open the file exce1format
				
				
				XSSFSheet sheet =book.getSheet("Sheet1");
				XSSFSheet sheet1=book.getSheet("Sheet2");
				
				//XSSFCell cell=sheet.getRow(1).getCell(0);
				//XSSFCell cell1=sheet.getRow(0).getCell(0);
				
			//	System.out.println(cell1);
				
				
				for(int i=0;i<5;i++) {
					XSSFCell cell=sheet.getRow(0).getCell(i);
					
					System.out.println(cell);
				}
				
			XWPFDocument document = new XWPFDocument();//word documnet

			
			
			
			
			
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		}
	}
	
	


