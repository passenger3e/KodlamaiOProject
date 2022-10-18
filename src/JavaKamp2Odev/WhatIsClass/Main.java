package JavaKamp2Odev.WhatIsClass;

public class Main {
    public static void main(String[] args) {
        //class is a reference type
        CustomerManager customerManager;//=new CustomerManager(); //no Initialization needed any more.
        /*
        if the class intialized with another class with reference,Garbage collector ,which java's memory management system, will delete this object on heap area
         */
        CustomerManager customerManager1=new CustomerManager(); // making new creates an object on heap area in memory
        customerManager=customerManager1;// reference number(on stack) of the customerManager1 is equalized to customerManager
        customerManager.Add();//this kind of calling runs in heap area not in stack, stack is just a reference
        customerManager.Delete();
        customerManager.Update();
    }
}
