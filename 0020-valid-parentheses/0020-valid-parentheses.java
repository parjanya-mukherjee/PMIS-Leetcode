class Solution {
    public boolean isValid(String s) {
        char arr[] = new char[s.length()];
        char arr2[] = new char[s.length()];
        arr = s.toCharArray();
        int top = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='('||arr[i]=='{'||arr[i]=='['){
                arr2[++top]=arr[i];
                
            }
            else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if(top==-1){
                    return false;
                }
                else if(arr[i] == ')' && arr2[top] == '('||
                        arr[i] == '}' && arr2[top] == '{'||
                        arr[i] == ']' && arr2[top] == '['){
                            top--;
                        }
                else{
                    return false;
                }

            }
        }
        return top==-1;
    }
}