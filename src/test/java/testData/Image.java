package test.java.testData;

import java.io.File;

/**
 * Класс-сущность файла с картинкой
 * */
public class Image {

    private String name;
    private String path;

    public Image(String name) {
        this.name = name;
        this.path = new File("src/test/java/images/" + name).getAbsolutePath();
    }

    public String getName() {
        return name.substring(0, name.length()-4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
