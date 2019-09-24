package com.example.arraylistrecords;

public class RecordInfo {

    private String recordName;
    private String artist;

    public record(String recordName, String artist)
        this.recordName = recordName;
        this.artist = artist;

    public static RecordInfo createRecordinfo(String recordName, String artist) {
        return new RecordInfo(recordName, artist);
    }
}
