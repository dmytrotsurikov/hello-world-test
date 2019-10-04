package com.playtika.javacourse.cmd;

import java.nio.file.Path;

public class Context {
    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    private Path path;

}
