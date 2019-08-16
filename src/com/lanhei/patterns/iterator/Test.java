package com.lanhei.patterns.iterator;

public class Test {
    public static void main(String[] args) {
        Container namesRepository = new NameRepository();
        //String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
       //Container namesRepository=new NameRepository1(names);

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
