"""
Link:https://www.hackerrank.com/challenges/piling-up/problem
There is a horizontal row of n cubes. The length of each cube is given. You need to create a new vertical pile of cubes. The new pile 
should follow these directions: if cube[i] is on top of cube[j] then sidelength[j]>=sidelength[i].
When stacking the cubes, you can only pick up either the leftmost or the rightmost cube each time. Print Yes if it is possible to stack
the cubes. Otherwise, print No.

Example
block=[1,2,3,8,7]
Result: No

After choosing the rightmost element, , choose the leftmost element, . After than, the choices are  and . These are both larger than the top block of size .


Result: Yes

Choose blocks from right to left in order to successfully stack the blocks.

Input Format

The first line contains a single integer , the number of test cases.
For each test case, there are  lines.
The first line of each test case contains , the number of cubes.
The second line contains  space separated integers, denoting the sideLengths of each cube in that order.

Constraints




Output Format

For each test case, output a single line containing either Yes or No.

Sample Input

STDIN        Function
-----        --------
2            T = 2
6            blocks[] size n = 6
4 3 2 1 3 4  blocks = [4, 3, 2, 1, 3, 4]
3            blocks[] size n = 3
1 3 2        blocks = [1, 3, 2]
Sample Output

Yes
No
Explanation

In the first test case, pick in this order: left - , right - , left - , right - , left - , right - .
In the second test case, no order gives an appropriate arrangement of vertical cubes.  will always come after either  or .
"""
#program starts here
from collections import deque

def maain(d):
    while d:
        larger = None
        if d[-1] > d[0]:
            larger = d.pop()
        else:
            larger = d.popleft()
        if not d:    #Checking if it empty
            print("Yes")
            return
        if d and (d[-1] > larger or d[0] > larger):#This means that if the deque is not empty and the element are larger than var larger then it prints No
            print("No")
            return

times = int(input())  # times=2
while times > 0:
    n = int(input())  # n=6
    inp = input().split()  # Input as space-separated string
    blocks = deque(map(int, inp))  # Convert the input to a list of integers and create a deque
    maain(blocks)
    times = times - 1
