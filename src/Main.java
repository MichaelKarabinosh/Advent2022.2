import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/InputFile");
        int score = 0;
        for (int i = 0; i < fileData.size(); i++) {
            if (fileData.get(i).startsWith("A")) {
                if (fileData.get(i).endsWith("Y")) {
                    score += 8;
                }
                if (fileData.get(i).endsWith("X")) {
                    score += 2;
                }
                if (fileData.get(i).endsWith("Z")) {
                    score += 1;
                }
            }
            if (fileData.get(i).startsWith("B")) {
                if (fileData.get(i).endsWith("Y")) {
                    score += 4;
                }
                if (fileData.get(i).endsWith("X")) {
                    score += 1;
                }
                if (fileData.get(i).endsWith("Z")) {
                    score += 9;
                }
            }
            if (fileData.get(i).startsWith("C")) {
                if (fileData.get(i).endsWith("Y")) {
                    score += 2;
                }
                if (fileData.get(i).endsWith("X")) {
                    score += 7;
                }
                if (fileData.get(i).endsWith("Z")) {
                    score += 6;
                }
            }
        }
        System.out.println("Part One: " + score);
        // you now have a list of Strings from the file "InputFile"
    }


    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}