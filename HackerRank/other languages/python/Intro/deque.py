"""
Task
Perform append, pop, popleft and appendleft methods on an empty deque d.

Input Format
The first line contains an integer n, the number of operations.
The next n lines contains the space separated names of methods and their values.

Output Format
Print the space separated elements of deque d.

Sample Input
6
append 1
append 2
append 3
appendleft 4
pop
popleft

Sample Output
1 2

"""
#Program starts here
# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque
n=int(input())
d=deque()
while(n>0):
    inp=input().split()
    if(inp[0]=="append"):
        d.append(inp[1])
    if(inp[0]=="appendleft"):
        d.appendleft(inp[1])
    if(inp[0]=="pop"):
        d.pop()
    if(inp[0]=="popleft"):
        d.popleft()
    n=n-1
for values in d:
    print(values,end=" ")
