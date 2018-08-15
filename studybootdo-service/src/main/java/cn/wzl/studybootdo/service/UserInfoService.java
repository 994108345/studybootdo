package cn.wzl.studybootdo.service;/**
 * Created by wenzailong on 2018/8/15.
 */

import cn.wzl.studybootdo.common.base.message.MessageInfo;
import cn.wzl.studybootdo.model.UserInfo;

/**
 * @author wenzailong
 * @create 2018-08-15 14:32
 **/
public interface UserInfoService {
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    MessageInfo getUserInfoByUserName(String userName);
}
