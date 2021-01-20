package com.example.wemeet;

import java.util.ArrayList;

public class GroupData {
    public String GroupName;
    public ArrayList<String> Members;


    public GroupData(String groupName, ArrayList<String> Members) {
        GroupName = groupName;
        this.Members=Members;

    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public ArrayList<String> getMembers() {
        return Members;
    }

    public String getMember(int position){return Members.get(position);}
    public void setMembers( ArrayList<String> members) {
        Members = members;
    }

}
