package com.example.wbdv20su1averywpxserverjava.models;

public class TaskId {
    private long userId;
    private long clubId;

    public int hashCode() {
        return (int)(userId + clubId);
    }

    public boolean equals(Object object) {
        if (object instanceof TaskId) {
            TaskId otherId = (TaskId) object;
            return (otherId.userId == this.userId) && (otherId.clubId == this.clubId);
        }
        return false;
    }

}
