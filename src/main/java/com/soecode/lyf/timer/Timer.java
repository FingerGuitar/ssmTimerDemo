package com.soecode.lyf.timer;

import com.soecode.lyf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 2021/7/9
 * Time: 14:38
 * auther: lixh
 * Description: No Description
 */
@Controller
public class Timer {

    @Autowired
    private BookService bookService;

    /**
     * 每天7,8点每隔5分钟刷新一次
     */
    @Scheduled(cron = "0/5 * * * * *")//5miao			//(0 0/20 * * * ?)每隔20分钟执行一次
    public void fangfaming(){
        System.err.println(System.currentTimeMillis()+"============>    testTimerDemo!");
        bookService.query();
    }
}
