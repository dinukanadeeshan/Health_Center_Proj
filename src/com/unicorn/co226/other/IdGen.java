/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicorn.co226.other;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.db.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nadeeshan
 */
public class IdGen {

    public static String getNextId(String table, String column, String prefix) throws ClassNotFoundException, SQLException {
        String query = "select " + column + " from " + table + " order by 1 desc limit 1 ";
        ResultSet resultSet = DBHandle.getData(DBConnection.getInstance().getConnection(), query);

        if (resultSet.next()) {
            String currentId = resultSet.getString(1);
            String newId = null;
            int index = 0;
            for (int i = currentId.length(); i >= 0; i--) {
                if (!Character.isDigit(currentId.charAt(i - 1))) {
                    index = i;
                    break;
                }
            }
            int newNum = Integer.parseInt(currentId.substring(index));
            newNum++;
            if (String.valueOf(newNum).length() == 1) {
                newId = prefix + "00000" + newNum;
            } else if (String.valueOf(newNum).length() == 2) {
                newId = prefix + "0000" + newNum;
            } else if (String.valueOf(newNum).length() == 3) {
                newId = prefix + "000" + newNum;
            } else if (String.valueOf(newNum).length() == 4) {
                newId = prefix + "00" + newNum;
            } else if (String.valueOf(newNum).length() == 5) {
                newId = prefix + "0" + newNum;
            } else {
                newId = prefix + newNum;
            }
            return newId;
        }

        return prefix + "000001";
    }

}
