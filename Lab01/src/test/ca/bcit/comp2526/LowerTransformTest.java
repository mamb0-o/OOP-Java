package ca.bcit.comp2526;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class LowerTransformTest {
    @Test
    void transform(){
        final LowerTransform transformation;

        transformation= new LowerTransform();

        assertThat(transformation.transform("chelsea"), equalTo("chelsea"));
        assertThat(transformation.transform("CHELSEA"), equalTo("chelsea"));
        assertThat(transformation.transform("ChelSeA"), equalTo("chelsea"));
        assertThat(transformation.transform("abc"), equalTo("abc"));
        assertThat(transformation.transform("AbC"), equalTo("abc"));
        assertThat(transformation.transform("Apple!"), equalTo("apple!"));
        assertThat(transformation.transform("Apple!"), equalTo("apple!"));
        assertThat(transformation.transform("!apPLE"), equalTo("!apple"));

    }

    @Test
    void failTransform(){
        final LowerTransform transformation;
        Throwable ex ;

        transformation= new LowerTransform();

        ex= assertThrows(IllegalArgumentException.class, () -> { transformation.transform(null);});
        assertThat(ex.getMessage(), Matchers.equalTo("input cannot be null"));
    }
}