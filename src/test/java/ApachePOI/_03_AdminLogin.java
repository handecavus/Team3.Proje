package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_AdminLogin {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resources/LoginData.xlsx";

        FileInputStream d = new FileInputStream(path);
        Workbook calismaKitabi = WorkbookFactory.create(d);
        Sheet calismaSayfasi = calismaKitabi.getSheetAt(0);

        Row satirUsername = calismaSayfasi.getRow(12);
        Cell hucreUsername = satirUsername.getCell(1);
        System.out.println("hucreUsername = " + hucreUsername);

        Row satirPassword = calismaSayfasi.getRow(12);
        Cell hucrePassword = satirUsername.getCell(2);
        System.out.println("hucrePassword = " + hucrePassword);

    }
}
