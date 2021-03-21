package lifostack;

import java.util.ArrayList;
import java.util.List;

public class LIFOStack {

    private boolean isEmpty = true;
    private List<Integer> values = new ArrayList<>();
    private int counter = 0;

    public boolean empty() {

        return values.size() == 0;
    }

    public void push(int i) {

        values.add(i);
    }

    public int pop() {

        return values.remove(values.size() -1);
    }
}
