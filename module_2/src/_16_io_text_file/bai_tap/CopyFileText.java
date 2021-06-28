package _16_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void writeFile(String filePath, String line) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> list;
        CopyFileText copyFileText = new CopyFileText();
        list = copyFileText.readFile("src\\_16_io_text_file\\thuc_hanh\\test\\file.txt");
        System.out.println(list);
        for (String n : list) {
            copyFileText.writeFile("src\\_16_io_text_file\\bai_tap\\newfile.txt", n);
        }
    }
}
