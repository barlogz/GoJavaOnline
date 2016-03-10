package com.goit.gojavaonline.module3.directory;

import java.util.List;

public class Directory {
    private List<ImageFile> imageFiles;

    public List<ImageFile> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<ImageFile> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public void setTextFiles(List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }

    private List<AudioFile> audioFiles;
    private List<TextFile> textFiles;
}
