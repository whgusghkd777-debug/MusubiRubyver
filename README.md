<img width="50" height="50" alt="image" src="https://github.com/user-attachments/assets/9ef0b1bb-4045-4af9-aa39-0bea248b35c9" />


MuSuBi Music Center
Java Spring Boot と Ruby を融合させたハイブリッド音楽共有プラットフォーム

📌 プロジェクトのポイント
Java × Ruby の連携: JRuby を活用し、Java の堅牢性と Ruby の柔軟性を組み合わせた設計になっています。

シームレスな音楽共有: YouTube ID を入力するだけで、リアルタイムチャートに即座に反映されます。

安定した再生環境: YouTube IFrame API を利用し、ブラウザを問わず安定したプレイバックを実現しました。

🛠 技術スタック (Tech Stack)
Backend: Java 21 (Spring Boot 3.2.1), Ruby (JRuby 9.4.5.0)

Frontend: Thymeleaf, HTML5, CSS3

Build Tool: Gradle

📖 学習した内容 (Learning)
言語間ブリッジの構築: ScriptingContainer を通じて、Java から Ruby の関数を呼び出し、データをやり取りするプロセスを習得しました。

状態管理の最適化: サーバー内で Ruby の実行環境を共有(Singleton)することで、データの永続性とパフォーマンスを両立させる手法を学びました。

フロントエンドのデータバインディング: Thymeleaf の data-* 属性を使用し、バックエンドのデータを安全に JavaScript へ渡す実務的な方法を実践しました。

🚀 主な機能 (Features)
リアルタイムチャート: 現在共有されている曲のリストを確認し、すぐに再生できます。

ミュージックシェア: 好きな曲のタイトル、アーティスト名、YouTube ID を入力してチャートに追加できます。

インライン再生: ページを移動することなく、その場で音楽を視聴可能です。

💡 開発の背景
このプロジェクトは、「異なる言語環境を一つに統合する」という技術的挑戦から始まりました。Ruby で記述されたビジネスロジックを Java の Web フレームワーク上で動かすことで、開発の柔軟性を高める試みを行っています。
