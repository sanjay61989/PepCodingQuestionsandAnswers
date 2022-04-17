package Topic_18_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class G_PerfectFriends {

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


        int n = Integer.parseInt(br.readLine());

        int k = Integer.parseInt(br.readLine());


        // write your code here

        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {

            graph[i] = new ArrayList<>();

        }


        for (int i = 0; i < k; i++) {

            String str = br.readLine();

            int v1 = Integer.parseInt(str.split(" ")[0]);

            int v2 = Integer.parseInt(str.split(" ")[1]);

            graph[v1].add(new Edge(v1, v2));

            graph[v2].add(new Edge(v2, v1));

        }


        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        boolean[] visited = new boolean[n];


        for (int i = 0; i < graph.length; i++) {

            if (visited[i] == false) {

                ArrayList<Integer> comp = new ArrayList<>();

                fillComp(graph, comp, visited, i);

                comps.add(comp);

            }

        }


        int count = 0;

        for (int i = 0; i < comps.size(); i++) {

            for (int j = i + 1; j < comps.size(); j++) {

                int si = comps.get(i).size();

                int sj = comps.get(j).size();

                int pairs = si * sj;

                count += pairs;

            }

        }


        System.out.println(count);


    }


    static void fillComp(ArrayList<Edge>[] graph, ArrayList<Integer> comp, boolean[] visited, int src) {

        visited[src] = true;

        comp.add(src);


        for (int i = 0; i < graph[src].size(); i++) {

            Edge e = graph[src].get(i);

            if (visited[e.nbr] == false) {

                fillComp(graph, comp, visited, e.nbr);

            }

        }

    }


}