package generic;

public class GenericData<T> {
    private T t;

    public GenericData(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
