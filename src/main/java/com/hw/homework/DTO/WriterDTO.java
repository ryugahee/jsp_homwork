package com.hw.homework.DTO;

import lombok.Data;

public class WriterDTO {
    private int writerIndex;
    private String writer;
    private String content;

    public int getWriterIndex() {
        return writerIndex;
    }

    public void setWriterIndex(int writerIndex) {
        this.writerIndex = writerIndex;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
