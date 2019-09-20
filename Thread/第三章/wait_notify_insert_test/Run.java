package com.fanke.Thread.第三章.wait_notify_insert_test;

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB backupB = new BackupB(dbTools);
            backupB.start();

            BackupA backupA = new BackupA(dbTools);
            backupA.start();
        }
    }
}
