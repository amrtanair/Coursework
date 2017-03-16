/*
Given a square matrix of size NxN , calculate the absolute difference between the sums of its diagonals.
https://www.hackerrank.com/challenges/diagonal-difference
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n, pd, sd;
    int diff=0;
    cin >> n;
    vector< vector<int> > a(n,vector<int>(n));
    for(int i = 0; i < n; i++){
       for(int j = 0; j < n; j++){
          cin >> a[i][j];
       }
    }
    for(int i = 0; i < n; i++){
       for(int j = 0; j < n; j++){
          if(i==j)
              {
              pd = pd+ a[i][j];
          }
           if((i+j)==n-1)
               {
               sd = sd + a[i][j];
           }
       }
    }

    diff = (pd-sd);

    int ans = abs(diff);
    cout << ans;
    return 0;
}
