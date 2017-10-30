package com.endava.configuration;

import com.endava.SpellChecker;
import com.endava.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.endava")
@Configuration
public class AppConfig {

    @Bean("spellChecker")
    public SpellChecker getSpelChecker() {
        return new SpellChecker();
    }

    @Bean(name = "textEditor")
    public TextEditor getTexEditor() {
        return new TextEditor(getSpelChecker());


    }
}
