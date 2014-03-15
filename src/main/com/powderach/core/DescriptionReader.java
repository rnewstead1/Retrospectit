package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DescriptionReader {
    private final File folderLocation;

    public DescriptionReader(File folderLocation) {
        this.folderLocation = folderLocation;
    }

    public String descriptionFor(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String location = String.format("%s/%s.txt", folderLocation.getPath(), name);
            BufferedReader reader = new BufferedReader(new FileReader(location));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString().trim();
    }
}
