package Strings;

public class $3Longest_common_prefix {

    private static String fn(String [] str){
        if(str==null|| str.length==0) return "";

        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        String [] str={"flower","flow","flight"};
        String res=fn(str);
        System.out.println(res);

    }

}
