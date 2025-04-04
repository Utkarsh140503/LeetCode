class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Stack<String> stack = new Stack<>();
        
        for (int x = 0; x < dirs.length; x++) {
            if (dirs[x].isEmpty() || dirs[x].equals(".")) {
                continue;
            }
            if (dirs[x].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dirs[x]);
            }
        }
        Stack<String> reverseStack = new Stack<>();
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }
        String res = "";
        while (!reverseStack.isEmpty()) {
            res += "/" + reverseStack.pop();
        }
        if(res.isEmpty())
        return "/";
        else
        return res;
    }
}