package _case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile<T> {
    public List<T> readFile(String filePath) {
        List<T> list = null;
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            if ((line = bufferedReader.readLine()) != null) {
                list.add((T) line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void writeFile(String filePath, String line) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
