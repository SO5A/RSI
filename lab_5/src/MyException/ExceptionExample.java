package MyException;

public class ExceptionExample {
    public void example() throws MyException {
        System.out.println("Example of exception MyException !");
        throw new MyException();
    }
}
