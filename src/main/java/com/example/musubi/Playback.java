// Playback.java
package com.example.musubi;

public class Playback {
    public static void play(String user, Music music) {
        System.out.println("\n[▶ 재생 시작]");
        System.out.println("유저: " + user);
        System.out.println("곡명: " + music.getTitle() + " - " + music.getArtist());
        System.out.println("상태: 스트리밍 데이터를 성공적으로 불러왔습니다.");
    }
}