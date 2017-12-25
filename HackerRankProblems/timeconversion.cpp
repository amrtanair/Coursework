#include <bits/stdc++.h>
#include<string>
#include<sstream>

using namespace std;
int main() {
    string s;
    cin>>s;
    int myint= stoi(s);
  //checking if the time is in PM  
    if(s[8]=='P')
    {
        if(myint<12)
        {
            myint=myint+12;
            //converting myint to string
            string str;
            ostringstream temp;
            temp<<myint;
            str=temp.str();
            //replacing old time
            s.replace(0,2,str);
        }
    }
    
    if(s[8]=='A')
    {
        if(myint==12)
        {   string str;
            str= "00";
            s.replace(0,2,str);
        }   
    } 
    
//popping the AM/PM
  for(int i=0; i<2;i++)
        {
            s.pop_back();
        }
//printing result    
cout<<s;
return 0;
}

#https://www.hackerrank.com/challenges/time-conversion/problem