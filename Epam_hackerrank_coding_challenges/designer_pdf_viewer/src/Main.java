import java.util.Arrays;

public class Main {
    public static void main(String[]args){

    }
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',  'p',  'q',  'r',  's',  't',  'u',  'v',  'w', 'x'
                ,'y',  'z'};
        int max = h[0];
        int index = 0;
        for(int i=0;i<word.length();i++){
            for(int j=0;j<a.length;j++){
                if(word.charAt(i)==a[j]){
                    if(h[j]>max){
                        max=h[j];
                        index = j;
                    }
                }
            }
        }
        return max*word.length();
    }
}
