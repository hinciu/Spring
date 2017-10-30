package com.endava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TextEditor")
public class TextEditor {

    private SpellChecker spellChecker;

@Autowired
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Text editor constructor");
        this.spellChecker = spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.spellCheck();
    }
}
