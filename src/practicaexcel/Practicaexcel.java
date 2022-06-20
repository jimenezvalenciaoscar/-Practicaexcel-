/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexcel;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author Lenovo
 */
public class Practicaexcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        Workbook wb = new HSSFWorkbook();
        try ( OutputStream fileOut = new FileOutputStream("myexcel.xls")) {
            Sheet sheet1 = wb.createSheet("Primer Hoja");
            Sheet sheet2 = wb.createSheet("Segunda Hoja");
            Sheet sheet = wb.createSheet("Tercer Hoja");
            Row row = sheet.createRow(0); //crear fila. se establece el indice a 0 hasta N                           
            row.createCell(0).setCellValue("Num"); // Columna A  
            row.createCell(1).setCellValue("Nombre"); // Columna B   
            row.createCell(2).setCellValue("Edad");// Columna C  
            row.createCell(3).setCellValue("Correo"); // Columna D 

            row = sheet.createRow(1); //crear fila 2
            row.createCell(0).setCellValue(1); // Columna A  
            row.createCell(1).setCellValue("Oscar Jesus Jimenez Valencia"); // Columna B   
            row.createCell(2).setCellValue(19);// Columna C  
            row.createCell(3).setCellValue("oscarjesus@gmail.com"); // Columna D 
            
            row = sheet.createRow(2); //crear fila 3
            row.createCell(0).setCellValue(2); // Columna A  
            row.createCell(1).setCellValue("jose martha"); // Columna B   
            row.createCell(2).setCellValue(61);// Columna C  
            row.createCell(3).setCellValue("personal@personal.com"); // Columna D
            
            row = sheet.createRow(3); //crear fila 2
            row.createCell(0).setCellValue(3); // Columna A  
            row.createCell(1).setCellValue("Martha jesus"); // Columna B   
            row.createCell(2).setCellValue(51);// Columna C  
            row.createCell(3).setCellValue("personal@personal.com"); 
            
            row = sheet.createRow(4); //crear fila 2
            row.createCell(0).setCellValue(4); // Columna A  ccc
            row.createCell(1).setCellValue("Karen manzana"); // Columna B   
            row.createCell(2).setCellValue(21);// Columna C  
            row.createCell(3).setCellValue("personal@personal.com"); // Columna D
            
            
            wb.write(fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
