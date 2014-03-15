package core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import static core.DescriptionReader.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DescriptionReaderTest {

    @Rule
    public TemporaryFolder descriptionFolder = new TemporaryFolder();

    @Before
    public void setUp() throws Exception {
        File descriptionFile = descriptionFolder.newFile("Foo.txt");
        BufferedWriter output = new BufferedWriter(new FileWriter(descriptionFile));
        output.write("Hello World.\nHow ya doin?");
        output.close();
    }

    @Test
    public void readsDescriptionFromFile() throws Exception {
        assertThat(descriptionFor(descriptionFolder.getRoot(), "Foo"), is("Hello World.\nHow ya doin?"));
    }

    @Test
    public void throwsExceptionIfFileDoesNotExist() throws Exception {
        try {
            descriptionFor(descriptionFolder.getRoot(), "Bar");
            Assert.fail(String.format("Expected [%s]", IllegalStateException.class.getSimpleName()));
        } catch (IllegalStateException e) {
            assertThat(e.getMessage(), containsString(descriptionFolder.getRoot().getPath()));
            assertThat(e.getMessage(), containsString("Bar.txt"));
            assertThat(e.getCause(), instanceOf(FileNotFoundException.class));
        }
    }
}
