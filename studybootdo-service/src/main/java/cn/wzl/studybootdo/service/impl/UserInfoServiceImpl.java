package cn.wzl.studybootdo.service.impl;/**
 * Created by wenzailong on 2018/8/15.
 */

import cn.wzl.studybootdo.common.base.message.MessageInfo;
import cn.wzl.studybootdo.common.base.message.MessageStatus;
import cn.wzl.studybootdo.dao.UserInfoDao;
import cn.wzl.studybootdo.model.UserInfo;
import cn.wzl.studybootdo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author wenzailong
 * @create 2018-08-15 14:29
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService{
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public MessageInfo getUserInfoByUserName(String userName) {
        MessageInfo messageInfo = new MessageInfo();
        try {
            UserInfo userInfo = userInfoDao.getUserInfoByUserName(userName);
            messageInfo.setData(userInfo);
        } catch (Exception e) {
            logger.error("根据用户名查询用户信息出错："+e.getMessage(),e);
            messageInfo.setMessageStatus(MessageStatus.ERROR.getStatus(),"根据用户名查询用户信息出错："+e.getMessage());
        }
        return messageInfo;
    }
}
