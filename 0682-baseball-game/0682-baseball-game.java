class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        for(String a:operations){
            if(a.equals("C")){
                arr.remove(arr.size()-1);
            }else if(a.equals("+")){
                int element=arr.get(arr.size()-1)+arr.get(arr.size()-2);
                arr.add(element);
            }else if(a.equals("D")){
                int element=arr.get(arr.size()-1)*2;
                arr.add(element);
            }else{
                int element=Integer.parseInt(a);
                arr.add(element);
            }

        }
        for(int b:arr){
            sum+=b;
        }
        return sum;
    }
}