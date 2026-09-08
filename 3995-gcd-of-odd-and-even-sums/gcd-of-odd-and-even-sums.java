class Solution {
    public int gcdOfOddEvenSums(int n) {
        int [] arr1 = new int [n];
        int sumOdd = 0, sumEven = 0;
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = 2*i + 1;
            sumOdd += arr1[i];
        }
        int [] arr2 = new int [n];
        for(int j = 1; j < arr2.length; j++){
            arr2[j] = 2*j ;
            sumEven += arr2[j];
        }
        while (sumEven != 0) {
        int temp = sumEven;
        sumEven = sumOdd % sumEven;
        sumOdd = temp;
        }
    return Math.abs(sumOdd);

    }
}