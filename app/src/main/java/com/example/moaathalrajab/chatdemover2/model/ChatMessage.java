package com.example.moaathalrajab.chatdemover2.model;

/**
 * Created by m_alrajab on 4/3/17.
 */

public class ChatMessage {
    private String msg;
    private String username;
    private String uri;
    private String msgTime;
    private int likeCount;

    public ChatMessage(){}

    public ChatMessage(String msg, String username, String time, String photoUri) {
        this.msg = msg;
        this.username = username;
        this.msgTime=time;
        this.uri=photoUri;
    }

    public ChatMessage(String msg, String username, String time, String photoUri, int lk) {
        this.msg = msg;
        this.username = username;
        this.msgTime=time;
        this.uri=photoUri;
        this.likeCount=lk;
    }

    public String getMsg() {
        return msg;
    }
    public int getLikes(){return likeCount;}

    public String getUsername() {
        return username;
    }
    public String getUri() {
        return uri;
    }

    public String getMsgTime() {
        return msgTime;
    }


}
