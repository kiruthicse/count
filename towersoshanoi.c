#include <stdio.h>
#include<conio.h>
void towers(int, char, char, char);
void main()
{
 int n;
 printf("Enter the number of disks : ");
 scanf("%d", &n);
 printf("The sequence of moves involved in the Tower of Hanoi are :\n");
 towers(num, 'A', 'C', 'B');
 return 0;
 }

void towers(int n, char frompeg, char topeg, char auxpeg)

{

    if (n == 1)

    {

        printf("\n Move disk 1 from peg %c to peg %c", frompeg, topeg);

        return;

    }

    towers(n - 1, frompeg, auxpeg, topeg);

    printf("\n Move disk %d from peg %c to peg %c", n, frompeg, topeg);

    towers(n - 1, auxpeg, topeg, frompeg);

}
