/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aleksa
 */
public interface DomainObject {

    String getAtrValue();

    String setAtrValue();

    String getClassName();

    String getWhereCondition();

    String getNameByColumn(int column);

    DomainObject getNewRecord(ResultSet rs) throws SQLException;

}
