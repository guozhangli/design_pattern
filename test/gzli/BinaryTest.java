package gzli;

import org.junit.Test;

import java.util.Stack;

public class BinaryTest {

    //设置字符数组
    //可以添加任意不重复字符，提高能转换的进制的上限
    static char chs[] = new char[52];
    static {
        for(int i = 0; i < 10 ; i++) {
            chs[i] = (char)('0' + i);
        }
        for(int i = 10; i < chs.length; i++) {
            chs[i] = (char)('A' + (i - 10));
        }
    }

    /**
     * 转换方法
     * @param num       元数据字符串
     * @param fromRadix 元数据的进制类型
     * @param toRadix   目标进制类型
     * @return
     */
    static String transRadix(String num, int fromRadix, int toRadix) {
        long number = Long.valueOf(num, fromRadix);
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            sb.append(chs[(int)(number%toRadix)]);
            number = number / toRadix;
        }
        return sb.reverse().toString();

    }
    //测试
   @Test
   public void testTrans(){
        System.out.println(transRadix("1575302019579674626", 10, 52));

    }

    @Test
    public void testIndex(){
        String fileName="风险匹配函.pdf";
        String str=fileName.substring(0,fileName.indexOf("."));
        String str1=fileName.substring(fileName.lastIndexOf(".")+1);
        System.out.println(str);
        System.out.println(str1);
    }

    @Test
    public void testStr(){
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".length());
        String str=hex10ToAnly("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",1575302019579674626L,0);
        String str2=hex10To52(1575302019579674626L);
        System.out.println(str);
        System.out.println(str2);
    }

    public static String hex10ToAnly(String digths, long num,int length){
        StringBuffer str = new StringBuffer("");
        int base = digths.trim().length();
        if(0==num){
            str.append(digths.charAt(0));
        }else{
            Stack<Character> s = new Stack<Character>();
            while(num != 0){
                s.push(digths.charAt((int)(num%base)));
                num/=base;
            }
            while(!s.isEmpty()){
                str.append(s.pop());
            }
        }
        String prefix = "";
        String suffix = str.toString();
        if(length>suffix.length()){
            for(int count = 0;count<length-suffix.length();count++){
                prefix = prefix + digths.charAt(0);
            }
        }
        return prefix + suffix;
    }

    public static String hex10To52(long num){
        int length=0;
        String digths="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer str = new StringBuffer("");
        int base = digths.trim().length();
        if(0==num){
            str.append(digths.charAt(0));
        }else{
            Stack<Character> s = new Stack<Character>();
            while(num != 0){
                s.push(digths.charAt((int)(num%base)));
                num/=base;
            }
            while(!s.isEmpty()){
                str.append(s.pop());
            }
        }
        String prefix = "";
        String suffix = str.toString();
        if(length>suffix.length()){
            for(int count = 0;count<length-suffix.length();count++){
                prefix = prefix + digths.charAt(0);
            }
        }
        return prefix + suffix;
    }
}
