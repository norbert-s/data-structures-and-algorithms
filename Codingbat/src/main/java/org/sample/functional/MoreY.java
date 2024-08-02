package org.sample.functional;

import java.util.List;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n-> concatMyString(n,"y"));
        return strings;
    }

    public  String concatMyString(String n,String ezt){
        String kezdo = ezt;
        kezdo += n;
        kezdo += ezt;
        return kezdo;
    }

}
