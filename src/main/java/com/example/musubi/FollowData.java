// FollowData.java
 // フォロー情報を保存するデータクラスです。
// 【将来的な拡張用】 アーティストフォロー機能を実装する際に使用するデータ構造です。

package com.example.musubi;
public class FollowData {
    private String follower; 
    private String artist;   
// [コンストラクタ] データを新しく作成する時に使います
    public FollowData(String follower, String artist) {
        this.follower = follower;
        this.artist = artist;
    }

// [ゲッター] 保存されたデータを取り出すための関数です
    public String getFollower() { return follower; }
    public String getArtist() { return artist; }
}
