package com.lexcerveza;

public class Main {

    public static void main(String[] args) {
        int[] message = Utils.generateRandomByteMessage(13);
        System.out.println("Message : ");
        for (int i : message){
            System.out.print(i);
        }
        System.out.println();

        String encodedMessage = RLE.encode(message);
        System.out.println("Encoded message : ");
        System.out.println(encodedMessage);

        System.out.println("Decoded message : ");
        int[] decodedMessage = RLE.decode(encodedMessage);
        for (int i : decodedMessage){
            System.out.print(i);
        }
    }
}
