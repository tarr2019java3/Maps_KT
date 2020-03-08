package pl.sda.mapy;

public class Generics<T> {

    private T field;

    public Generics(T field) {
        this.field = field;

    }

    public T getField() {
        return field;
    }
}
