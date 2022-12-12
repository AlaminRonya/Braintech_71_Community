package com.alamin.txt_file_read;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Root {
    private static Map<String, Customer> customers = new HashMap<>();

    public static void main(String[] args) throws IOException {
//        String msg = ",a,,b";
//        String[] split = msg.split(",");
//        System.out.println(split.length);

        System.out.println(EmailValidImpl.isValid(""));
        txtFileRead();
    }

    private static void txtFileRead() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "D:/Braintech 71 Community/JavaBasic/src/main/java/com/alamin/" +
                        "txt_file_read/1M-customers.txt"));

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;

            while (line != null) {
//                System.out.println("=========================");
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] split = line.split(",");
                createObj(split);
                if (split.length < 7){
                    System.out.println("=================================="+split.length);
                    System.out.println(split[split.length-1]);
                    System.out.println(split[split.length-2]);
                    System.out.println(split[split.length-3]);

                    c1++;
                }else if (split.length == 8){
                    c2++;
                }else {
//                    for (int i=0; i < 8; i++){
//                        System.out.println(split[i]);
//                    }
//                    System.out.println("=================================="+split.length);
//                    for (int i=8; i < split.length; i++){
//                        System.out.println(split[i]);
//                    }
//                    System.out.println("==================================");
                    c3++;
                }

//                for (int i=0; i < split.length; i++){
//                    System.out.println(split[i]);
//                }
//                System.out.println("=========================");

                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println("C1: "+c1+"\nC2: "+c2+"\nC3: "+c3+"\n"+(c1+c2+c3));
            System.out.println(customers.size());
        } finally {
            br.close();
        }
    }

    private static void createObj(String[] str){
        if (str.length==7){
            createdObjectImp(obj7(str));
        }else if (str.length==8){
            createdObjectImp(obj8(str));
        }else if (str.length == 15){
            String[] newString7 = new String[7];
            String[] newString8 = new String[8];
            for (int i = 8; i < str.length; i++) {
                newString7[i-8] = str[i];
            }
            for (int i = 0; i < 8; i++) {
                newString8[i] = str[i];
            }
            createdObjectImp(obj7(newString7));
            createdObjectImp(obj8(newString8));
        }
    }
    private static void createdObjectImp(Customer customer){
        if (!EmailValidImpl.isValid(customer.getEmail())){
            System.out.println(customer);
        }
        if (!customers.containsKey(customer.getEmail()) && EmailValidImpl.isValid(customer.getEmail())){
            customers.put(customer.getEmail(), customer);
        }
    }
    private static Customer obj7(String[] strings){
        Customer customer = new Customer();
        customer.setFirstName(strings[0]);
        customer.setLastName(strings[1]);
        customer.setCity(strings[2]);
        customer.setFloors(strings[3]);
        customer.setFeets(strings[4]);
        customer.setPhoneNumber(strings[5]);
        customer.setEmail(strings[6]);
        return customer;
    }
    private static Customer obj8(String[] strings){
        Customer customer = new Customer();
        customer.setFirstName(strings[0]);
        customer.setLastName(strings[1]);
        customer.setCity(strings[2]);
        customer.setFloors(strings[3]);
        customer.setFeets(strings[4]);
        customer.setPhoneNumber(strings[5]);
        customer.setEmail(strings[6]);
        customer.setIpAddress(strings[7]);
        return customer;
    }
}
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Customer{
    private String firstName;
    private String lastName;
    private String city;
    private String floors;
    private String feets;
    private String phoneNumber;
    private String email;
    private String ipAddress;
}
