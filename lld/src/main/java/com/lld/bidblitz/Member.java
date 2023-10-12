package com.lld.bidblitz;

public class Member {

   private Integer id;
    private String name;
    private Integer number_of_super_coins;

   public Member(Integer id,String name,Integer number_of_super_coins){
       this.id=id;
       this.name=name;
       this.number_of_super_coins=number_of_super_coins;
   }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber_of_super_coins() {
        return number_of_super_coins;
    }
}
