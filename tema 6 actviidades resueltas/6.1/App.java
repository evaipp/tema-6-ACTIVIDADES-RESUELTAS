public class main {
    public static void main(String[] args) throws Exception {
       
            for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
                String xxxx = Integer.toHexString(codePoint);
                System.out.println("\\u" + xxxx + " : " + (char) codePoint);
    