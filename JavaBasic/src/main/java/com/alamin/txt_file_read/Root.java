package com.alamin.txt_file_read;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Root {
    private static Map<String, Customer> customers = new HashMap<>();
    private static Map<String, Customer> customersNumber = new HashMap<>();
    private static List<Customer> customersInvalidList = new ArrayList<>();
    static int t = 0;
    static int t1 = 0;
    static int t2 = 0;
    static int test1 = 0;
    static int test2 = 0;
    static int o1 = 0;


    private static void print(){
        for (Map.Entry<String, Customer> entry: customers.entrySet()){
            if(entry.getValue().getIpAddress() == null){
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }

        }
        System.out.println("=======");
    }

    public static void main(String[] args) throws IOException {
//        String msg = ",a,,b";
//        String[] split = msg.split(",");
//        System.out.println(split.length);

//        System.out.println(IpAddressValidImpl.isValid("256.63.177.255"));
//        txtFileRead();
//        print();
//        System.out.println("Invalid Number size: "+customersInvalidList.size());

        txtFileRead();
        dynamic();
        System.out.println("test1: "+test1);
        System.out.println("test2: "+test2);
        System.out.println("o1: "+o1);

//        testing();
//        System.out.println(IpAddressValidImpl.isValid("069.028.216.097"));
    }

    private static void testing(){
//        String str = "francis, williams, spotsylvania, va, 22553, 5407984693, franciswilliams@gmail.com, 069.028.216.097";
        String str = "Robert,Branch,Haines city,FL,33844,4074686162,rbranch@pacbell.net" +
                ",Robert,Branch,Haines city,FL,33844,4074686162,rbranch@pacbell.net" +
                ",francis, williams, spotsylvania, va,22553,5407984693,franciswilliams@gmail.com,069.028.216.097"+
                ",Robin,Branch,Haines city,33844,4074686162,rbranch@pacbell.net";
        String[] split = str.split(",");
        List<String> list = new ArrayList<>();
        for (int i = split.length-1; i >= 0; i--){
            String string = split[i].trim();
            if (i==0){
                list.add(split[i]);
                System.out.println(list);
                list.clear();
                break;
            }

            else if ((i-1 > 2) && IpAddressValidImpl.isValid(split[i-1].trim())
                    && split[i-2].trim().contains("@") && NumericNumber.isNumeric(split[i-3].trim())){
                list.add(split[i]);
                System.out.println(list);
                list.clear();
            }

            else if ((i-1)>1 && !IpAddressValidImpl.isValid(split[i].trim())
                    && split[i-1].trim().contains("@") && NumericNumber.isNumeric(split[i-2].trim())){
                list.add(split[i]);
                System.out.println(list);
                list.clear();
            }
            else {
                list.add(split[i]);
            }
        }

    }
    private static void dynamic() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "D:/Braintech 71 Community/JavaBasic/src/main/java/com/alamin/" +
                        "txt_file_read/1M-customers.txt"));

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] split = line.split(",");
                if (split.length == 7 || split.length == 8 || split.length == 15 ){

                }else{
                    System.out.println(line+"==>"+line.split(",").length);
                }

                test(line.split(","));

                line = br.readLine();
            }

        } finally {
            br.close();
        }

    }
    private static void test(String[] split){


        List<String> list = new ArrayList<>();
        for (int i = split.length-1; i >= 0; i--){
            if (i==0){
                list.add(split[i]);
//                System.out.println("==================1======================");
//                System.out.println(list);
                if (list.size()==7 || list.size() == 8){
                    test2++;
                }else {
                    System.out.println("1:==>"+list);
                }
                test1++;
                list.clear();
                break;
            }
            else if ((i-1 > 3) &&  IpAddressValidImpl.isValid(split[i-1].trim())
                    && split[i-2].trim().contains("@") && NumericNumber.isNumeric(split[i-3].trim())){
                list.add(split[i]);
//                System.out.println("==================2======================");
//                System.out.println(list);
                if (list.size()==7 || list.size() == 8){
                    test2++;
                }else {
                    System.out.println("2:==>"+list);
                }
                test1++;
                list.clear();
            }

            else if ((i-1 > 3) && !IpAddressValidImpl.isValid(split[i].trim())
                    && split[i-1].trim().contains("@") && NumericNumber.isNumeric(split[i-2].trim())) {

                list.add(split[i]);
//                System.out.println("==================3======================");
//                System.out.println(list);
                if (list.size()==7 || list.size() == 8){
                    test2++;
                }else {
                    System.out.println("===>"+Arrays.asList(split));
                    System.out.println("3:==>"+list);
                }
                test1++;
                list.clear();
            }

            else {
                list.add(split[i]);
            }
//            if (i == 0){
//                strings[index] = split[i];
//                for (String s: strings){
//                    System.out.print(","+s);
//                }
//                System.out.println();
//                break;
//            }else if (p == 8){
//                for (String s: strings){
//                    System.out.print(","+s);
//                }
//                System.out.println();
//                strings = new String[8];
//                index = 7;
//                strings[index--] = split[i];
//                p = 1;
//            }else {
//                strings[index--] = split[i];
//                p++;
//            }
        }
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
                if (split.length == 7){
//                    System.out.println("=================================="+split.length);
//                    System.out.println(split[split.length-1]);
//                    System.out.println(split[split.length-2]);
//                    System.out.println(split[split.length-3]);

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
            System.out.println((t1+t2));
            System.out.println(t+customers.size());
            System.out.println(customers.size());
            System.out.println("Number:"+customersNumber.size());
        } finally {
            br.close();
        }
    }

    private static Customer objectCreate(List<String> list){
        Customer customer = new Customer();
        customer.setFirstName(list.get(list.size()-1));
        if (list.size() == 7){
            if (IpAddressValidImpl.isValid(list.get(0).trim())){
                customer.setIpAddress(list.get(0));
                customer.setEmail(list.get(1));
                customer.setPhoneNumber(list.get(2));
                customer.setFeets(list.get(3));
                customer.setFloors(list.get(4));
                customer.setCity(list.get(5));
            }else {
                customer.setEmail(list.get(0));
                customer.setPhoneNumber(list.get(1));
                customer.setFeets(list.get(2));
                customer.setFloors(list.get(3));
                customer.setCity(list.get(4));
                customer.setLastName(list.get(5));
            }
        }else if (list.size() == 8){
            customer.setIpAddress(list.get(0));
            customer.setEmail(list.get(1));
            customer.setPhoneNumber(list.get(2));
            customer.setFeets(list.get(3));
            customer.setFloors(list.get(4));
            customer.setCity(list.get(5));
            customer.setLastName(list.get(6));
        }
        return customer;
    }
    private static void createObj(String[] str){
        if (str.length==7){
            createdObjectImp(obj7(str));
        }else if (str.length==8){
            createdObjectImp(obj8(str));
        }else if (str.length == 15){
            String[] newString7 = new String[8];
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

        if (!NumberValidImpl.isValid(customer.getPhoneNumber())){
            customersInvalidList.add(customer);
//            System.out.println(customer);
        }
        if (!customersNumber.containsKey(customer.getPhoneNumber()) && NumberValidImpl.isValid(customer.getPhoneNumber())){
            customersNumber.put(customer.getPhoneNumber(), customer);
        }
        if (!customers.containsKey(customer.getEmail())
                && EmailValidImpl.isValid(customer.getEmail())
                && NumberValidImpl.isValid(customer.getPhoneNumber())){
            customers.put(customer.getEmail(), customer);
        }else {
            t++;
//            System.out.println(customer);
        }
    }
    private static Customer obj7(String[] strings){
        o1++;
        Customer customer = new Customer();
        customer.setFirstName(strings[0]);
        if (IpAddressValidImpl.isValid(strings[strings.length-1])){
            customer.setCity(strings[1]);
            customer.setFloors(strings[2]);
            customer.setFeets(strings[3]);
            customer.setPhoneNumber(strings[4]);
            customer.setEmail(strings[5]);
            customer.setIpAddress(strings[6]);
//            System.out.println(customer);

        }else {
            customer.setLastName(strings[1]);
            customer.setCity(strings[2]);
            customer.setFloors(strings[3]);
            customer.setFeets(strings[4]);
            customer.setPhoneNumber(strings[5]);
            customer.setEmail(strings[6]);
        }
        t1++;
        return customer;
    }
    private static Customer obj8(String[] strings){
        o1++;
        Customer customer = new Customer();
        customer.setFirstName(strings[0]);
        customer.setLastName(strings[1]);
        customer.setCity(strings[2]);
        customer.setFloors(strings[3]);
        customer.setFeets(strings[4]);
        customer.setPhoneNumber(strings[5]);
        customer.setEmail(strings[6]);
        customer.setIpAddress(strings[7]);
        t2++;
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
