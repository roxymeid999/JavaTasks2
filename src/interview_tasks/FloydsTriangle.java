package interview_tasks;

public class FloydsTriangle {
    public static void main(String[] args) {
        int numOfRows = 5;
        int i,j,k=1;

        for ( i = 1; i <= numOfRows; i++) {

            for (j = 1; j <= i; j++, k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
