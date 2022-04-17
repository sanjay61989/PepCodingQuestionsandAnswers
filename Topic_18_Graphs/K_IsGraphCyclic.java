package Topic_18_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;


public class K_IsGraphCyclic {

    static class Edge {

        int src;

        int nbr;

        int wt;


        Edge(int src, int nbr, int wt) {

            this.src = src;

            this.nbr = nbr;

            this.wt = wt;

        }

    }


    static class Pair {

        int vtx;

        String psf;


        Pair(int vtx, String psf) {

            this.vtx = vtx;

            this.psf = psf;

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

            int wt = Integer.parseInt(parts[2]);

            graph[v1].add(new Edge(v1, v2, wt));

            graph[v2].add(new Edge(v2, v1, wt));

        }


        // write your code here

        boolean[] visited = new boolean[vtces];

        for (int i = 0; i < graph.length; i++) {

            if (visited[i] == false) {

                boolean isCyclic = isCyclic(graph, visited, i);

                if (isCyclic == true) {

                    System.out.println(true);

                    return;

                }

            }

        }


        System.out.println(false);

    }


    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean[] visited, int src) {

        ArrayDeque<Pair> queue = new ArrayDeque<>();

        queue.add(new Pair(src, src + ""));


        while (queue.size() > 0) {

            // remove, mark*, work, add*

            Pair rem = queue.remove();


            if (visited[rem.vtx] == true) {

                return true;

            }

            visited[rem.vtx] = true;


            // System.out.println(rem.vtx + "@" + rem.psf);


            for (int i = 0; i < graph[rem.vtx].size(); i++) {

                Edge e = graph[rem.vtx].get(i);

                if (visited[e.nbr] == false) {

                    queue.add(new Pair(e.nbr, rem.psf + e.nbr));

                }

            }

        }


        return false;

    }

}