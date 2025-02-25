import java.io.*;

public class csvReader {
    public static void main(String[] args) {

        String path = "C:/SacramentocrimeJanuary2006.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println("Date= " + values [0]
                        + ", addres = " + values[1]
                        + ", district= " + values [2]
                        + ", beat = " + values [3]
                        + ", grid = " + values [4]
                        + ", crime = " + values [5]
                        + ", usr ncic code = " + values [6]
                        + ", latitude = " + values [7]
                        + ", longitude = " + values [8]);


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

