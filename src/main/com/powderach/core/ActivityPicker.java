package core;

import core.utils.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class ActivityPicker {

    public List<Activity> activities() {
        return Arrays.<Activity>asList(
                CollectionUtils.pickOneOf(SetTheScene.class),
                CollectionUtils.pickOneOf(GatherData.class),
                CollectionUtils.pickOneOf(GenerateInsights.class),
                CollectionUtils.pickOneOf(DecideWhatToDo.class),
                CollectionUtils.pickOneOf(CloseRetrospective.class)
                );
    }

}
