package com.codegym.model.bean;

public class Mail {
    private String[] language;
    private int[] size;
    private boolean spamFillter;
    private String signature;

    public Mail() {
    }

    public Mail(String[] language, int[] size, boolean spamFillter, String signature) {
        this.language = language;
        this.size = size;
        this.spamFillter = spamFillter;
        this.signature = signature;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public boolean isSpamFillter() {
        return spamFillter;
    }

    public void setSpamFillter(boolean spamFillter) {
        this.spamFillter = spamFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
