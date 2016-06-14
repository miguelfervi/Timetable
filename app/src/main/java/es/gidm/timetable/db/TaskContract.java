package es.gidm.timetable.db;

import android.provider.BaseColumns;

/**
 * Created by Miguel and JCristobal on 08/06/2016.
 */
public class TaskContract {
    public static final String DB_NAME = "es.gidm.Timetable.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
