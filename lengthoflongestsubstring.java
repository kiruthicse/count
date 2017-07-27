import java.io.*;
import java.util.*;
public class lengthoflongestsubstring
{
public int lengthOfLongestSubstring(String s) {
 
    int m = 0;
    int c = 0;
    int a[] = new int[26];
    Arrays.fill(a, -1);
 
    for(int i = 0; i < s.length(); ++i)
    {
 
        if(a[s.charAt(i) - 'a'] >= 0) {
            int from = a[s.charAt(i) - 'a'];
            c = i - a[s.charAt(i) - 'a'];
            a = new int[26];
            Arrays.fill(a, -1);
 
            for(int j = from + 1; j <= i; ++j)
                a[s.charAt(j) - 'a'] = j;
        }
        else {
            c++;
            a[s.charAt(i) - 'a'] = i;
        }
 
        m = Math.max(m, c);
    }
 
    return m;
 }
 }
