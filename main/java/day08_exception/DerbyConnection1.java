
package day08_exception;

//測試連線

import java.sql.Connection;
import java.sql.DriverManager;

public class DerbyConnection1 {
    public static void main(String[] args) {
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/MyDB";
        String username = "app";
        String password = "app";
        
        Connection conn = null;
        
        try {
            Class.forName(driverClass);
            conn =DriverManager.getConnection(url,username,password);
            // conn.isClosed() 指目前連線狀態
            System.out.println("連線是否關閉?" + conn.isClosed());
        } catch (Exception e) {
            System.out.println("錯誤1" + e);            
        }finally{
            if (conn != null) {
                try {
                    //conn.close(); 關閉連線
                    conn.close();
                } catch (Exception e) {
                    System.out.println("錯誤2" + e);
                }
            }
        }
        //---------------------------------------------
        try {
            System.out.println("連線是否關閉?" + conn.isClosed());
        } catch (Exception e) {
            System.out.println("錯誤3" + e);
        }
        
    }
}
