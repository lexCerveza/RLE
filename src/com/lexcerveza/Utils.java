package com.lexcerveza;

import java.util.Random;

/**
 * Created by Alex on 20.06.2015.
 */
public class Utils {

    /**
     * Just helper thing to test the algorithm
     * @return byte array
     */
    public static int[] generateRandomByteMessage(int length){
        int[] message = new int[length];
        Random random = new Random();
        for (int i = 0; i < message.length; i++){
            message[i] = random.nextInt(2);
        }
        return message;
    }
}
