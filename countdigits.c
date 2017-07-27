#include<stdio.h>
#include<conio.h>
void main()
{
    long long d;
    int count = 0;

    printf("Enter an integer: ");
    scanf("%d", &d);

    while(d != 0)
    {
        d /= 10;
        ++count;
    }

    printf("Number of digits: %d", count);
}
