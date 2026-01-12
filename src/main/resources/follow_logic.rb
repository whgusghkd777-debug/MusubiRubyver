# [データストア] Javaクラスを使用して初期データを定義
$music_list = [
  Java::ComExampleMusubi::Music.new("Ditto", "NewJeans", "pFEBCS3L83Y", "Chokebe"),
  Java::ComExampleMusubi::Music.new("Butter", "BTS", "WMweEpGlu_U", "User123"),
  Java::ComExampleMusubi::Music.new("Love Dive", "IVE", "Y8JFxS1HlDo", "Admin")
]

# [関数 1] 現在のリストを返却
def get_music_list
  return $music_list
end

# [関数 2] 新しい楽曲情報を追加
def add_music_to_list(title, artist, yid)
  new_song = Java::ComExampleMusubi::Music.new(title, artist, yid, "Guest")
  $music_list.unshift(new_song)
  puts "Ruby: '#{title}' がリストに追加されました。"
end

# [関数 3] フォロー機能 (設計用)
def check_follow(user, artist)
  return Java::ComExampleMusubi::FollowData.new(user, artist)
end
