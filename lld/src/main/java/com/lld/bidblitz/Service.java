package com.lld.bidblitz;

import java.util.*;

public class Service {
    public List<Member> members = new ArrayList<>();

    public List<Event> events = new ArrayList<>();


    public List<Bids> bidList=new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " added successfully");
    }

    public void addEvent(Event event) {
        if (events.size() == 0) {
            events.add(event);
            System.out.println(event.getEvent_name() + " with prize " + event.getPrize_name() + " added successfully");
        } else {
            System.out.println("Can't add event more than 1");
        }

    }


   // public Map<Member, Event> memberEventMap = new HashMap<>();

    public void addMemberEvent(Integer memberId, Integer eventId) {
        bidList.add(new Bids(eventId,memberId,new ArrayList<>()));
        Optional<Member> optionalMember = members.stream()
                .filter(member -> member.getId() == memberId)
                .findFirst();

        Optional<Event> optionalEvent = events.stream()
                .filter(member -> member.getId() == eventId)
                .findFirst();


        if(optionalMember.isPresent() && optionalEvent.isPresent()) {
           Member member = optionalMember.get();
           Event event=optionalEvent.get();
            System.out.println(member.getName() + "  registered to the " + event.getEvent_name() + " event successfully");
        }
    }

  //  Map<String, Integer> memberBids = new HashMap<>();

    public void submitBid(Integer member_id, Integer event_id,List<Integer> bids) {

        Optional<Member> optionalMember = members.stream()
                .filter(member -> member.getId() == member_id)
                .findFirst();
        if (!optionalMember.isPresent()) {
            System.out.println("Member did not registered for this event");
            return;
        }

        for (Integer bid:bids) {
            if (bid == 0) {
                System.out.println("Bids should be greater than 0");
                return;
            }



        }

        Optional<Bids> optionalBid=  bidList.stream().filter(bids1 -> bids1.getEventId()==event_id).findFirst();
        if(optionalBid.isPresent())
            optionalBid.get().addBids(bids);
        System.out.println("BIDS submitted successfully");


    }


    public void winner() {

//        String winnerKey = "";
        Integer winnerBid = Integer.MAX_VALUE;

//        Optional<Integer> max=
//
//        bidList.stream().map(bids -> bids.getBids().stream().min(Integer::compareTo)).filter(Optional::isPresent).map(Optional::get).max(Integer::compareTo);

        Integer memberId = null;
        Integer eventId = null;

        for (Bids bid:bidList) {
            Optional<Integer> max= bid.getBids().stream().max(Integer::compareTo);
            if(max.isPresent()) {
                if(max.get()<winnerBid){
                    winnerBid= max.get();
                    memberId=bid.getMemberId();
                    eventId= bid.getEventId();
                }
            }
        }

        Integer finalEventId = eventId;
        Event event = events.stream().filter(member1 -> member1.getId() == finalEventId).findFirst().get();
        Integer finalMemberId = memberId;
        Member member = members.stream().filter(member1 -> member1.getId() == finalMemberId).findFirst().get();
        System.out.println(member.getName() + " wins the " + event.getPrize_name() + " with lowest bid " + winnerBid);
    }
}
