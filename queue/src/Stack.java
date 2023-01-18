public class Stack <T>{
    public Item<T> q = null;

    public int size = 0;
    public boolean isEmpty() {
        return q == null;
    }

    public void push(T d)
    {
        Item<T> tmp = new Item<T>(d);
        tmp.next = q;
        q = tmp;
        size++;
    }

    public T pop()
    {
        if (isEmpty())
            return null;
        T tmp = q.getData();
        q = q.next;
        return tmp;
    }

}