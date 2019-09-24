package com.example.arraylistrecords;

import java.util.ArrayList;

public class Database {

    private ArrayList<RecordInfo> myRecords;

    public Database() {
        this.myRecords = new ArrayList<RecordInfo>();
    }

    public boolean addNewRecord(RecordInfo recordInfo) {
        if(findRecord(recordInfo.getRecordName()) >=0) {
            System.out.println("Record is already saved.");
            return false;
        }

        myRecords.add(recordInfo);
        return true;
    }

    private int findRecord(String recordName) {
        for(int i=0; i<this.myRecords.size(); i++) {
            RecordInfo recordInfo = this.myRecords.get(i);
            if(recordInfo.getRecordName().equals(recordName)) {
                return i;
            }
        }
        return -1;
    }

    public void printRecords() {
        System.out.println("Database of records:");
        for (int i = 0; i < this.myRecords.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myRecords.get(i).getRecordName() + " -> " +
                    this.myRecords.get(i).getArtist());
        }
    }

}
