#include<stdio.h>
void main(){
    int i,a[100],sum=0,k,n;
    scanf("%d",&n);
    for(i=0;i<=n;i++){
        scanf("%d",&a[i]);
        sum=sum+a[i];
    }
    k=(n(n+1)/2)-sum;
    printf("%d",k);
}