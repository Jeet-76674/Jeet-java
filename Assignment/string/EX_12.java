package string;
class PrintNumber {

    // Method to print an integer
    public void printn(int number)
    {
        System.out.println("Integer: " + number);
    }

    // Method to print a double
    public void printn(double number)
    {
        System.out.println("Double: " + number);
    }

    // Method to print a float
    public void printn(float number)
    {
        System.out.println("Float: " + number);
    }

    // Method to print a long
    public void printn(long number) 
    {
        System.out.println("Long: " + number);
    }

    // Method to print a short
    public void printn(short number) 
    {
        System.out.println("Short: " + number);
    }

    // Method to print a byte
    public void printn(byte number) 
    {
        System.out.println("Byte: " + number);
    }

    // Method to print a char
    public void printn(char character) 
    {
        System.out.println("Char: " + character);
    }

    // Method to print a boolean
    public void printn(boolean bool) 
    {
        System.out.println("Boolean: " + bool);
    }

}

public class EX_12 
{

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		
		pn.printn(10);          // Integer
		pn.printn(10.5);        // Double
		pn.printn(5.5f);        // Float
		pn.printn(100000L);     // Long
		pn.printn((short) 2);   // Short
		pn.printn((byte) 1);    // Byte
		pn.printn('A');         // Char
		pn.printn(true);        // Boolean
	}
}
