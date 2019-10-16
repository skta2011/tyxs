package com.tuang.tyxs.project.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tuang.tyxs.framework.web.controller.BaseController;
import com.tuang.tyxs.framework.web.domain.AjaxResult;

/**
 * 首页 业务处理
 * 
 * @author panda
 */
@Controller("book")
public class BookController extends BaseController{

	/**
     * 
     */
    @PostMapping("/uploadbook")
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    public AjaxResult uploadbook(){
        return null;
    }
    
}
