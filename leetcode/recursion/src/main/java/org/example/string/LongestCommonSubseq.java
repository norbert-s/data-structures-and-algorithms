package org.example.string;

import java.util.List;

public class LongestCommonSubseq {
    public static void main(String[] args) {
        List<String> list = List.of("almafrdgrgdgfdgfdgasdfgh","csmgsdgdsfgdsfgdsgwgfsdakaasdfgh","kgdsfgfdsfgdsgsgasdfgh");
        System.out.println(sub(list));

    }
    private static String sub(List<String> list){
        String maxStr = list.get(0);

        for(int i=1;i<list.size();i++){
            if(!list.get(i).equals(maxStr)|| !list.get(i).endsWith(maxStr)){

                int maxI = maxStr.length()-1;
                int strI = list.get(i).length()-1;
                while(maxI>=0 && strI >=0){

                    if(maxStr.charAt(maxI)!=list.get(i).charAt(strI)){
                        if(strI==list.get(i).length()-1)
                            return "empty";
                        else{
                            maxStr = (list.get(i).substring(strI+1));
                            break;
                        }
                    }
                    maxI--;strI--;
                }
            }
        }
        return maxStr;
    }
}
