package com.liu.util;

import java.sql.ResultSet;

/**
 * Created by 86183 on 2020/2/20.
 */
public interface Rowmap<T> {
    T rowmapping(ResultSet rs);

}
