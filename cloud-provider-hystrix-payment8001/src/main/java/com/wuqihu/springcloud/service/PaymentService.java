package com.wuqihu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池  "+Thread.currentThread().getName()+"  paymentInfo_OK,id:  "+id+"\t"+"😄";
    }

    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池  "+Thread.currentThread().getName()+"  paymentInfo_TimeOut,id:  "+id+"\t"+"耗时(秒)"+timeNumber;
    }
}
