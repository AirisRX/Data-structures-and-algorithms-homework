public class Stack <T>{
    private Item<T> q=null;
    public int size = 0;

    public boolean isEmpty() {
        return q==null;
    }

    public void push(T d) {
        Item<T> tmp=new Item<T>(d);
        tmp.next=q;
        q=tmp;
        size++;
    }

    public T pop() {
        if (isEmpty())
            return null;
        T tmp=q.data;
        q=q.next;
        return tmp;
    }

    public T peek() {
        if (isEmpty())
            return null;
        return q.data;
    }

    public boolean search(T value) {
        Item<T> a = q;
        T temp = a.data;
        while(isEmpty()) {
            if (temp == value) {
                return true;
            }
            a = a.next;
            temp = a.data;
        }
        return false;
    }

    public T get(int n){
        Item<T> a = q;
        T temp = null;
        if (!isEmpty() && n<=size) {
            for (int i = 1; i <= size ; i++) {
                if (i == n) {
                    temp = a.data;
                }
                a = a.next;
            }
        }
        return temp;
    }

    public void remove(int n){
        Item<T> a = q;
        Item<T> b = null;
        if (n<=size && n>0){
            for (int i = 1; i < size; i++) {
                Item<T> tmp= new Item<>(a.data);
                tmp.next = b;
                b = tmp;
                if (i == (n-1) && a.next!=null && a.next.next!=null) {
                    a = a.next.next;
                } else {
                    a = a.next;
                }
            }
        }

        size--;

        Item<T> c=null;
        for(int i = 1; i<=size; i++){
            assert b != null;
            Item<T> tmp = new Item<>(b.data);
            tmp.next = c;
            c = tmp;
            b = b.next;
        }
        q = c;
    }
}