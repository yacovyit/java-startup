package datatypes;

import java.util.Arrays;

public class BitwiseOperators {
    /***
         0000 0000 | 0x00  |   0   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 0 * 2^2 + 0 * 2^1 + 0 * 2^0 = = 0
         0000 0001 | 0x01  |   1   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 0 * 2^2 + 0 * 2^1 + 1 * 2^0 = = 1
         0000 0010 | 0x02  |   2   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0 = = 2
         0000 0011 | 0x03  |   3   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 0 * 2^2 + 1 * 2^1 + 1 * 2^0 = = 3

         0000 0100 | 0x04  |   4   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 0 * 2^0 = = 4
         0000 0101 | 0x05  |   5   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = = 5
         0000 0110 | 0x06  |   6   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 1 * 2^2 + 1 * 2^1 + 0 * 2^0 = = 6
         0000 0111 | 0x07  |   7   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 0 * 2^3 + 1 * 2^2 + 1 * 2^1 + 1 * 2^0 = = 7

         0000 1000 | 0x08   |   8   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 0 * 2^2 + 0 * 2^1 + 0 * 2^0 = = 8
         0000 1001 | 0x09   |   9   | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 0 * 2^2 + 0 * 2^1 + 1 * 2^0 = = 9
         0000 1010 | 0x0a   |   10  | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0 = = 10
         0000 1011 | 0x0b   |   11  | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 1 * 2^0 = = 11

         0000 1100 | 0x0c   |   12  | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 0 * 2^0 = = 12
         0000 1101 | 0x0d   |   13  | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = = 13
         0000 1110 | 0x0e   |   14  | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 1 * 2^2 + 1 * 2^1 + 0 * 2^0 = = 14
         0000 1111 | 0x0f   |   15  | 0 * 2^7 + 0 * 2^6 + 0 * 2^5 + 0 * 2^4      + 1 * 2^3 + 1 * 2^2 + 1 * 2^1 + 1 * 2^0 = = 15
     */
    public static void main(String[] args) {
        byte b1 = 0b00000010; //2
        byte b2 = 0b00001000; //8

        bitwiseOR(b1, b2);
        bitwiseAND(b1, b2);
        bitwiseXOR(b1, b2);

        byte b = 4;

        //multiply
        leftShift(b);
        //divide
        rightShift(b);

        byte ten = 10;
        byte negativeTen = -10;

        zeroFillRightShift(ten);
        zeroFillRightShift(negativeTen);
    }

    public static void bitwiseOR(byte b1, byte b2) {
        /*
            0010
            1000
         or ----
            1010 = 10
         */
        byte bOr = (byte) (b1 | b2); // | (bitwise or)
        System.out.println(b1 + " | " + b2 + " = " + bOr);
    }

    public static void bitwiseAND(byte b1,byte b2) {
        /*
            0010
            1000
        and ----
            0000 = 0
         */
        byte bAnd = (byte) (b1 & b2); // | (bitwise and)
        System.out.println(b1 + " & " + b2 + " = " + bAnd);
    }

    public static void bitwiseXOR(byte b1,byte b2) {
        /*
            0010
            1000
        xor ----
            1010 = 0
         */
        byte bAnd = (byte) (b1 ^ b2); // | (bitwise xor)
        System.out.println(b1 + " ^ " + b2 + " = " + bAnd);
    }

    //https://www.tutorialspoint.com/Java-Bitwise-Operators#:~:text=Java%20defines%20several%20bitwise%20operators,short%2C%20char%2C%20and%20byte.&text=Binary%20OR%20Operator%20copies%20a,one%20operand%20but%20not%20both.
    //Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.

    public static void leftShift(byte b) {
        /*
            0010 << 1
            ---------
            0100
         */
        byte rightOperand = 1;
        byte bLeftShift = (byte) (b << rightOperand);
        System.out.println(b + " << " + rightOperand + " = " + bLeftShift);
    }

    //Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
    public static void rightShift(byte b) {
        /*
            0010 >> 1
            ---------
            0001
         */
        byte rightOperand = 1;
        byte brightShift = (byte) (b >> rightOperand);
        System.out.println(b + " >> " + rightOperand + " = " + brightShift);
    }
    //Shift right zero fill operator. The left operands value is moved right by the number of bits specified
    //by the right operand and shifted values are filled up with zeros.
    public static void zeroFillRightShift(byte b) {
        byte rightOperand = 2;
        System.out.println(b + " >>> " + rightOperand + " = " + (b >>> rightOperand));
    }
}
