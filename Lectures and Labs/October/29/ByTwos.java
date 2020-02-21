public class ByTwos implements Series {
    int start, val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }
    public void reset() {
        val = start;
    }
    public void setStart(int st) {
        start = st;
        val = st;
    }
 }