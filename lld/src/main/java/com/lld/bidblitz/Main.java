package com.lld.bidblitz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Member member1=new Member(1,"Arti",600);
        Member member2 = new Member(2, "Jyoti", 900);
        Member member3 = new Member(3, "Vaibhav", 1000);

        Service service = new Service();
        service.addMember(member1);
        service.addMember(member2);
        service.addMember(member3);


        Event event = new Event(111, "BBD", "IPHONE-14", "2023-06-06");
        service.addEvent(event);

        service.addMemberEvent(1, 111);
        service.addMemberEvent(2, 111);
        service.addMemberEvent(3, 111);

        service.submitBid(1, 111, Arrays.asList(100, 200, 40, 50, 10));
        service.submitBid(2, 111, Arrays.asList(100, 200, 20, 500));
        service.submitBid(31, 111, Arrays.asList(0, 300, 30, 40, 50));

        service.winner();

    }
}
