package lifostack;

public class LIFOStack {

    private boolean isEmpty = true;

    public boolean empty() {

        return isEmpty;
    }

    public void push(int i) {

        isEmpty = false;
    }
}
