/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class MyCall {
    private static int counter = 0;
    private int id;

    public MyCall() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }
}
