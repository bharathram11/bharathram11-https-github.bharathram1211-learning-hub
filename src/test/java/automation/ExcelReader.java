package automation;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String filePath = "D:/Batch268/org.palms.project1/src/test/resources/Book1.xlsx";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            System.out.println("Excel file loaded successfully.");
            // Proceed with reading the workbook
        } catch (IOException e) {
            System.out.println("Error reading Excel file: " + e.getMessage());
        }
    }
}
