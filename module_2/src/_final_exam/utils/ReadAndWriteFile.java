package _final_exam.utils;

import java.io.*;
import java.util.List;

public class ReadAndWriteFile<T> {
    public static Object readFileProduct(String filePath) {
        FileInputStream FIn = null;
        ObjectInputStream OIn = null;
        Object read = null;
        try {
            FIn = new FileInputStream(new java.io.File(filePath));
            OIn = new ObjectInputStream(FIn);
            read = OIn.readObject();
            FIn.close();
            OIn.close();
            return read;
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }
    public void writeFileByByteStream(List<T> list, String filePath) {
        File file = new File(filePath);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
