public class HTable
{
    public Entity[] entities;
    public int size;

    public HTable(int size)
    {
        this.entities = new Entity[size];
        this.size = size;
    }


    public int getHash(String data)
    {
        return Math.abs(data.hashCode()) % this.size;
    }

    public void put(String data)
    {
        int hash = this.getHash(data);
        Entity tmp = new Entity(data);
        System.out.println(data+"="+hash);
        if (this.entities[hash] == null)
        {
            this.entities[hash] = tmp;
            return;
        }
        else
        {
            Entity e = this.entities[hash];
            while (e.next != null)
            {
                e = e.next;
            }
            e.next = tmp;
        }
    }

    public boolean contains(String value)
    {
        int hash = getHash(value);
        Entity e = this.entities[hash];
        if (e == null)
        {
            return false;
        }
        else
        {
            while (e != null) {
                if (e.value.equals(value))
                {
                    return true;
                }
                e = e.next;
            }
            return false;
        }
    }

    public void remove(String value)
    {
        int hash = getHash(value);
        Entity e = this.entities[hash];
        if (e.value == value && e.next != null)
        {
            e.value = e.next.value;
            e.next = e.next.next;
        }
        else if (e.value == value && e.next == null)
        {
            entities[hash] = null;
        }
        else
        {
            while (e.next.value != value)
            {
                e = e.next;
            }
            if (e.next.next != null)
            {
                e.next = e.next.next;
                e.next.next = null;
            }
            else
            {
                e.next = null;
            }
        }
    }
}