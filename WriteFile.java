import java.io.*;
public class WriteFile
{
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("bee_movie_script.txt");
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write("According to all known laws\n" +
                    "of aviation,\n" +
                    "\n" +
                    "\n" +
                    "there is no way a bee\n" +
                    "should be able to fly.\n" +
                    "\n" +
                    "\n" +
                    "Its wings are too small to get\n" +
                    "its fat little body off the ground.\n" +
                    "\n" +
                    "The bee, of course, flies anyway\n" +
                    "\n" +
                    "\n" +
                    "because bees don't care\n" +
                    "what humans think is impossible.");
            outputStreamWriter.close();
            System.out.println("Success");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
