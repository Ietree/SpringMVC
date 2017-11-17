package com.ietree.springmvc.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;

// Convert接口中的两个泛型表示:
// 第一个表示源的类型
// 第二个表示宿的类型，即转换的目标类型
public class MyConverter implements Converter<String, Date>
{
    @Override
    public Date convert(String source)
    {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf = getDateFormat(source);
        try
        {
            return sdf.parse(source);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getDateFormat(String source)
    {
        SimpleDateFormat sdf = new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source))
        {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } 
        else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source))
        {
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        } 
        else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source))
        {
            sdf = new SimpleDateFormat("yyyyMMdd");
        }
        return sdf;
    }

}
