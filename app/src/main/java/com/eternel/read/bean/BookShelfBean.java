package com.eternel.read.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by etenel on 2018/1/20.
 */
@Entity
public class BookShelfBean {
    @Id(autoincrement = true)
    private Long id;
    private String bookName;
    private String bookImagePath;
    private String description;
    private String tags;
    private String writer;
    private String charSet;
    private String bookPath;
    private Integer currentChapter;
    private Integer currentPosition;
    private int processStatus;

    @Generated(hash = 643177978)
    public BookShelfBean(Long id, String bookName, String bookImagePath,
                         String description, String tags, String writer, String charSet,
                         String bookPath, Integer currentChapter, Integer currentPosition,
                         int processStatus) {
        this.id = id;
        this.bookName = bookName;
        this.bookImagePath = bookImagePath;
        this.description = description;
        this.tags = tags;
        this.writer = writer;
        this.charSet = charSet;
        this.bookPath = bookPath;
        this.currentChapter = currentChapter;
        this.currentPosition = currentPosition;
        this.processStatus = processStatus;
    }

    @Generated(hash = 1462228839)
    public BookShelfBean() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImagePath() {
        return this.bookImagePath;
    }

    public void setBookImagePath(String bookImagePath) {
        this.bookImagePath = bookImagePath;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCharSet() {
        return this.charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }

    public String getBookPath() {
        return this.bookPath;
    }

    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    public Integer getCurrentChapter() {
        return this.currentChapter;
    }

    public void setCurrentChapter(Integer currentChapter) {
        this.currentChapter = currentChapter;
    }

    public Integer getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getProcessStatus() {
        return this.processStatus;
    }

    public void setProcessStatus(int processStatus) {
        this.processStatus = processStatus;
    }

}
