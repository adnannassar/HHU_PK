package Datentypen;

public class Datentypen {
    // ganze zahlen
    byte x = 10; // 1 byte -->  -128 to 127
    short y = 100; // 2 byte --> -32768 to 32767
    int z = 1000; // 4 byte --> -2147483648 to 2147483647
    long a = 10000; // 8 byte --> -9223372036854775808 to 9223372036854775807

    // kommazahlen
    float b = 10.5f; // 4 byte --> 6 to 7 decimal digits
    double c = 10.5; // 8 byte --> 15 decimal digits


    // logic
    boolean istBestanden = true; // 1 bit --> true or false

    // texts
    // chars
    char d = 'a'; // 2 byte

    // strings
    String word = "Hallo "; // 10 bytes! ( 5 chars * 2byts = 10bytes)
}
