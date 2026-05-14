/**
 * Represents a multiple-choice question for the SDLC study tool.
 * This class stores the question text, options, correct answer, 
 * and specific feedback for the user.
 */
public class Question {
    // Private attributes
    private int questionNumber;
    private String questionText;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String correctAnswer;
    private String feedback;

    /**
     * Default constructor for creating an empty Question object.
     */
    public Question() {
    }

    /**
     * Constructs a Question with all required data points.
     * @param questionNumber The chronological number of the question
     * @param questionText   The actual question being asked
     * @param choice1        First multiple-choice option
     * @param choice2        Second multiple-choice option
     * @param choice3        Third multiple-choice option
     * @param choice4        Fourth multiple-choice option
     * @param correctAnswer  The string matching the correct choice
     * @param feedback       Educational tip to display on an incorrect answer
     */
    public Question(int questionNumber, String questionText, String choice1, String choice2, 
                    String choice3, String choice4, String correctAnswer, String feedback) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.correctAnswer = correctAnswer;
        this.feedback = feedback;
    }

    /** @return The numerical ID of the question */
    public int getQuestionNumber() {
        return questionNumber;
    }

    /** @param questionNumber Sets the numerical ID of the question */
    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    /** @return The main text of the question */
    public String getQuestionText() {
        return questionText;
    }

    /** @param questionText Sets the main text of the question */
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    /** @return The text for option 1 */
    public String getChoice1() {
        return choice1;
    }

    /** @param choice1 Sets the text for option 1 */
    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    /** @return The text for option 2 */
    public String getChoice2() {
        return choice2;
    }

    /** @param choice2 Sets the text for option 2 */
    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    /** @return The text for option 3 */
    public String getChoice3() {
        return choice3;
    }

    /** @param choice3 Sets the text for option 3 */
    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    /** @return The text for option 4 */
    public String getChoice4() {
        return choice4;
    }

    /** @param choice4 Sets the text for option 4 */
    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    /** @return The correct answer string */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /** @param correctAnswer Sets the correct answer string */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    /** @return The feedback provided for a wrong answer */
    public String getFeedback() {
        return feedback;
    }

    /** @param feedback Sets the feedback provided for a wrong answer */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * Formats the question and its four choices for display in the console.
     * @return A formatted string of the question and options
     */
    public String toString() {
        return "Question " + questionNumber + ": " + questionText + "\n" +
               "1. " + choice1 + "\n" +
               "2. " + choice2 + "\n" +
               "3. " + choice3 + "\n" +
               "4. " + choice4;
    }
}
