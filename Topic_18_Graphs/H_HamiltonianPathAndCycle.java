package Topic_18_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class H_HamiltonianPathAndCycle {

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


        int src = Integer.parseInt(br.readLine());


        boolean[] visited = new boolean[vtces];


        getHamilTonian(src, graph, 1, visited, src, src + "", vtces);


        // write all your codes here

    }


    public static void getHamilTonian(int src, ArrayList<Edge> graph[], int vsf, boolean[] visited, int curr, String psf, int vtces) {

        if (vsf == vtces) {

            boolean hamiltonian = false;

            for (Edge e : graph[curr]) {

                if (e.nbr == src) {

                    hamiltonian = true;

                    System.out.println(psf + "*");

                    break;

                }

            }

            if (hamiltonian == false) {

                System.out.println(psf + ".");

            }

            return;

        }


        visited[curr] = true;


        for (Edge e : graph[curr]) {

            if (visited[e.nbr] == false) {

                getHamilTonian(src, graph, vsf + 1, visited, e.nbr, psf + e.nbr, vtces);

            }

        }


        visited[curr] = false;


    }


}

