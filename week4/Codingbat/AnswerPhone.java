public class AnswerPhone {
    public static void main(String[] args) {
        System.out.println(answerCell(true, true, false));   // Should print true
        System.out.println(answerCell(true, false, false));  // Should print false
        System.out.println(answerCell(false, false, false)); // Should print true
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning) {
            if(isMom && !isAsleep)
                return true;
            else
                return false;
        }
        else {
            if(!isAsleep)
                return true;
            else 
                return false;
        }
    }
}
