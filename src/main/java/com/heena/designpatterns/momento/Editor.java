package com.heena.designpatterns.momento;

public class Editor {
    private final String content;
    private EditorState state;

    public Editor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
