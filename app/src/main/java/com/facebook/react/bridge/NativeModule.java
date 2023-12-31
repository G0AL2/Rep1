package com.facebook.react.bridge;

import g6.a;

@a
/* loaded from: classes.dex */
public interface NativeModule {

    /* loaded from: classes.dex */
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void invalidate();

    void onCatalystInstanceDestroy();
}
