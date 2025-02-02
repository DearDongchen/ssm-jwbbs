package com.uj.ssm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uj.ssm.mapper.TopicMapper;
import com.uj.ssm.pojo.Topic;
@Service
public class TopicServicelmpl implements TopicService {
    @Autowired
    private TopicMapper topicMapper;
    public int TopicCreate(Topic topic){
        int state = topicMapper.TopicCreate(topic);
        System.out.println("yes sir to TopicCreate");
        return state;
    }
    public int TopicKeep(Topic topic){
        int state = topicMapper.TopicKeep(topic);
        System.out.println("yes sir to TopicKeep");
        return state;
    }
    //Topicname owner starttime lasttime comments topicid
    public Topic TopicRead(Topic topic){
        Topic ans = topicMapper.TopicRead(topic);
        return ans;
    }
    public List<Topic> TopicReadAll(){
        List<Topic> lst = topicMapper.TopicReadAll();
        return lst;
    }
    public String TopicGetName(int topicid){
        String topicname = topicMapper.TopicGetName(topicid);
        return topicname;
    }
    public int TopicDelete(int topicid){
        int state = topicMapper.TopicDelete(topicid);
        return state;
    }

}
