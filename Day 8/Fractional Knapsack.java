// Fractional Knapsack - https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b){
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0;
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        double maxval = 0.0;
        
        // First Directly create a comparator class which will solve the given item class such that it is sorted based on their fraction that is maximum value and minimum weigth so this can be achieved by the fraction of value by weight
        itemComparator ic = new itemComparator();
        Arrays.sort(arr, ic);
        
        int curWeight = 0; 
        double finalvalue = 0.0; 
        
        for (int i = 0; i < n; i++) {
       
            if (curWeight + arr[i].weight <= W) {
                curWeight += arr[i].weight;
                finalvalue += arr[i].value;
            }
     
            else {
                int remain = W - curWeight;
                finalvalue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }
     
        return finalvalue;
        
    }
}
