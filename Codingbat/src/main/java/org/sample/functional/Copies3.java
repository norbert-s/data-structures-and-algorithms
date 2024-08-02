package org.sample.functional;

import java.util.List;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n->n+n+n);
        return strings;
    }

}
