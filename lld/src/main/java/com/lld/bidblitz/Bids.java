package com.lld.bidblitz;

import java.util.List;

public class Bids {

    private Integer eventId;
    private Integer memberId;

    private List<Integer> bids;

    public Bids(Integer eventId, Integer memberId, List<Integer> bids) {
        this.eventId = eventId;
        this.memberId = memberId;
        this.bids = bids;
    }

    public Integer getEventId() {
        return eventId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public List<Integer> getBids() {
        return bids;
    }

    public void addBids(List<Integer> bids){
        this.bids=bids;
    }

}
