package main.java.create.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/22 17:23
 * @Description:
 */
public class Logger {

    private FileWriter fileWriter;

    public Logger(FileWriter fileWriter) throws IOException {
        File file = new File("D://home/log.txt");
        this.fileWriter = new FileWriter(file,true);
    }

    public void write(String message) throws IOException {
        fileWriter.write(message);
    }
}
