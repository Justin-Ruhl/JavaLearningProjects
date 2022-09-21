package com.company;

public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds){
        boolean isValid = false;
        int hours = -1;
        String formattedTime = "Invalid Value";
        String formattedHours = "XXh ";
        String formattedMinutes = "YYm ";
        String formattedSeconds = "ZZs";

        if (minutes >= 0 && seconds <= 59 && seconds >= 0){
            isValid = true;
        }
        if (isValid){
            int totalSecs = minutes * 60 + seconds;
            hours = totalSecs / 3600;
            totalSecs = totalSecs % 3600;
            minutes = totalSecs / 60;
            totalSecs = totalSecs % 60;
            seconds = totalSecs;
        }
        if (hours < 10){
            formattedHours = "0" + hours + "h ";
        } else {
            formattedHours = hours + "h ";
        }
        if (minutes < 10){
            formattedMinutes = "0" + minutes + "m ";
        } else {
            formattedMinutes = minutes + "m ";
        }
        if (seconds < 10){
            formattedSeconds = "0" + seconds + "s";
        } else {
            formattedSeconds = seconds + "s";
        }
        if (isValid){
            formattedTime = formattedHours + formattedMinutes + formattedSeconds;
        }
        return formattedTime;
    }

    public static String getDurationString(int seconds){
        boolean isValid = false;
        int minutes = 0;
        if (seconds >= 0){
            isValid = true;
        }
        if (!isValid){
            minutes = -1;
        }
        if (seconds >= 60){
            minutes = seconds / 60;
            seconds = seconds % 60;
        }
        return getDurationString(minutes,seconds);
    }

}
