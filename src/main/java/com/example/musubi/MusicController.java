package com.example.musubi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.jruby.embed.ScriptingContainer;
import org.jruby.embed.PathType;
import java.util.List;

@Controller
public class MusicController {
    // 1. 루비 환경을 클래스 변수로 선언해서 하나로 공유합니다.
    private final ScriptingContainer container;
    private final String rubyPath;

    public MusicController() {
        this.container = new ScriptingContainer();
        // 파일 경로를 미리 설정해둡니다.
        this.rubyPath = new java.io.File("src/main/resources/follow_logic.rb").getAbsolutePath();
        this.container.runScriptlet(PathType.ABSOLUTE, rubyPath);
    }

    @GetMapping("/")
    public String index(Model model) {
        // 이미 만들어진 container에서 목록만 가져옵니다.
        List<Music> songs = (List<Music>) container.callMethod(null, "get_music_list");
        model.addAttribute("songs", songs);
        return "index";
    }

    @PostMapping("/add")
    public String addMusic(@RequestParam String title,
                           @RequestParam String artist,
                           @RequestParam String youtubeId) {
        // 같은 container에 노래를 추가합니다. 그래야 데이터가 남습니다!
        container.callMethod(null, "add_music_to_list", title, artist, youtubeId);
        return "redirect:/";
    }
}