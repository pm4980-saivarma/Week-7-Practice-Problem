public class Scorecard {
    private final boolean[] results;
    private int answersRecorded;
    private int score;

    public Scorecard(int questionCount) {
        if (questionCount < 0) {
            throw new IllegalArgumentException("Question count must not be negative.");
        }
        results = new boolean[questionCount];
    }

    public boolean recordAnswer(boolean correct) {
        if (answersRecorded == results.length) {
            return false;
        }
        results[answersRecorded] = correct;
        answersRecorded++;
        if (correct) {
            score++;
        }
        return true;
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("Score: " + sc.getScore());
        System.out.println("Extra answer accepted: " + sc.recordAnswer(true));
    }
}
