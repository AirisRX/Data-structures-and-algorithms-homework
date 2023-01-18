public class BinaryTree
{

    Node head;
    int total = 0;

    public BinaryTree()
    {
        this.head = null;
    }

    private Node insertHelper(Node current, int value)
    {
        this.total++;
        if(current == null)
        {
            return new Node(value);
        }
        else if(value < current.data)
        {
            current.left = insertHelper(current.left, value);
        }
        else if(value > current.data)
        {
            current.right = insertHelper(current.right, value);
        }
        else
        {
            current.count++;
        }
        return current;
    }

    public void insert(int value)
    {
        head = insertHelper(head, value);
    }

    private void printHelper(Node current)
    {
        if(current != null)
        {
            printHelper(current.left);
            System.out.println(current.data + "(" + current.count + ")");
            printHelper(current.right);
        }
    }

    public void print()
    {
        printHelper(this.head);
    }

    public boolean search(int value)
    {
        return searchHelper(head,value);
    }

    private boolean searchHelper(Node current, int value)
    {
        if (current == null)
        {
            return false;
        }
        else if (value == current.data)
        {
            return true;
        }
        else if (value < current.data)
        {
            return searchHelper(current.left,value);
        }
        else
        {
            return searchHelper(current.right,value);
        }
    }

    public void remove(int value)
    {
        if(search(value))
        {
            removeHelper(head, value);
        }
        else
        {
            System.out.println(value + "Was not found");
        }
    }
    private Node removeHelper(Node current, int value)
    {
        if(current == null)
        {
            return null;
        }
        else if (value < current.data)
        {
            current.left = removeHelper(current.left,value);
        }
        else if (value > current.data)
        {
            current.right = removeHelper(current.right,value);
        }
        else
        {
            if (current.left == null && current.right == null)
            {
                current = null;
            }
            else if(current.right != null)
            {
                current.data = next(current);
                current.right = removeHelper(current.right, current.data);
            }
            else
            {
                current.data = previous(current);
                current.left = removeHelper(current.left,current.data);
            }
        }
        return current;
    }

    private int next(Node current)
    {
        current = current.right;
        while(current.left != null)
        {
            current = current.left;
        }
        return current.data;
    }
    private int previous(Node current)
    {
        current = current.left;
        while(current.right != null)
        {
            current = current.right;
        }
        return current.data;
    }

}