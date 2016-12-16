import java.util.Scanner;

public class AdjMat
{
    private  int vertices;
    public int[][] adjacency_matrix;
    /*int[][] a = new int[vertices + 1][vertices + 1];*/
    public AdjMat(int v)
    {

        vertices = v;
		adjacency_matrix = new int[vertices + 1][vertices + 1];
    }
	public void makeEdge(int to, int from, int edge)
    {
        try
        {
            adjacency_matrix[to][from] = edge;
        }
		catch (ArrayIndexOutOfBoundsException index)
        {
			System.out.println("The vertices does not exists");
        }
    }
    public int getEdge(int to, int from)
    {
        try
        {
            return adjacency_matrix[to][from];

        }
		catch (ArrayIndexOutOfBoundsException index)
        {
			System.out.println("The vertices does not exists");
        }
        return -1;
    }
    /*public int getMatrix()
    {
		int i,j;
		for (i = 1; i <= vertices; i++)
		{
			for (j = 1; j <= vertices; j++)
			{
				a[i][j] = getEdge(i,j);
				return a[i][j];
			}
		}
	}*/

    public static void main(String args[])
    {
        int v, e, count = 1, to = 0, from = 0;
        BFS bfs = new BFS();
        DFS dfs = new DFS();
        Scanner sc = new Scanner(System.in);
        AdjMat graph;
        try
        {
			System.out.println("Enter the number of vertices: ");
            v = sc.nextInt();
			System.out.println("Enter the number of edges: ");
            e = sc.nextInt();
			graph = new AdjMat(v);
			System.out.println("Enter the edges: <to> <from>");
            while (count <= e)
            {
                to = sc.nextInt();
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
			System.out.println("The adjacency matrix for the given graph is: ");
            System.out.print("  ");
            for (int i = 1; i <= v; i++)
                System.out.print(i + " ");
            System.out.println();
            for (int i = 1; i <= v; i++)
            {
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++)
					System.out.print(graph.getEdge(i, j) + " ");
                System.out.println();

            }
            System.out.println("Enter the source for the graph");
			int source = sc.nextInt();
			int[][] x = new int[v+1][v+1];
			int i,j;
			for (i = 1; i <= v; i++)
			{
				for (j = 1; j <= v; j++)
				{
					x[i][j] = graph.getEdge(i, j);
				}
			}
			bfs.bfs(x,source);
			dfs.dfs(x,source);
		}

		catch (Exception E)
		{
				System.out.println("Somthing went wrong");
		}
		sc.close();
	}
}
