import java.util.ArrayList;
import java.util.Scanner;

public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private int score;

    public Player(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ";" + score;
    }

    public int compareTo(Player o) {
        if (this.score > o.score)
            return 1;
        else if (this.score < o.score)
            return -1;
        else return this.lastName.compareTo(o.lastName);
    }

}

