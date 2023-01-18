// Airidas Rupšas - JNII21

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();

        bt.insert(5);
        bt.insert(8);
        bt.insert(2);
        bt.insert(9);
        bt.insert(5);
        bt.insert(9);
        bt.insert(5);

        bt.print();

        System.out.println(bt.search(5));

        bt.remove(5);

        bt.print();

        System.out.println(bt.search(5));
    }
}