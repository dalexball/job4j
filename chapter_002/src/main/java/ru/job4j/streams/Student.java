package ru.job4j.streams;

/**
 * Class models student who has certain score
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 1
 */
public class Student {

    /**
     * Sets students score to certain number if it fits 0 >= score <= 100
     * else sets score absolute value of division remainder to 101
     *
     * @param score - score
     */
    public Student(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            this.score = Math.abs(score % 101);
        }
    }

    /**
     * Students score
     */
    private int score;

    /**
     * Get score
     *
     * @return score
     */
    public int getScore() {
        return score;
    }
}
