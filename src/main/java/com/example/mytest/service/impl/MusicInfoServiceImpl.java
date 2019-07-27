package com.example.mytest.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.mytest.dao.domain.MusicInfo;
import com.example.mytest.dao.mapper.MusicInfoMapper;
import com.example.mytest.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo() {
        // 查询所有的数据

        return musicInfoMapper.selectList(new EntityWrapper<MusicInfo>());

    }
}
