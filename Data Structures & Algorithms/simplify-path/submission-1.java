class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> s = new Stack<>();
        for (String i : arr) {
            if (i.equals("..") && !s.isEmpty()) {
                s.pop();
            } else if (!i.equals(".") && !i.equals("..") && !i.equals("")) {
                s.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String i : s) {
            sb.append("/");
            sb.append(i);
        }

        if (sb.length() == 0) {
            return "/";
        } else {
            return sb.toString();
        }
    }
}
