package com.creational.builder;

public class LunchOrder {
    private String bread;
    private String condiments;

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    private String dressing;
    private String meat;

    private Builder builder;

    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        Builder(){

        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

    private LunchOrder(Builder builder){
        this.builder = builder;
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        if(this.bread!=null){
            stringBuilder.append("Bread : ");
            stringBuilder.append(this.bread);
            stringBuilder.append("\n");
        }

        if(this.dressing!=null) {
            stringBuilder.append("Dressing : " );
            stringBuilder.append(this.dressing);
            stringBuilder.append("\n");
        }
        if(this.condiments!=null) {
            stringBuilder.append("Condiments : ");
            stringBuilder.append(this.condiments);
            stringBuilder.append("\n");
        }
        if(this.meat!=null){
            stringBuilder.append("Meat : ");
            stringBuilder.append(this.meat);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
