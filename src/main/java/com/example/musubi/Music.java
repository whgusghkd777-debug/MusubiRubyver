package com.example.musubi;

public class Music {
    private String title;
    private String artist;
    private String youtubeId; // 유튜브 영상 고유 번호
    private String sharedBy;  // 공유자 이름

    public Music(String title, String artist, String youtubeId, String sharedBy) {
        this.title = title;
        this.artist = artist;
        this.youtubeId = youtubeId;
        this.sharedBy = sharedBy;
    }

    // 화면(HTML)에서 꺼내 쓸 수 있도록 Getter 추가
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getYoutubeId() { return youtubeId; }
    public String getSharedBy() { return sharedBy; }
}