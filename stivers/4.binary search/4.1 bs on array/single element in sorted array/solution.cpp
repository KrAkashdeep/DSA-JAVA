#include <vector>
#include <iostream>
int singleNonDuplicate(vector<int> &arr)
{
    // Write your code here
    int x = arr.size();
    int i = 0;
    if (x == 1)
        return arr[0];
    while (i < x)
    {
        if (arr[i] == arr[i + 1])
        {
            i = i + 2;
        }
        else
        {
            return arr[i];
        }
    }
}
int main()
{
}