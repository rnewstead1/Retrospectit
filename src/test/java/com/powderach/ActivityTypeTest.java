package com.powderach;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ActivityTypeTest {

    @Test
    public void getTitleReturnsUncameledAndNicelySpacedName() throws Exception {
        assertThat(ActivityType.DecideWhatToDo.getTitle(), is("Decide What To Do"));
    }
}
