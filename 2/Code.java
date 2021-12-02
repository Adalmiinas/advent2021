import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Code2 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner scanner = null;
        try {
            File file = new File("numbers.txt");
            scanner = new Scanner(file);

            ArrayList<Integer> array = new ArrayList<>();
            ArrayList<Integer> newArray = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                array.add(Integer.parseInt(line));
            }

            int calculator = 0;

            for (int ind = 0; ind < array.size(); ind++) {
                if (ind < array.size() - 2) {
                    int addition = array.get(ind) + array.get(ind + 1) + array.get(ind + 2);
                    newArray.add(addition);
                }
            }
            for (int x = 0; x < newArray.size(); x++) {
                if (x != 0) {
                    if (newArray.get(x) > newArray.get(x - 1)) {
                        System.out.println(newArray.get(x) + "(increased)");
                        calculator += 1;
                    } else {
                        System.out.println(newArray.get(x) + "(decreased)");
                    }
                } else {
                    System.out.println(newArray.get(x) + "(N/A - no previous measurement");
                }
            }

            System.out.print(calculator);
            scanner.close();
        } catch (FileNotFoundException e) {
            if (scanner != null) {
                scanner.close();
            }

        }
    }
}