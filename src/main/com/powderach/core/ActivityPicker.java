package core;

import java.util.Arrays;
import java.util.List;

import static core.utils.CollectionUtils.pickOneOf;

public class ActivityPicker {

    public List<Activity> activities() {
        return Arrays.<Activity>asList(
                pickOneOf(SetTheScene.class),
                pickOneOf(GatherData.class),
                pickOneOf(GenerateInsights.class),
                pickOneOf(DecideWhatToDo.class),
                pickOneOf(CloseRetrospective.class)
        );
    }

}
