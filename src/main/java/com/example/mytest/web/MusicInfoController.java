package com.example.mytest.web;

import com.example.mytest.dao.domain.MusicInfo;
import com.example.mytest.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/music")
public class MusicInfoController {

    @Autowired
    private MusicInfoService musicInfoService;

    @RequestMapping("/showMusic")
    public List<MusicInfo> getMusicInfo() {
        List<MusicInfo> musicInfo1 = musicInfoService.getMusicInfo();
        return musicInfo1;
    }

}
