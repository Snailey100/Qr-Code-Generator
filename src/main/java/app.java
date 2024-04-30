import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.nio.file.Paths;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to name your new code?");
        String name= scanner.nextLine();

        System.out.println("What is the link you want the QR code to store?");
        String link = scanner.nextLine();

        String path= "C:\\Users\\snail\\Downloads\\QrCode\\" + name +".jpg";

        BitMatrix matrix= new MultiFormatWriter().encode(link, BarcodeFormat.QR_CODE, 500, 500);

        MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));

        System.out.println("Your QR Code is Made");
    }
}