package com.example.arraylistrecords;

public class RecordInfo {

    private String recordName;
    private String artist;

    public RecordInfo(String recordName, String artist) {
        this.recordName = recordName;
        this.artist = artist;
    }

    public static RecordInfo createRecordinfo(String recordName, String artist) {
        return new RecordInfo(recordName, artist);
    }

    public String getRecordName() {
        return recordName;
    }

    public String getArtist() {
        return artist;
    }
}
