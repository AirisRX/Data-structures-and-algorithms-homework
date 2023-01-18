public class Node
{

    int data;
    Node left;
    Node right;
    int count;

    Node(int integer)
    {
        this.data = integer;
        this.left = null;
        this.right = null;
        this.count = 1;
    }

}