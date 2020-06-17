package com.creational.factory;

public class FactoryDemo {

    public static void main(String[] args){
//        Calendar calendar;// = Calendar.getInstance();
//
//        calendar = Calendar.getInstance(TimeZone.getDefault());
//
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP );
        System.out.println(shop.getPages());

    }
}
