package My;

public class AlignCenter implements AlignStrategy {
    @Override
    public void Print(String text) {
        System.out.println("+++++"+text+"+++++");
    }
}