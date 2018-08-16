package cn.wzl.studybootdo.controller;/**
 * Created by wenzailong on 2018/8/15.
 */

import cn.wzl.studybootdo.common.base.message.MessageInfo;
import cn.wzl.studybootdo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wenzailong
 * @create 2018-08-15 16:56
 **/
@RestController
@RequestMapping("UserInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoServie;

    @GetMapping("getUserInfo")
    @ResponseBody
    public MessageInfo getUserInfoByUserName(String userName){
        return userInfoServie.getUserInfoByUserName(userName);
    }
}
