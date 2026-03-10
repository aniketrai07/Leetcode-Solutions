class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length-1;
        int mx = arr[n];
        list.add(mx);
        for (int i =n-1;i>=0;i--){
            if(arr[i]>=mx){
                mx=arr[i];
                list.add(mx);
            }
            
        }
        Collections.reverse(list);
        return list;
    }
}
