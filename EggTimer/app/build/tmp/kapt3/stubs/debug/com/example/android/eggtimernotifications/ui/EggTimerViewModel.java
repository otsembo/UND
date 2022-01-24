package com.example.android.eggtimernotifications.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020&H\u0002J\u0011\u0010(\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020&H\u0002J\u0019\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020\u0006J\u0010\u00102\u001a\u00020&2\u0006\u00101\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0014R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/example/android/eggtimernotifications/ui/EggTimerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "REQUEST_CODE", "", "TRIGGER_TIME", "", "_alarmOn", "Landroidx/lifecycle/MutableLiveData;", "", "_elapsedTime", "", "_timeSelection", "alarmManager", "Landroid/app/AlarmManager;", "elapsedTime", "Landroidx/lifecycle/LiveData;", "getElapsedTime", "()Landroidx/lifecycle/LiveData;", "isAlarmOn", "minute", "notifyIntent", "Landroid/content/Intent;", "notifyPendingIntent", "Landroid/app/PendingIntent;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "second", "timeSelection", "getTimeSelection", "timer", "Landroid/os/CountDownTimer;", "timerLengthOptions", "", "cancelNotification", "", "createTimer", "loadTime", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetTimer", "saveTime", "triggerTime", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAlarm", "isChecked", "setTimeSelected", "timerLengthSelection", "startTimer", "app_debug"})
public final class EggTimerViewModel extends androidx.lifecycle.AndroidViewModel {
    private final int REQUEST_CODE = 0;
    private final java.lang.String TRIGGER_TIME = "TRIGGER_AT";
    private final long minute = 60000L;
    private final long second = 1000L;
    private final int[] timerLengthOptions = null;
    private final android.app.PendingIntent notifyPendingIntent = null;
    private final android.app.AlarmManager alarmManager = null;
    private android.content.SharedPreferences prefs;
    private final android.content.Intent notifyIntent = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _timeSelection = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _elapsedTime = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _alarmOn;
    private android.os.CountDownTimer timer;
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTimeSelection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getElapsedTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAlarmOn() {
        return null;
    }
    
    /**
     * Turns on or off the alarm
     *
     * @param isChecked, alarm status to be set.
     */
    public final void setAlarm(boolean isChecked) {
    }
    
    /**
     * Sets the desired interval for the alarm
     *
     * @param timerLengthSelection, interval timerLengthSelection value.
     */
    public final void setTimeSelected(int timerLengthSelection) {
    }
    
    /**
     * Creates a new alarm, notification and timer
     */
    private final void startTimer(int timerLengthSelection) {
    }
    
    /**
     * Creates a new timer
     */
    private final void createTimer() {
    }
    
    /**
     * Cancels the alarm, notification and resets the timer
     */
    private final void cancelNotification() {
    }
    
    /**
     * Resets the timer on screen and sets alarm value false
     */
    private final void resetTimer() {
    }
    
    public EggTimerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}