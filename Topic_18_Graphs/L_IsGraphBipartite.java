package Topic_18_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;


public class L_IsGraphBipartite {

    static class Edge {

        int src;

        int nbr;


        Edge(int src, int nbr) {

            this.src = src;

            this.nbr = nbr;

        }

    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int vtces = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[vtces];

        for (int i = 0; i < vtces; i++) {

            graph[i] = new ArrayList<>();

        }


        int edges = Integer.parseInt(br.readLine());

        for (int i = 0; i < edges; i++) {

            String[] parts = br.readLine().split(" ");

            int v1 = Integer.parseInt(parts[0]);

            int v2 = Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1, v2));

            graph[v2].add(new Edge(v2, v1));

        }


        Integer[] visited = new Integer[vtces];

        for (int i = 0; i < graph.length; i++) {

            if (visited[i] == null) {

                boolean isBip = IsCompBipartite(graph, visited, i);

                if (isBip == false) {

                    System.out.println(false);

                    return;

                }

            }

        }


        System.out.println(true);


    }


    static class Pair {

        int vtx;

        int level;


        Pair(int vtx, int level) {

            this.vtx = vtx;

            this.level = level;

        }

    }


    public static boolean IsCompBipartite(ArrayList<Edge>[] graph, Integer[] visited, int src) {

        ArrayDeque<Pair> queue = new ArrayDeque<>();

        queue.add(new Pair(src, 1));


        while (queue.size() > 0) {

            Pair rem = queue.remove();


            if (visited[rem.vtx] != null) {

                int originalValue = visited[rem.vtx];

                int newValue = rem.level % 2;


                if (originalValue != newValue) {

                    return false;

                }

            }

            visited[rem.vtx] = rem.level % 2; // 0 for even, 1 for odd, null if unvisited


            for (Edge e : graph[rem.vtx]) {

                if (visited[e.nbr] == null) {

                    queue.add(new Pair(e.nbr, rem.level + 1));

                }

            }

        }


        return true;

    }


}