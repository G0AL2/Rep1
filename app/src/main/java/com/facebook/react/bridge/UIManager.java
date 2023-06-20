package com.facebook.react.bridge;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public interface UIManager extends JSIModule, PerformanceCounter {
    @Deprecated
    <T extends View> int addRootView(T t10, WritableMap writableMap, String str);

    void addUIManagerEventListener(UIManagerListener uIManagerListener);

    void dispatchCommand(int i10, int i11, ReadableArray readableArray);

    void dispatchCommand(int i10, String str, ReadableArray readableArray);

    <T> T getEventDispatcher();

    @Deprecated
    void preInitializeViewManagers(List<String> list);

    void receiveEvent(int i10, int i11, String str, WritableMap writableMap);

    @Deprecated
    void receiveEvent(int i10, String str, WritableMap writableMap);

    void removeUIManagerEventListener(UIManagerListener uIManagerListener);

    @Deprecated
    String resolveCustomDirectEventName(String str);

    View resolveView(int i10);

    void sendAccessibilityEvent(int i10, int i11);

    <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11);

    void stopSurface(int i10);

    void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap);

    void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14);
}
