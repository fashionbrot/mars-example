package com.github.fashionbrot.funds.consts;


import com.github.fashionbrot.funds.enums.RespCode;
import com.github.fashionbrot.funds.vo.RespVo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MarsConst {

    public final static String ENCODE_UTF8="UTF-8";

    public final static String AUTH_KEY = "Authorization";

    public final static String ROLE_NAME = "qazxsw";

    public final static String REAL_NAME = "edcvfr";

    public  static final int SUCCESS = RespCode.SUCCESS.getCode();

    public  static final int FAILED = RespCode.FAIL.getCode();

    public final static RespVo RESP_VO = RespVo.builder().code(SUCCESS).msg("成功").build();

    public final static String PROPERTY_PREFIX = "_prefix";

    public final static String TABLE_PREFIX = "mars_config_";

    public final static Set<String> propertySet = new HashSet<>(Arrays.asList("status","startDate","endDate"
            ,"asc","desc","priority","id","propertyName","property_name","propertyKey"
            ,"property_key","app_name","appName","createDate","create_date"));


}
