package com.liuming.crm.utils;

import java.util.UUID;

/**
 * @Description 混合型ID生成工具
 * @ClassName IDUtils
 * @Author 鲸落
 * @date 2019.11.19 13:52
 */
public class IDUtils {
    /**
     * 不带"-"符号的32位长ID
     *
     * @return 不带"-"符号的32位长ID
     */
    public static String getID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
