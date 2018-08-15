package cn.wzl.studybootdo.dao;


import cn.wzl.studybootdo.model.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {

    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    UserInfo getUserInfoByUserName(String userName);

}