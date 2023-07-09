package com.lmeng.yupao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @learner Lmeng
 * @date 2023/7/8
 */
@Data
public class PageRequest implements Serializable {
    private static final long serialVersionUID = -4162304142710323660L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;
}
