package com.example.mytest.dao.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("music_info")
public class MusicInfo {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 歌手名
     */
    @TableField(value = "singer_name")
    private String singerName;

    /**
     * 歌曲大小
     */
    @TableField(value = "music_size")
    private String musicSize;

    /**
     * 歌曲名
     */
    @TableField(value = "music_name")
    private String musicName;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取歌手名
     *
     * @return singer_name - 歌手名
     */
    public String getSingerName() {
        return singerName;
    }

    /**
     * 设置歌手名
     *
     * @param singerName 歌手名
     */
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    /**
     * 获取歌曲大小
     *
     * @return music_size - 歌曲大小
     */
    public String getMusicSize() {
        return musicSize;
    }

    /**
     * 设置歌曲大小
     *
     * @param musicSize 歌曲大小
     */
    public void setMusicSize(String musicSize) {
        this.musicSize = musicSize;
    }

    /**
     * 获取歌曲名
     *
     * @return music_name - 歌曲名
     */
    public String getMusicName() {
        return musicName;
    }

    /**
     * 设置歌曲名
     *
     * @param musicName 歌曲名
     */
    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }
}