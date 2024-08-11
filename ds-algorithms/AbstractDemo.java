abstract class Abs{
    abstract void main();
}
public class AbstractDemo {

    Abs abs=new Abs() {
        @Override
        void main() {
            System.out.println("Overriden");
        }
    };
}
