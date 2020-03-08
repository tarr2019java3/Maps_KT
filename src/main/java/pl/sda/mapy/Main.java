package pl.sda.mapy;

        import org.w3c.dom.ls.LSOutput;

        import java.util.Map;

public class Main {
    public static void main(String[] args) {



    Generics<String> generics = new Generics<String>("test");
        System.out.println(generics.getField());
    Generics<Integer> generics1 = new Generics<Integer>(1);
        System.out.println(generics1.getField());
}
  }