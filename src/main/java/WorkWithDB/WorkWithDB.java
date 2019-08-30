package WorkWithDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class WorkWithDB {
    private ArrayList<MadeTree> arrayListOfItems = new ArrayList<MadeTree>();

    public ArrayList<MadeTree> connect() {

        try {
            String userName = "candidate";
            String password = "12345";
            String connectionUrl = "jdbc:mysql://localhost:3306/sys?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            try (
                    Connection connection = DriverManager.getConnection(connectionUrl, userName, password)) {
                System.out.println("did it!");
                ResultSet rst;
                String command = "Select * From items\n" +
                        "order by parentid;";
                Statement statement = connection.createStatement();
                rst = statement.executeQuery(command);
                while (rst.next()) {
                    MadeTree contentOfDB = new MadeTree(rst.getInt("itemid"), rst.getInt("parentid"),rst.getString("text"));
                    if(contentOfDB.getParentid()!=0){
                        for (MadeTree array: arrayListOfItems){
                            if (array.getItemid()==contentOfDB.getParentid()){
                                array.addElement(contentOfDB);
                            }
                        }
                    }
                    arrayListOfItems.add(contentOfDB);
                    System.out.println("added");
                }
                //return arrayListOfItems;

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            System.out.printf("error");
            ex.printStackTrace();
        }

        return arrayListOfItems;
    }


}
