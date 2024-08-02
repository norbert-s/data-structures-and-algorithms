package org.sample.string;

public class MiddleThree {
    public String middleThree(String str) {
        int kozepso_elem = str.length()/2;

        return str.substring(kozepso_elem-1,kozepso_elem+2);

    }

}
