package com.stu.stuback.utils;

import com.stu.stuback.vo.DataVO;

import java.util.List;

public class ResultVOUtil {
    public static DataVO success(List data, Integer count) {
        DataVO dataVO = new DataVO();
        dataVO.setData(data);
        dataVO.setCount(count);
        dataVO.setCode(0);
        dataVO.setMsg("成功");
        return dataVO;
    }

    public static DataVO success() {
        return success(null, null);
    }

    public static DataVO error(Integer code, String msg) {
        DataVO dataVO = new DataVO();
        dataVO.setCode(code);
        dataVO.setMsg(msg);
        return dataVO;
    }
}
