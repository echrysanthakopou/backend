package gr.pension.app.persistence;

import org.hibernate.dialect.MySQL55Dialect;

public class MySQL55DialectUtf8mb4 extends MySQL55Dialect {
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci";
    }
}