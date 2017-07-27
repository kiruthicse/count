#include <iostream>
#include <cstring>
using namespace std;

void main() {
   char a[] = "xyzxxmalayalamcabc";
   char* ptr = a;

   int loc = 0;
   int max = 0;
   for ( int i = 0; i < strlen(a) - 1; i++ ) {
       int left = i;
       int right = i;
       int count = 0;
       while ( left > 0 ) {
           if ( a[left--] != a[right++] ) {
               break;
           }
           count++;
       }
       if ( count > max ) {
          max = count;
          loc = i;
       }
   }

   cout << max << " @ " << location << endl;
   int start = loc - max;
   int end = loc + max;
   for ( int i = start + 1; i < end; i++ ) {
       cout << a[i];
   }
   return 0;
}
