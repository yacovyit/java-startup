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
       | char	 | 2 bytes | 16 bits | \u0000  | Unicode character      | Stores a single character/letter or ASCII values                                   |
       |-----------------------------------------------------------------------------------------------------------------------------------------------------|

     */
    public static void main(String[] args) {
        //region int [-2,147,483,648 to 2,147,483,647]
        counterInt();
        //endregion

        //region short [-32,768 to 32,767]
        //endregion

        //region long [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
        //endregion

        //region byte [-128 to 127]
        ageByte();
        byteRange();
        //endregion
    }

    public static void counterInt() {
        int counter = 1;
        System.out.println("Counter value: " + counter);

        counter = counter + 1;
        System.out.println("Current Counter value: " + counter);
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
