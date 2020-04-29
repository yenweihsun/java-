
package day08_exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class DerbySelect {
    public static void main(String[] args) {
        
        // 資料庫資料 可在 Services -> jdbc:derby://localhost:1527/MyDB [app on APP] 右鍵 Properties
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/MyDB";
        String username = "app";
        String password = "app";
        
        //SQL語法
        String sql = "SELECT product_id, purchase_cost, quantity_on_hand, description FROM APP.PRODUCT";
        // try catch 
        //建立連線
        try (
            // import java.sql語法
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stmt = conn.createStatement();
            //返回一個結果
            ResultSet rs = stmt.executeQuery(sql);){
        
            //抓標題出來
            ResultSetMetaData md =rs.getMetaData();
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.print(md.getColumnName(i) + "\t");
            }
                System.out.println("\n----------------------------");
            // 列出資料  定義資料欄位,把名稱欄位的資料撈出來
                while (rs.next()) {      
                    //以下都是sql欄位
                int product_id = rs.getInt("product_id");
                double purchase_cost = rs.getDouble("purchase_cost");
                int quantity_on_hand = rs.getInt("quantity_on_hand");
                String description = rs.getString("description");
                    System.out.printf("%d\t %.2f\t %d\t %s\n ", product_id,purchase_cost,quantity_on_hand,description);                
            }
        
        } catch (Exception e) {
            System.out.println("錯誤," +e);
        }
        
    }
}
