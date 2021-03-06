package com.weiqi.modulebase.service;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by alexwangweiqi on 17/10/25.
 */

public class RobService extends AccessibilityService {

    private static final String TAG = RobService.class.getSimpleName();

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        int eventType = event.getEventType();
        String eventText = "";
        Log.i(TAG, "==============Start====================");
        switch (eventType) {
            case AccessibilityEvent.TYPE_VIEW_CLICKED:
                eventText = "TYPE_VIEW_CLICKED";
                break;
            case AccessibilityEvent.TYPE_VIEW_LONG_CLICKED:
                eventText = "TYPE_VIEW_LONG_CLICKED";
                break;
            case AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED:
                eventText = "TYPE_WINDOW_STATE_CHANGED";
                break;
            case AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED:
                eventText = "TYPE_NOTIFICATION_STATE_CHANGED";
                break;
        }
        Log.i(TAG, eventText+" className:"+event.getClassName()+" text:"+event.getText());
        Log.i(TAG, "=============END=====================");
    }

    @Override
    public void onInterrupt() {

    }
}
