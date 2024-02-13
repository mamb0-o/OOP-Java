package ca.bcit.comp2526;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class FormatTransoformTest {

    @Test
    void transform() {
        final FormatTransoform transformation;

        transformation= new FormatTransoform();

        assertThat(transformation.transform("chelsea"), equalTo("Chelsea"));
        assertThat(transformation.transform("CHELSEA"), equalTo("Chelsea"));
        assertThat(transformation.transform("ChelSeA"), equalTo("Chelsea"));
        assertThat(transformation.transform("abc"), equalTo("Abc"));
        assertThat(transformation.transform("AbC"), equalTo("Abc"));
        assertThat(transformation.transform("Apple!"), equalTo("Apple!"));
        assertThat(transformation.transform("Apple!"), equalTo("Apple!"));
        assertThat(transformation.transform("!apPLE"), equalTo("!apple"));
    }

    @Test
    void failTransform(){
        final FormatTransoform transformation;
        Throwable ex ;

        transformation= new FormatTransoform();

        ex= assertThrows(IllegalArgumentException.class, () -> { transformation.transform(null);});
        assertThat(ex.getMessage(), Matchers.equalTo("cannot be empty"));
    }
}