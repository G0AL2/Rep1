package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.c;

/* compiled from: Event.java */
/* loaded from: classes.dex */
public abstract class c<T extends c> {
    private static int sUniqueID;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUIManagerType;
    private int mUniqueID;
    private int mViewTag;

    /* JADX INFO: Access modifiers changed from: protected */
    public c() {
        int i10 = sUniqueID;
        sUniqueID = i10 + 1;
        this.mUniqueID = i10;
    }

    public boolean canCoalesce() {
        return true;
    }

    public T coalesce(T t10) {
        return getTimestampMs() >= t10.getTimestampMs() ? this : t10;
    }

    @Deprecated
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap eventData = getEventData();
        if (eventData != null) {
            rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), eventData);
            return;
        }
        throw new com.facebook.react.uimanager.h("Event: you must return a valid, non-null value from `getEventData`, or override `dispatch` and `dispatchModern`. Event: " + getEventName());
    }

    @Deprecated
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        WritableMap eventData;
        if (getSurfaceId() != -1 && (eventData = getEventData()) != null) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), eventData, getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public final int getUIManagerType() {
        return this.mUIManagerType;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public void init(int i10) {
        init(-1, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(int i10, int i11) {
        init(i10, i11, h6.j.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public c(int i10) {
        int i11 = sUniqueID;
        sUniqueID = i11 + 1;
        this.mUniqueID = i11;
        init(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(int i10, int i11, long j10) {
        this.mSurfaceId = i10;
        this.mViewTag = i11;
        this.mUIManagerType = i10 == -1 ? 1 : 2;
        this.mTimestampMs = j10;
        this.mInitialized = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i10, int i11) {
        int i12 = sUniqueID;
        sUniqueID = i12 + 1;
        this.mUniqueID = i12;
        init(i10, i11);
    }
}
