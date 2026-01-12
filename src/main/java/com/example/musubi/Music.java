package com.example.musubi;

public class Music {
    private String title;
    private String artist;
    private String youtubeId; 
    private String sharedBy;  

    public Music(String title, String artist, String youtubeId, String sharedBy) {
        this.title = title;
        this.artist = artist;
        this.youtubeId = youtubeId;
        this.sharedBy = sharedBy;
    }

    // ビュー(Thymeleaf)で使用するゲッター
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getYoutubeId() { return youtubeId; }
    public String getSharedBy() { return sharedBy; }
}
