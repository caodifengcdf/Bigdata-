package flume.test.source;

public class aaaaaaa {
    public static void main(String[] args) {
        String execSql = "aa bb cc dd where id > 99";
        int currentIndex = 1111111;
        int length = execSql.toString().length();
        int cc = length - String.valueOf(currentIndex).length();

        String bb = execSql.toString().substring(0, length - String.valueOf(currentIndex).length()) + currentIndex;
        //
        System.out.println(String.valueOf(currentIndex).length());
        System.out.println(bb);
        System.out.println(cc);

    }
}
