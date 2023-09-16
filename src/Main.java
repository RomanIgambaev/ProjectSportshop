import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/product list.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Список товарок");
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            try {
                bufferedReader.close();
                fileReader.close();
            }catch (Exception ex){
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найдет");
        }

    }
}