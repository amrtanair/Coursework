/*You are given an array of n integers,a0,a1...an-1 ,
 and a positive integer,k. Find and print the number of (i,j)
 pairs where i<j and ai+aj is evenly divisible by k.

https://www.hackerrank.com/challenges/divisible-sum-pairs
*/


#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int n;
    int k;
    int cnt=0;
    cin >> n >> k;
    vector<int> a(n);
    for(int i = 0;i < n;i++){
       cin >> a[i];
    } int i;
    for (i=0; i<n; i++)
        {
        for(int j=i; j<n; j++)
            if(i<j){
            { if((a[i]+a[j])%k==0)
                cnt++;
            }
        }
    }
    cout << cnt;
    return 0;
}
