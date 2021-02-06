#include <stdio.h>
void fun(int n)
{
 if(n>0)
 {
 printf("%d ",n);   //3,2,1
 fun(n-1);

 }
}
int main() {
 int x=3;
 
 fun(x);
 return 0;
}