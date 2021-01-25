package hive.test;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class HiveUDF extends UDF {
    /*hive.test.jdbc.HiveUDF
    自定义UDF函数 小写转为大写
     */
    Text text = new Text();
    public Text evaluate(String param){
        if(null != param && !param.equals("")){
            String s = param.toUpperCase();
            text.set(s);
            return text;
        }

        return null;
    }
}