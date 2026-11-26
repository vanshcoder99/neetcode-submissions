class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String s = strs.get(i);
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }


    public List<String> decode(String s) {
        List<String> strs = new ArrayList<>();
        int i = 0,n = s.length();
        while(i<n){
            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int num = Integer.parseInt(s.substring(i,j));
            strs.add(s.substring(j+1,num+j+1));
            i=(num+j+1);
        }
        return strs;
    }
}
