import static org.junit.Assert.*;

import org.junit.Test;


public class QuestionsAnswersTest {

	@Test
	public void testAnswer() {
		QuestionsAnswers qa = new QuestionsAnswers();
		qa.put("Why did the chicken cross the road?", "To get to the other side.");
		qa.put("What is something so fragile that whispering its name breaks it?", "Silence");
		assertEquals(false, qa.testAnswer("Why did the chicken cross the road?", "Silence"));
	}

}
