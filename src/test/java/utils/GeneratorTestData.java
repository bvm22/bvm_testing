package utils;

import testData.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorTestData {

    public static List<Image> getImages(){
        List<Image> list = new ArrayList<>();
        File dir = new File("src/test/java/images/");
        for (File file : dir.listFiles()){
            list.add(new Image(file.getName()));
        }
        return list;
    }

}
