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

#https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

using namespace std;
int main(){
    int n, i;
    int k, a[100000];
    cin >> n >> k;
    for(int i=0; i<n; i++)
    {
      cin>> a[i];
    }
    for(i=k; i<n; i++)
    {
        cout<< a[i] <<" ";
    }
    for(i=0; i<k; i++)
    {
        cout<< a[i]<< " ";
    }
    return 0;
}