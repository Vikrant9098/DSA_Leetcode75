class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        // Trim leading/trailing whitespaces from word1
        word1 = word1.trim();  

        // Trim leading/trailing whitespaces from word2
        word2 = word2.trim();  

        // Store the length of word1
        int n = word1.length();  

        // Store the length of word2
        int m = word2.length();  

        // Initialize index pointer for word1
        int i = 0;  

        // Initialize index pointer for word2
        int j = 0;  

        // Create a StringBuilder with an initial capacity of n + m for efficiency
        StringBuilder str = new StringBuilder(n + m);  

        // Loop until all characters from both strings are processed
        while(i < n || j < m)  
        {
            // If characters remain in word1, append the next character and increment index
            if(i < n ) str.append(word1.charAt(i++));  

            // If characters remain in word2, append the next character and increment index
            if(j < m ) str.append(word2.charAt(j++));  
        }

        // Return the merged result as a string
        return str.toString();  
    }
}
