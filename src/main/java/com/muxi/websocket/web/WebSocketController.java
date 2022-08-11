package com.muxi.websocket.web;

import com.muxi.websocket.service.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * websocket controller
 *
 * @author jjl
 * @date 2022/8/11
 */
@Controller
@RequestMapping("/socket")
public class WebSocketController {

    @Value("${socket.pwd}")
    public String password;

    @Autowired
    private WebSocketServer webSocketServer;

    /**
     * 手机客户端请求接口
     *
     * @param id  发生异常的设备ID
     * @param pwd 密码（实际开发记得加密）
     * @throws IOException
     */
    @PostMapping(value = "/notice")
    @ResponseBody
    public void notice(String id, String pwd) throws IOException {
        // 默认值
        if ("".equals(id) || id == null) {
            id = "1";
            pwd = password;
        }
        // 密码校验一致（这里举例，实际开发还要有个密码加密的校验的），则进行群发
        if (password.equals(pwd)) {
            webSocketServer.broadCastInfo(id);
        }
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}