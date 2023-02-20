import java.io.*;
public class ReadFile
{
    public static void main(String[] args) {
        try  {
            InputStream stream = new FileInputStream("file.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
