#include <iostream>

using namespace std;

void divide(int arr[],float n, float k)
{

    int s,i,j,h;
    s=n/k;
    j=0;

            for(i=0;i<n;i++)
               {
                 if(s==j)
                    {
                        cout<<endl;
                        j=0;}
                  cout<<arr[i]<<" ";

                 j++;
               }


}
int main()
{
    int a[]={1,2,3,4};
    float k;
    cout<<"Enter the value in which you want to divide:";
    cin>>k;
    divide(a, 4, k);
    return 0;
}