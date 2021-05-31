#include <stdio.h>
void fun(int n)
{
 if(n>0)
 {
 fun(n-1);
 printf("%d ",n);  //1,2,3

 }
}
int main() {
 int x=3;

 fun(x);
 return 0;
}