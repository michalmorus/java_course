package autoCloseable;

import java.io.File;
import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {

    private File file;

    public File createTempFile() throws IOException {
        this.file = File.createTempFile("tempfile", "");
        return this.file;
    }

    @Override
    public void close() throws Exception {
        System.out.println("CLOSE!!!");
        if (this.file != null) {
            boolean status = file.delete();
            System.out.println("delete status: " + status);
        }
    }
}
