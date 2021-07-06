package _case_study.utils;

import _case_study.models.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFile<T> {
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

    public void writeFileByByteStreamUseMap(Map<Facility, Integer> map, String filePath) {
        File file = new File(filePath);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(map);
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
    public void writeFileUseSet(Set<T> set, String filePath) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(filePath);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(set);
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

    public static Object readFile(String filePath) {
        //Khai báo đối tượng FileInputStream và ObjectInputStream trỏ tới null
        FileInputStream FIn = null;
        ObjectInputStream OIn = null;
        Object read = null;
        try {
            //Khở tạo đối tượng với địa chỉ truyền vào
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
}