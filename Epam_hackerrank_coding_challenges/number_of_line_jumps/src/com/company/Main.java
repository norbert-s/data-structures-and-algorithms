package number_of_line_jumps.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int pos1=x1;
        int pos2=x2;
        int i=0;
        boolean possible = false;
        int index = Math.abs((x1-x2)*(x1-x2));
        while(i!=65500000){
            pos1+=v1;
            pos2+=v2;
            if(pos1==pos2){
                possible=true;
            }
            i++;
        }
        if(possible){
            return "YES";
        }
        else{
            return "NO";
        }

    }
}
