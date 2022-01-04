package Others;
import java.util.*;

public class pmpwithjumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
		printMazePaths(1, 1, row, col, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int hss = 1; hss <= dc - sc; hss++){
            printMazePaths(sr, sc + hss, dr, dc, psf + "h" + hss);
        }

        for(int vss = 1; vss <= dr - sr; vss++){
            printMazePaths(sr + vss, sc, dr, dc, psf + "v" + vss);
        }

        for(int dss = 1; dss <= dr - sr && dss <= dc - sc; dss++){
            printMazePaths(sr + dss, sc + dss, dr, dc, psf + "d" + dss);
        }
    }

}