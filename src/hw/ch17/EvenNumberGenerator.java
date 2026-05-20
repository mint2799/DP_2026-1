package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int currNumber;

    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public int getNumber() {
        return currNumber;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i += 2) {
            currNumber = i;
            notifyObservers();
        }
    }
}
