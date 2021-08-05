package com.chen.qr_code.controller;

import com.chen.qr_code.utils.QRCodeUtil;
import com.google.zxing.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 二维码调用前端控制器
 */
@RequestMapping("/Qrcode")
@RestController
public class QRController {

    /**
     * 生成二维码
     */
    @GetMapping
    public void productcode() {
        QRCodeUtil.zxingCodeCreate("https://www.csdn.net/",
                "C:/Users/acer/Desktop/QR/",500,"C:/Users/acer/Desktop/QR/1.jpg");
    }


    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public void analysiscode() {
        Result result = QRCodeUtil.zxingCodeAnalyze("C:/Users/acer/Desktop/QR/101.jpg");
        System.err.println("二维码解析内容："+result.toString());
    }

}
