package com.kundan.day08may2026;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        try {
//            //get local host
//            InetAddress ip = InetAddress.getLocalHost();
//
//            System.out.println("Ip address: "+ ip.getHostAddress());
//
//            System.out.println("Host name: "+ip.getHostName());
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        try {
//            //get local host
//            InetAddress ip = InetAddress.getLocalHost();
//
//            //get network interface
//            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
//
//            //get MAC address in byte format
//            byte[] mac = network.getHardwareAddress();
//
//            //convert mac address byte to readable format
//            StringBuilder sb = new StringBuilder();
//
//            for(int i=0; i< mac.length; i++){
//                sb.append(String.format("%02X%s",
//                        mac[i],
//                        (i<mac.length-1)? "-":""));
//            }
//            //print details
//            System.out.println("Ip Address: "+ip.getHostAddress());
//            System.out.println("Mac Address: "+sb.toString());


            Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();

            while (networks.hasMoreElements()){
                NetworkInterface network = networks.nextElement();

                //skip invalid interface
                if(network.isLoopback()
                || !network.isUp()
                || network.isVirtual()){
                    continue;
                }

                byte[] mac = network.getHardwareAddress();

                if(mac == null){
                    continue;
                }

                StringBuilder sb = new StringBuilder();

                for(int i =0; i<mac.length;i++){
                    sb.append(String.format("%02X%s",
                            mac[i],
                            (i<mac.length-1)?"-":""));
                }

                System.out.println("Interface name: "+network.getDisplayName());
                System.out.println("MAC address: "+sb);

                //print ip address
                Enumeration<InetAddress> addresses = network.getInetAddresses();

                while (addresses.hasMoreElements()){
                    InetAddress addr = addresses.nextElement();

                    System.out.println("IP Address: "+addr.getHostAddress());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.print("program time: "+programTime+" ms");
    }
}
