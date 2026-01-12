package com.example.musubi;

/**
 * 再生状態をコンソールに出力するクラスです。
 */
public class Playback {
    public static void play(String user, Music music) {
        System.out.println("\n[▶ 再生開始]");
        System.out.println("ユーザー: " + user);
        System.out.println("曲名: " + music.getTitle() + " - " + music.getArtist());
        System.out.println("状態: ストリーミングデータの読み込みに成功しました。");
    }
}
