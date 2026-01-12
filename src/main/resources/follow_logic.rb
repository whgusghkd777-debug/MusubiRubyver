# [데이터 저장소]
# 자바 패키지 경로를 포함한 클래스 이름(Java::ComExampleMusubi::Music)을 사용해야 합니다.
$music_list = [
  Java::ComExampleMusubi::Music.new("Ditto", "NewJeans", "pFEBCS3L83Y", "Chokebe"),
  Java::ComExampleMusubi::Music.new("Butter", "BTS", "WMweEpGlu_U", "User123"),
  Java::ComExampleMusubi::Music.new("Love Dive", "IVE", "Y8JFxS1HlDo", "Admin")
]

# [함수 1] 현재 노래 목록 전송
def get_music_list
  return $music_list
end

# [함수 2] 새 노래 정보 추가
def add_music_to_list(title, artist, yid)
  # 여기도 자바 클래스의 풀 경로를 적어줍니다.
  new_song = Java::ComExampleMusubi::Music.new(title, artist, yid, "Guest")
  $music_list.unshift(new_song)
  puts "Ruby: '#{title}' 추가 성공!"
end

# [함수 3] 팔로우 로직
def check_follow(user, artist)
  puts "Ruby: #{user}님이 #{artist}님을 팔로우함"
  return Java::ComExampleMusubi::FollowData.new(user, artist)
end