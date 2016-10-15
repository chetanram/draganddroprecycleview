package com.recycleview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 14/10/16.
 */

public class SampleData {
    public static List<Customer> addSampleCustomers(){
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer1 = new Customer();
        customer1.setId((long) 1);
        customer1.setName("Debbie Sam");
        customer1.setEmailAddress("deb@email.net");
        customer1.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest1.JPG");
        customers.add(customer1);


        Customer customer2 = new Customer();
        customer2.setId((long) 2);
        customer2.setName("Keisha Williams");
        customer2.setEmailAddress("diva@comcast.com");
        customer2.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest2.JPG");
        customers.add(customer2);


        Customer customer3 = new Customer();
        customer3.setId((long) 3);
        customer3.setName("Gregg McQuire");
        customer3.setEmailAddress("emailing@nobody.com");
        customer3.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest3.JPG");
        customers.add(customer3);


        Customer customer4 = new Customer();
        customer4.setId((long) 4);
        customer4.setName("Jamal Puma");
        customer4.setEmailAddress("jamal@hotmail.com");
        customer4.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest4.JPG");
        customers.add(customer4);


        Customer customer5 = new Customer();
        customer5.setId((long) 5);
        customer5.setName("Dora Keesler");
        customer5.setEmailAddress("dora@yahoo.com");
        customer5.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest5.JPG");
        customers.add(customer5);

        Customer customer6 = new Customer();
        customer6.setId((long) 6);
        customer6.setName("Anthony Lopez");
        customer6.setEmailAddress("toney@gmail.com");
        customer6.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest6.JPG");
        customers.add(customer6);

        Customer customer7 = new Customer();
        customer7.setId((long) 7);
        customer7.setName("Ricardo Weisel");
        customer7.setEmailAddress("ricardo@gmail.com");
        customer7.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest7.JPG");
        customers.add(customer7);

        Customer customer8 = new Customer();
        customer8.setId((long) 8);
        customer8.setName("Angele Lu");
        customer8.setEmailAddress("angele@ymail.com");
        customer8.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest8.JPG");
        customers.add(customer8);


        Customer customer9 = new Customer();
        customer9.setId((long) 9);
        customer9.setName("Brendon Suh");
        customer9.setEmailAddress("brendon@outlook.com");
        customer9.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest9.JPG");
        customers.add(customer9);


        Customer customer10 = new Customer();
        customer10.setId((long) 10);
        customer10.setName("Pietro Augustino");
        customer10.setEmailAddress("pietro@company.com");
        customer10.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest10.JPG");
        customers.add(customer10);


        Customer customer11 = new Customer();
        customer11.setId((long) 11);
        customer11.setName("Matt Zebrotta");
        customer11.setEmailAddress("matt@stopasking.com");
        customer11.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest11.JPG");
        customers.add(customer11);

        Customer customer12 = new Customer();
        customer12.setId((long) 12);
        customer12.setName("James McGiney");
        customer12.setEmailAddress("james@outlook.com");
        customer12.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest12.JPG");
        customers.add(customer12);


        return customers;

    }
}