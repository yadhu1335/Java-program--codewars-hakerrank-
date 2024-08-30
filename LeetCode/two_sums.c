#include<stdio.h>
#include<stdlib.h>
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* res = (int*)malloc(2*sizeof(int));
    for (int i = 0; i < numsSize-1; i++)
        for (int j = i+1; j < numsSize; j++)
            if (nums[i]+nums[j] == target){
                res[0]=i;
                res[1]=j;
                *returnSize = 2;
                return res;
            } 
    *returnSize = 0;
    return NULL; 
}

void main(){
    int nums[]   = {3,2,4};
    int target = 6;
    int numsSize = sizeof(nums) / sizeof(nums[0]);
    int returnSize;

    int *result = twoSum(nums, numsSize, target, &returnSize);
    printf("%d, %d",result[0],result[1]);


}