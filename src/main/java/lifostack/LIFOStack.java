package lifostack;

public class LIFOStack {

    private boolean isEmpty = true;
    private int[] values = new int[3];
    private int counter = 0;

    public boolean empty() {

        return counter == 0;
    }

    public void push(int i) {

        values[counter++] = i;
    }

    public int pop() {

        return values[--counter];
    }
}
