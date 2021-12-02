import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Code {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner scanner = null;
        try {
            File file = new File("numbers.txt");
            scanner = new Scanner(file);

            ArrayList<Integer> array = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                array.add(Integer.parseInt(line));
            }

            int calculator = 0;

            for (int ind = 0; ind < array.size(); ind++) {
                if (ind != 0) {
                    if (array.get(ind) > array.get(ind - 1)) {
                        System.out.println(array.get(ind) + "(increased)");
                        calculator += 1;
                    } else {
                        System.out.println(array.get(ind) + "(decreased)");
                    }
                } else {
                    System.out.println(array.get(ind) + "(N/A - no previous measurement");
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