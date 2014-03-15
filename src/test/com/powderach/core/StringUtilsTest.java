package core;

import core.StringUtils;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringUtilsTest {

    @Test
    public void shouldUncamelAndNicelySpaceString() throws Exception {
        assertThat(StringUtils.unCamel("TheQuickBrownFoxJumpsOverTheLazyDog"), is("The Quick Brown Fox Jumps Over The Lazy Dog"));
    }
}
