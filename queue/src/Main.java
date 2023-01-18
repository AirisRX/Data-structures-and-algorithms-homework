// Airidas Rupšas - JNII21

public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        for (int i = 1; i < 6; i++)
        {
            q.enterQueue(i);
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(q.count());
        System.out.println();

        q.add(10, 7);

        q.remove(8);

        System.out.println("Queue elements: ");
        while (!q.isEmpty())
        {
            System.out.print(q.leaveQueue()+" ");
        }

    }
}