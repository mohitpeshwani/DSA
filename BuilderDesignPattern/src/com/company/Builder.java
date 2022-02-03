package com.company;

class  Builder {
    private String fname;
    private String lname;
    private int age;
    private String address;

    public Builder(UserBuilder builder){
        this.fname=builder.fname;
        this.lname=builder.lname;
        this.age=builder.age;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public static class UserBuilder{
        private String fname;
        private String lname;
        private int age;
        private String address;

        public UserBuilder(String fname,String lname){
            this.fname=fname;
            this.lname=lname;
        }
        public UserBuilder(String fname,String lname,int age){
            this.fname=fname;
            this.lname=lname;
            this.age=age;
        }
        public UserBuilder(String fname,String lname,int age,String address){
            this.fname=fname;
            this.lname=lname;
            this.address=address;
        }
        public Builder build(){
           return new Builder(this);
        }



    }

}
