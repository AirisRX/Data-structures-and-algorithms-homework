public class Item<T> {
    public T data;
    public Item<T> next = null;

    public Item(T data) {

        this.data = data;
    }
}