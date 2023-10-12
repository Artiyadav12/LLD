package com.lld.bidblitz;

public class Event {
    private Integer id;
    private String event_name;
    private String prize_name;

    private String date;

    public Event(Integer id,String event_name,String prize_name,String date){
        this.id=id;
        this.event_name=event_name;
        this.prize_name=prize_name;
        this.date=date;
    }

    public Integer getId() {
        return id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public String getPrize_name() {
        return prize_name;
    }

    public String getDate() {
        return date;
    }
}
