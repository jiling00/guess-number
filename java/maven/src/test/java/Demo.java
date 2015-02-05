import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by ling on 15-2-2.
 */
public class Demo {
    public void should_return(){
        DomeTest dome = new DomeTest();
        String result = dome.say();
        assertThat(result).isEqualTo("hi");
    }

}
