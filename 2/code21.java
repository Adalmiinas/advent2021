import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class code21 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner scanner = null;
        try {
            File file = new File("inputs.txt");
            scanner = new Scanner(file);

            ArrayList<String> array = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                array.add(line);
            }

            int forward = 0;
            int depth = 0;

            for (int x = 0; x < array.size(); x++) {
                String line = array.get(x);
                String [] command = line.split(" ");
                
                if (command[0].equals("forward")){
                    forward += Integer.parseInt(command[1]);
                }
                else if (command[0].equals("down")){
                    depth += Integer.parseInt(command[1]);
                }

                else {
                    depth -= Integer.parseInt(command[1]);
                }

            }

            System.out.println("Forward: " + forward);
            System.out.println("Depth: " + depth);
            System.out.println("Multiply: " + forward*depth);
            scanner.close();

        } catch (FileNotFoundException e) {
            if (scanner != null) {
                scanner.close();
            }

        }
    }
}