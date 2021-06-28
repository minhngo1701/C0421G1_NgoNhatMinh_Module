package _16_io_text_file.bai_tap;

import java.util.List;

public class TestReadFileCSV {
    public static void main(String[] args) {
        List<String> list = new ReadFileCSV().readFile("src\\_16_io_text_file\\bai_tap\\countries.csv");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String[] split = list.get(i).split(",");
            Country country = new Country(Integer.parseInt(split[0]), split[1], split[2]);
            System.out.println(country);
        }

    }
}
