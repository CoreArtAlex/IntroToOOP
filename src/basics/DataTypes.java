package basics;

public class DataTypes {
    public static void main(String[] args) {
        // 8 Primitive Data types
        // - the value(itself) gets stored in memory.

        // To create a variable in Java
        // type variableName = value;
        byte a = 127;    // 8 bits integer (-128 to 127)
        short b = 1000;  // 16 bits integer (-2^15 to 2^15 - 1)
        int c = 232;     // 32 bits integer (-2^31 to 2^31 - 1)
        long d = 231001; // 64 bits integer (-2^63 to 2^63 - 1)

        char e = 'A';     // 8 bits - single character (single quote)
        boolean f = true; // true(1) or false(0)
        float g = 3.14f;  // 32 bits floating point numbers
        double h = 3.14;  // 64 bits (double-precision) floating point numbers

        System.out.println(h);
    }
}
