class Solution {
  public int findDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            // If the number is already in the set, we've found the duplicate.
            if (seen.contains(num)) {
                return num;
            }
            // Otherwise, add the number to the set and continue.
            seen.add(num);
        }
        return -1;
    }
}


// for(int j = i+1 ; j < n ; j++)
//         {
//             if(val == arr[j])
//             {
//                 count++;
//                 // System.out.println("COME NO "+count);
//                 return val;   
//             }
//         }