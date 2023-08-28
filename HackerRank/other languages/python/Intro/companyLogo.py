"""
Link:https://www.hackerrank.com/challenges/most-commons/problem
Input Format

A single line of input containing the string s.
Output Format

Print the three most common characters along with their occurrence count each on a separate line.
Sort output in descending order of occurrence count.
If the occurrence count is the same, sort the characters in alphabetical order.

Sample Input 0
aabbbccde

Sample Output 0
b 3
a 2
c 2

Explanation 0
aabbccde
Here, b occurs 3 times. It is printed first.
Both a and c occur 2 times. So, a is printed in the second line and c in the third line because a comes before c in the alphabet.

Note: The string s has at least 3 distinct characters.
"""
#program starts here
import math
import os
import random
import re
import sys
from collections import Counter
if __name__ == '__main__':
    s = input()
frequency = Counter(S)     #Counter for getting the freequency
# Sort the frequency dictionary based on the criteria
sorted_frequency = sorted(frequency.items(), key=lambda item: (-item[1], item[0]))
# Take the top 3 items from the sorted_frequency list
top_items = sorted_frequency[:3]
for key, value in top_items:
    print(key, value)
