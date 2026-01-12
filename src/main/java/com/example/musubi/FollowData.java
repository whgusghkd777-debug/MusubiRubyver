// FollowData.java
package com.example.musubi;
public class FollowData {
    private String follower; // 팔로우를 누른 사람
    private String artist;   // 팔로우 당한 가수

    public FollowData(String follower, String artist) {
        this.follower = follower;
        this.artist = artist;
    }

    // 데이터를 꺼내볼 수 있게 만드는 함수들 (Getter)
    public String getFollower() { return follower; }
    public String getArtist() { return artist; }
}