/* amrita h nair 
u4cse15208*/

class Node
{
    public int data;
    public Node link;

    public Node()
    {
      link = null;
      data = 0;
    }

    public Node(int d, Node n)
    {
        data = d;
        link = n;
    }

    public Node(int d)
    {
      data = d;
      link = null;
    }

    public void setLink(Node n)
    {
        link = n;
    }

    public void setData(int d)
    {
        data = d;
    }

    public Node getLink()
    {
        return link;
    }

    public int getData()
    {
        return data;
    }
}
