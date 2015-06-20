package com.lexcerveza;

public class RLE {

    /**
     * Encodes array of integers to string using RLE algorithm
     * @param message - array with random integers
     * @return encoded message
     */
    public static String encode(int[] message){
        StringBuilder builder = new StringBuilder();
        int runner = 1;
        int value = message[0];

        for (int i = 0; i < message.length; i++) {
            while (((i + 1) != message.length) && (message[i + 1] == message[i])){
                runner++;
                i++;
            }
            builder.append(runner);
            builder.append(value);
            runner = 1;
            if((i + 1) < message.length) {
                value = message[i + 1];
            }
        }
        return builder.toString();
    }

    /**
     * Decodes the encodedMessage with same RLE
     * @param encodedMessage - encoded array of integers
     * @return source array of integers
     */
    public static int[] decode(String encodedMessage){
        int decodedMessageLength = 0;
        for (int i = 0; i < encodedMessage.length(); i += 2){
            decodedMessageLength += Integer.parseInt(String.valueOf(encodedMessage.charAt(i)));
        }

        int[] decodedMessage = new int[decodedMessageLength];
        int pointer = 0;

        for (int i = 0; i < encodedMessage.length(); i += 2){
            int count = Integer.parseInt(String.valueOf(encodedMessage.charAt(i)));
            int value = Integer.parseInt(String.valueOf(encodedMessage.charAt(i + 1)));
            for (int j = 0; j < count; j++){
                decodedMessage[pointer] = value;
                pointer++;
            }
        }

        return decodedMessage;
    }
}
