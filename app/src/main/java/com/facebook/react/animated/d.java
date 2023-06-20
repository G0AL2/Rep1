package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: AnimationDriver.java */
/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a  reason: collision with root package name */
    boolean f15239a = false;

    /* renamed from: b  reason: collision with root package name */
    s f15240b;

    /* renamed from: c  reason: collision with root package name */
    Callback f15241c;

    /* renamed from: d  reason: collision with root package name */
    int f15242d;

    public void a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }

    public abstract void b(long j10);
}
