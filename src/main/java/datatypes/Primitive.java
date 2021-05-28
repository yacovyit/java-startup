package datatypes;

/***
 * primitive data types
 * 1. byte
 * 2. short
 * 3. int
 * 4. long
 * 5. float
 * 6. double
 * 7. boolean
 * 8. char
 */
public class Primitive {

    /*
        from: https://www.w3schools.com/java/java_data_types.asp, https://docstore.mik.ua/orelly/java-ent/jnut/ch02_04.htm
        ------------------------------------------------------------------
       ------------------------------------------------------------------------------------------------------------------------------------------------------|
       |type     | bytes   | bits    | default | Contains               |range                                                                               |
       |---------|---------|------   |---------|---------------------   |------------------------------------------------------------------------------------|
       | byte	 | 1 byte  | 8 bit   | 0       | Signed integer         | Stores whole numbers from -128 to 127, 8 bits                                      |
       | short	 | 2 bytes | 16 bits | 0       | Signed integer         | Stores whole numbers from -32,768 to 32,767,                                       |
       | int	 | 4 bytes | 32 bits | 0       | Signed integer         | Stores whole numbers from -2,147,483,648 to 2,147,483,647                          |
       | long	 | 8 bytes | 64 bits | 0       | Signed integer         | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  |
       | float	 | 4 bytes | 32 bits | 0.0     | EEE 754 floating point | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits            |
       | double	 | 8 bytes | 64 bits | 0.0     | EEE 754 floating point | Stores fractional numbers. Sufficient for storing 15 decimal digits                |
       | boolean | 1 bit   | 1 bits  | false   | true/false             | Stores true or false values                                                        |
       | char	 | 2 bytes | 16 bits | \u0000  | Unicode character      | Stores a single character/letter or ASCII values,                                   |
       |-----------------------------------------------------------------------------------------------------------------------------------------------------|

        IEEE 754 64-bit double-precision
        [63,62.........52,51...............0]
        [SIGN[63], EXPONENT[63-52], FRACTION[51-0]]
        [1bit, 11bit, 52bit]

         IEEE 754 32-bit Single-Precision Floating-Point Numbers
        [31,30.......23,22.........0]
        [SIGN[31], EXPONENT[30-23], FRACTION[22-0]]
        [1bit, 8bit, 23bit]
     */
    public static void main(String[] args) {

        //region int [-2,147,483,648 to 2,147,483,647]
        counterInt();
        //endregion

        //region short [-32,768 to 32,767]
        powerShort((short) 1000);
        //endregion

        //region long [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
        int distanceInKiloMeter = 149600000;//distance from earth to the sun
        long distanceInMeters = toMeters(distanceInKiloMeter);
        System.out.println("distanceInKiloMeter = " + distanceInKiloMeter + ", distanceInMeters = " + distanceInMeters);
        //endregion

        //region float [3.40282347 x 10**38, 1.40239846 x 10**45]
        circleArea(3);
        //endregion

        //region double [1.7976931348623157 x 10**308, 4.9406564584124654 x 10**324]
        double squareRoot = sqrt(499);
        System.out.println("squareRoot = " + squareRoot + " (double)");
        System.out.println("squareRoot = " + (float)squareRoot + " (float)");
        //endregion

        //region byte [-128 to 127]
        ageByte();
        byteRange();
        //endregion

        //region boolean false/true
        isFlagIsTrue(true);
        isFlagIsTrue(false);
        //endregion

        //region char ['\u0000', '\uffff'] or from [0, 65,535]
        // https://unicode-table.com/en/#basic-latin
        //printAllChars();
        //endregion
    }

    public static void counterInt() {
        int counter = 1;
        System.out.println("Counter value: " + counter);

        counter = counter + 1;
        System.out.println("Current Counter value: " + counter);
    }

    public static void powerShort(short a) {
        System.out.println(a + " * " + a +" = "  +(a * a));
    }

    public static long toMeters(long distanceInKiloMeter) {
        long distanceInMeters  = distanceInKiloMeter * 1000l;
        return distanceInMeters;
    }

    public static void circleArea(float radius) {
        float area = (float) (Math.PI * Math.pow(radius,2));
        System.out.println("area = " + area);
    }

    public static double sqrt(double number) {
        return Math.sqrt(number);
    }
    public static void isFlagIsTrue(boolean flag) {
        System.out.println("flag = " + flag);
    }
    private static void printAllChars() {
        char c = 0;
        do {
            System.out.println((int)c + " = " + c);
            c++;
        } while (c <= '\uffff' && c!= 0);
    }

    public static void ageByte() {
        byte age = 42;
        System.out.println("My Age is: " + age);

        age = (byte) (age + 5);// (byte) casting
        System.out.println("My Age now is: " + age);

        age = 127;
        age = (byte) (age + 1);
        System.out.println("My Age now is: " + age);

        age = -128;
        age = (byte) (age - 1);
        System.out.println("My Age now is: " + age);


    }
    public static void byteRange() {
        int i, aux;
        byte b;

        for(i=0;i<256;i++) {
            b=(byte)i; // INTEGER TO BYTE TYPE CAST

            if(b<0) aux=256+b; else aux=b;

            System.out.println("Original INT:" + i + " Casted to byte:" + b +
                    " Converted to integer from byte: " + aux);
        }
    }



}
