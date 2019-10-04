package com.playtika.javacourse.cmd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDirCommand implements Command {
    private Path path;

    public ChangeDirCommand  (Path path){
        this.path= path;
    }


    @Override
    public void execute(Context context) throws IOException {
        /*Path newPath;
        if (path .isAbsolute()) {
            newPath = path;
        } else {
            Path newPath = context.getPath().resolve(path).toAbsolutePath();

        }
        if (Files.isDirectory(newPath)) {
            context.setPath();
                    } else {
            System.out.printf("Path is not correct"+ newPath);
        }*/

    }
}
