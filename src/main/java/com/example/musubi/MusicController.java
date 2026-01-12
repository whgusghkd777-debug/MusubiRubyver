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
    // JRubyコンテナを共有し、データを維持
    private final ScriptingContainer container;
    private final String rubyPath;

    public MusicController() {
        this.container = new ScriptingContainer();
        this.rubyPath = new java.io.File("src/main/resources/follow_logic.rb").getAbsolutePath();
        this.container.runScriptlet(PathType.ABSOLUTE, rubyPath);
    }

    @GetMapping("/")
    public String index(Model model) {
        // Ruby側から楽曲リストを取得
        List<Music> songs = (List<Music>) container.callMethod(null, "get_music_list");
        model.addAttribute("songs", songs);
        return "index";
    }

    @PostMapping("/add")
    public String addMusic(@RequestParam String title,
                           @RequestParam String artist,
                           @RequestParam String youtubeId) {
        // Ruby側のロジックを呼び出し
        container.callMethod(null, "add_music_to_list", title, artist, youtubeId);
        return "redirect:/";
    }
}
