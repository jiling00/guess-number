import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by ling on 15-2-3.
 */
public class TestNumPlayGame {

    public  void should_return_0A4B_when_input_is_1234_and_answer_is_4321() {
        String input = "1234";
        String answer = "4321";
        NumPlayGame num = new NumPlayGame();
        String result = num.play(input,answer);

        assertThat(result).isEqualTo("0A4B");

    }

}
