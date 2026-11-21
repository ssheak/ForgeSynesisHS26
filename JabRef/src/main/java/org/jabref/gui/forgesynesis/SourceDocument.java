package org.jabref.gui.forgesynesis;

import java.nio.file.Path;

public class SourceDocument {

    private final String fileName;
    private final Path filePath;

    public SourceDocument(Path filePath){
        this.filePath = filePath;
        this.fileName = filePath.getFileName().toString();
    }

    public String getFileName() {
        return fileName;
    }

    public Path getFilePath(){
        return filePath;
    }

}
