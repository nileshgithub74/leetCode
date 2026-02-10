class Solution {
    public String simplifyPath(String path) {

        String[] str = path.split("/");
        Stack<String> st = new Stack<>();

        for(String s : str){
            if(s.equals(".") || s.equals("")){
                continue;
            }
            else if(s.equals("..")){
                 if(!st.isEmpty()){
                    st.pop();
                 }
            }
            else{
                st.push(s);
            }
        }

        StringBuilder result = new StringBuilder();
         for(String x : st){
            result.append("/").append(x);
         }

         if(result.length()==0){
            return "/";
         }
         return result.toString();
        
    }
}