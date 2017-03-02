package org.hudas.controllers.lettersend;

/**
 * Created by ignas on 3/1/17.
 */
public class UploadedNewsLetter {
    private String filename;
    private byte[] content;

    public UploadedNewsLetter(String filename, byte[] content) {
        this.filename = filename;
        this.content = content;
    }

    public String getFilename() {
        return filename;
    }

    public byte[] getContent() {
        return content;
    }
}
