class Solution 
{
    // Main function to find the greatest common divisor string of str1 and str2
    public String gcdOfStrings(String str1, String str2) 
    {
        // Check if concatenating str1+str2 is equal to str2+str1
        // If not equal, it means no common repeating string can form both strings
        if (!(str1 + str2).equals(str2 + str1)) 
        {
            return "";  // Return empty string as no gcd string exists
        }

        // Find the gcd of lengths of str1 and str2
        int gcdlength = gcd(str1.length(), str2.length());

        // Return substring of str1 from index 0 to gcdlength,
        // This substring is the largest common string divisor
        return str1.substring(0, gcdlength);
    }

    // Helper method to calculate gcd of two integers a and b using Euclidean algorithm
    private int gcd(int a, int b) 
    {
        // Repeat until remainder b becomes zero
        while (b != 0) 
        {
            int temp = b;   // Store current value of b in temp
            b = a % b;      // Update b to the remainder when a is divided by b
            a = temp;       // Assign old value of b to a
        }

        // When b is zero, a contains the gcd
        return a;
    }
}
