/*https://www.hackerrank.com/challenges/kangaroo*/

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
    int x1;
    int v1;
    int x2;
    int v2;
    int i;
    cin >> x1 >> v1 >> x2 >> v2;
    int cnt =0 ;
    for (i=2; i<10000; i++)
     {
        if ((x1 + (i-1)*v1)==(x2 + (i-1)*v2))
            {
            cout << "YES";
            cnt = cnt+1;
            break;
            }

      }
        if (cnt < 1)
            cout << "NO";


    return 0;
}
