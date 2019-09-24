package com.example.arraylistrecords;

import java.util.ArrayList;

public class Database {

    private ArrayList<RecordInfo> myRecords;

    public Database() {
        this.myRecords = new ArrayList<RecordInfo>();
    }

    public boolean addNewRecord(RecordInfo recordInfo) {
        if(findRecord(record.getname()) >=0) {
            System.out.println("Record is already saved");
            return false;
        }

        myRecords.add(recordInfo);
        return true;
    }

    private int findContact(RecordInfo recordInfo) {
        return this.myRecords.indexOf(recordInfo);
    }

    private int findContact(String recordName)
        for(int i=0; i<this.myRecords.size(); i++) {
            RecordInfo recordInfo = this.myRecords.get(i);
            if(recordInfo.getName().equals(recordName)) {
                return i;
            }
        }
        return -1;
    }
}
