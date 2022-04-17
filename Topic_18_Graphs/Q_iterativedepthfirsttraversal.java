package Topic_18_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;


public class Q_iterativedepthfirsttraversal {

    static class Edge {

        int src;

        int nbr;


        Edge(int src, int nbr) {

            this.src = src;

            this.nbr = nbr;

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

            graph[v1].add(new Edge(v1, v2));

            graph[v2].add(new Edge(v2, v1));

        }


        int src = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[vtces];


        // write your code here

        Stack<Pair> st = new Stack<>();

        st.push(new Pair(src, src + ""));

        while (st.size() > 0) {

            Pair rem = st.pop();


            if (visited[rem.vtx] == true) {

                continue;

            }

            visited[rem.vtx] = true;


            System.out.println(rem.vtx + "@" + rem.psf);

            for (Edge e : graph[rem.vtx]) {

                if (visited[e.nbr] == false) {

                    st.push(new Pair(e.nbr, rem.psf + e.nbr));

                }

            }

        }

    }

}