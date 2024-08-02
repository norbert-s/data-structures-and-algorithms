package org.example.linkedlist;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slowA = headA;
        ListNode slowB = headB;
        int counterA = 0;
        int counterB = 0;
        while(true){
            if(slowA!=null){
                slowA=slowA.next;
                counterA++;
            }
            if(slowB!=null){
                slowB=slowB.next;
                counterB++;
            }
            if(slowB==null && slowA==null){
                break;
            }
        }

        int diff = Math.abs(counterA-counterB);
        int counter = 0;
        slowA = headA;
        slowB = headB;
        if(counterA>counterB){
            while(counter!=diff){
                slowA=slowA.next;
                counter++;
            }
        }else if(counterB>counterA){
            while (counter != diff) {
                slowB = slowB.next;
                counter++;
            }
        }

        while(slowA!=slowB&&slowA!=null&&slowB!=null){
            slowA=slowA.next;
            slowB=slowB.next;
        }
        return slowA;

    }
}
