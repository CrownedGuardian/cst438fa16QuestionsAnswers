import java.util.ArrayList;
import java.util.HashMap;

/**
 * A half-secretive map of questions to answers (at most one answer per
 * question). * Gives out random questions (keys) from the map, and can be
 * queried to test if a given question maps to a given answer.
 */
public class QuestionsAnswers {
	/**
	 * Maps question to answer.
	 */
	
	private HashMap<String, String> test = new HashMap<String, String>();
	private ArrayList<String> questions = new ArrayList<String>();
	
	void put(String question, String answer) {
		test.put(question, answer);
		questions.add(question);
	}

	/**
	 * Queries if question maps to answer.
	 */
	boolean testAnswer(String question, String answer) {
		return (test.containsKey(question) && test.get(question).equals(answer));
	}

	/**
	 * Gives out a random question from the key set.
	 */
	String getRandomQuestion() {
		int random = (int) Math.random() * questions.size();
		return questions.get(random);
	}
}
