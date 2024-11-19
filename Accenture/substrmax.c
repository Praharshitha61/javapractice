#include<stdio.h>
#include<string.h>
void main(){
    char s[100];
    int k;
    scanf("%s",s[100]);
    scanf("%d",&k);
    printf("%d",display(s,k));

}
int display(char s[],int k){
    int c=0;
    for(int i=0;i<k;i++){
        if(s[i]=='a'){
            c++;
        }
    }
    int mx=c;
    for(int i=0;i<(strlen(s)-k);i++){
        if(s[i]=='a') c--;
        if(s[i+k]=='a') c++;
        mx=max(mx,c);
    }
    return mx;
}