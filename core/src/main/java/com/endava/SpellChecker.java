package com.endava;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Spell checker constructor");
    }

    public void spellCheck() {
        System.out.println("spell check");
    }
}
