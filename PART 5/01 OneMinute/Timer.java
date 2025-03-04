/**
 * @author SEB
 */

// This is not a "timer", this is a stopwatch!
public class Timer {
    private int seconds;
    public int hseconds;

    public Timer() {
        this.seconds = 0;
        this.hseconds = 0;
    }

    public void advance() {

        this.hseconds++;

        if (this.hseconds >= 100) {
            this.hseconds = 0;
            this.seconds++;
        }

        if (this.seconds >= 60) {
            this.seconds = 0;
        }

    }

    @Override
    public String toString() {
        if (hseconds < 10 && seconds < 10) {
            return "0" + seconds + ":" + "0" + hseconds;
        } else if (seconds < 10) {
            return "0" + seconds + ":" + hseconds;
        } else if (hseconds < 10) {
            return seconds + ":" + "0" + hseconds;
        } else {
            return seconds + ":" + hseconds;
        }
    }
}
