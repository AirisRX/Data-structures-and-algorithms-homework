public class Item<T> {
    protected T data;
    public Item<T> next=null;

    public Item(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}