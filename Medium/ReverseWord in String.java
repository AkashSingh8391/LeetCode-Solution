/**********Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
******/



class Solution {
private static void reverse(char[] arr, int start, int end){
    char temp;
    while(start<end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}

    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        char[] arr=s.toCharArray();
        int n=arr.length;

        reverse(arr,0,n-1);

        int start=0;
        for(int end=0;end<=n;end++){
            if(end==n || arr[end]==' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        s=String.valueOf(arr);
        return s;
    }
}