/*
Given five positive integers, find the minimum and maximum values that can be calculated
by summing exactly four of the five integers. Then print the respective minimum and
maximum values as a single line of two space-separated long integers.
https://www.hackerrank.com/challenges/mini-max-sum
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
    int i, j;
    int min, loc, temp;
//ss: Smallest sum possible, gs: greatest sum posssible, a[6] to input the numbers
     long int ss, gs;
    long long a[5];
// input the numbers in an array
    for (i=0; i<5; i++)
        {
        cin>> a[i];
    }
// sorting using selection sort
    for(i=0;i<4;i++)
    {
        min=a[i];
        loc=i;
        for(j=i+1;j<5;j++)
        {
            if(min>a[j])
            {
                min=a[j];
                loc=j;
            }
        }

        temp=a[i];
        a[i]=a[loc];
        a[loc]=temp;
    }
// add first four numbers
for(i=0; i<4; i++)
    {
    ss = ss + a[i];
}
//add last four numbers
for(i=1; i<5; i++)
    {
    gs = gs+ a[i];
}
cout<< ss<< " "<<gs;
return 0;
}
