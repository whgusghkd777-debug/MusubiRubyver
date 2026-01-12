

## 🎧 MuSuBi Music Center - Ruby Experimental Ver.
<img width="300" alt="MuSuBi Interface" src="https://github.com/user-attachments/assets/9ef0b1bb-4045-4af9-aa39-0bea248b35c9" />


Java Spring Boot と Ruby を融合させたハイブリッド音楽共有プラットフォーム 本プロジェクトは、メインプロジェクト MuSuBiMusic のビジネスロジックを Ruby (JRuby) に移植した技術検証用スピンオフ・プロジェクトです。
※これは技術実験・学習用のサブプロジェクトです。
日本IT市場で人気の言語（Ruby, Java, Kotlin）を組み合わせられるか試してみました。
本番では使用しません。メインのプロジェクトは別になります。


📌 プロジェクトの意図と背景
すでに Java Spring Boot で構築された堅牢なシステムに対し、「特定のロジックをスクリプト言語（Ruby）に委ねることで、開発の柔軟性をどこまで高められるか」という技術的挑戦を目的に制作しました。

単なるコードのコピーではなく、**「ポリグロット（多言語）プログラミング」**の観点から、Java と Ruby という異なる特性を持つ言語の相互運用性を検証しています。

🛠 技術的なハイライト & コアロジック (Core Logic)
本プロジェクトの核心は、Java と Ruby の境界を越えたデータのやり取りにあります。

1. Java から Ruby メソッドを呼び出す (Bridge)
Java のコントローラー内で ScriptingContainer を利用し、Ruby 側に定義された関数を直接実行します。

```Java

// MusicController.java
@PostMapping("/add")
public String addMusic(@RequestParam String title, 
                       @RequestParam String artist, 
                       @RequestParam String youtubeId) {
    
    // Rubyの関数 'add_music_to_list' を呼び出し、引数を渡す
    // JavaからRubyのロジックを直接操作する核心部分です
    container.callMethod(null, "add_music_to_list", title, artist, youtubeId);
    
    return "redirect:/";
}
```
2. Ruby から Java クラスをインスタンス化する (Integration)
Ruby スクリプト内で Java のクラスパスを指定し、直接オブジェクトを生成・操作します。

```Ruby

# follow_logic.rb

def add_music_to_list(title, artist, yid)
  # Javaのクラス(Music)をRuby側でインスタンス化
  # 完全修飾名を使用してJavaオブジェクトを生成します
  new_song = Java::ComExampleMusubi::Music.new(title, artist, yid, "Guest")
  
  # Rubyのグローバル配列にJavaオブジェクトを格納
  $music_list.unshift(new_song)
  
  puts "Ruby: '#{title}' をリストに追加しました！"
end
```
📖 このプロジェクトを通じて得た知見 (Learning)
ハイブリッド環境の構築: Java の型安全な設計と、Ruby の直感的なロジック記述を一つのプロセス内で共存させる手法を学びました。

実行環境のライフサイクル管理: サーバー起動時に Ruby インスタンスを一度だけ生成して共有する（Singleton 的なアプローチ）ことで、Web 環境下でのデータ永続性を確保する方法を実践しました。

技術的柔軟性: 既存のシステムに対して「他の言語で実装したらどうなるか」という多角的な視点を持ち、プロトタイプを迅速に作成する能力を養いました。

🚀 主要機能 (Features)
リアルタイムチャート: 現在共有されている曲のリストを表示・管理します。

ミュージックシェア: YouTube ID を利用し、Ruby 側のロジックを通じて即座に楽曲をチャートに追加します.

インライン再生: YouTube IFrame 連携により、ページ遷移なしでその場での視聴が可能です.

🔗 関連プロジェクト
メインプロジェクト (Java Full Stack): https://github.com/whgusghkd777-debug/MuSuBiMusic
