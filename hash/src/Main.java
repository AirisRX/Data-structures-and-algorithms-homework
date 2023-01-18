public class Main {
    public static void main(String[] args) {

        HTable h = new HTable(16);
        h.put("Labas");
        h.put("Viso");
        h.put("Vakaras");
        h.put("Naujas");
        h.put("Senas");
        h.put("Kazkas");
        h.put("Antanas");
        h.put("Petras");
        h.put("Gediminas");
        h.put("Jonas");
        h.put("Zilvinas");

        System.out.println("Before removing: ");
        for (Entity e : h.entities)
        {
            if (e == null)
            {
                System.out.println("NULL");
                continue;
            }
            Entity tmp = e;
            while (tmp != null)
            {
                System.out.print(tmp.toString()+" ");
                tmp = tmp.next;
            }
            System.out.println();
        }

        System.out.println(h.contains("Pietus"));

        System.out.println("After removing:");
        h.remove("Gediminas");
        h.remove("Petras");
        h.remove("Jonas");

        for (Entity e : h.entities)
        {
            if (e == null)
            {
                System.out.println("NULL");
                continue;
            }
            Entity tmp = e;
            while (tmp != null ) {
                System.out.print(tmp.toString()+" ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }
}