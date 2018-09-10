package com.halous.parentsbase;

import com.halous.parentsbase.component.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EMailTest {

    @Autowired
    private MailServiceImpl mailService;

    @Test
    public void testSendMail(){
        mailService.sendSimpleMail("1124605504@qq.com","testOne","hello this is a simalple mail");
    }


    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("1124605504@qq.com","test simple mail",content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="E:\\apps\\nfs\\public\\20180806\\200000X11220180802145251\\insuranceAutorize200000X11220180802145251.pdf";
        mailService.sendAttachmentsMail("1124605504@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "F:\\Camera\\2014 11 13 红叶谷\\P41113-081104.jpg";

        mailService.sendInlineResourceMail("1124605504@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
