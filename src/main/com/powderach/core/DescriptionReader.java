package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DescriptionReader {

    public static String descriptionFor(String filename) {
        return descriptionFor(new File("../retrospectit/src/main/com/powderach/core/descriptions"), filename);
    }

    protected static String descriptionFor(File folderLocation, String filename) {
        StringBuilder stringBuilder = new StringBuilder();
        String location = String.format("%s/%s.txt", folderLocation.getPath(), filename);
        try (BufferedReader reader = new BufferedReader(new FileReader(location))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException(String.format("File %s not exist", location), e);
        }
        return stringBuilder.toString().trim();
    }

}
