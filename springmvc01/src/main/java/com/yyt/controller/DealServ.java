package com.yyt.controller;

import com.yyt.entity.Deal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DealServ {
    @RequestMapping("/num1.do")
    public void getNum1(Deal deal) {
        String flog = deal.getFlog();
        double result = 0;
        switch (flog) {
            case "+":
                result = deal.getNum1() + deal.getNum2();
                break;
            case "-":
                result = deal.getNum1() - deal.getNum2();
                break;
            case "*":
                result = deal.getNum1() * deal.getNum2();
                break;
            case "/":
                result = deal.getNum1() / deal.getNum2();
                break;
            default:
                System.out.println("please input right key");

        }
        System.out.println("结果："+result);
    }
}
