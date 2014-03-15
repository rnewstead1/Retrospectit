package core;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DescriptionReaderTest {

    @Rule
    public TemporaryFolder descriptionFolder = new TemporaryFolder();

    @Before
    public void setUp() throws Exception {
        File descriptionFile = descriptionFolder.newFile("Foo.txt");
        BufferedWriter output = new BufferedWriter(new FileWriter(descriptionFile));
        output.write("Hello World.");
        output.close();
    }

    @Test
    public void readsDescriptionFromFile() throws Exception {
        assertThat(DescriptionReader.descriptionFor(descriptionFolder.getRoot(), "Foo"), is("Hello World."));
    }
}
