class Solution {

    static boolean isMatching(char a, char b){
        return (a =='(' && b == ')' ||
                a=='[' && b ==']' ||
                a=='{' && b =='}');
    }



    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i< s.length(); i++){
            char x = s.charAt(i);

            if(x =='(' || x == '[' || x=='{'){
                stack.push(x);
            }
            else{
            if(stack.isEmpty()){
                return false;
            }else if(isMatching(stack.peek(),x) == false){
                return false;

            }else{
                stack.pop();
            }
            }
        }
        return (stack.isEmpty() == true);
        
    }
}