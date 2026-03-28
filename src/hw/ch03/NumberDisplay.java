package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int n;

    public NumberDisplay(int n, int repeatCount){
        super(repeatCount);
        this.n = n;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(n);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
}
