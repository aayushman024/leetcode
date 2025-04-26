public class MergeStrAlt {
    public String mergeAlternates(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i  = 0, j = 0;

        while(i < str1.length() || j < str2.length()){
            if(i < str1.length())
                sb.append(i);
            if(j < str2.length())
                sb.append(j);
        }
        return sb.toString();
    }
}
