#include <bits/stdc++.h>

using namespace std;
int main() {
    int n, i, max=0, count=0;
    int a[100000];
    cin >> n;
    for(i=0; i<n;i++)
    {
        cin>> a[i];
    }
    for(i=0; i<n; i++)
    {
        if(a[i]> max)
        {
            max=a[i];
            count =0;
        }
        if(a[i]==max)
        {
            count = count+1;
        }
     }
    cout<< count;
   
}
#https://www.hackerrank.com/challenges/birthday-cake-candles/problem
