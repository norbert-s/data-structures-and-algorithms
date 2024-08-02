package org.sample.functional2;

import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(n->n.length()>=4);
        return strings;
    }

}
