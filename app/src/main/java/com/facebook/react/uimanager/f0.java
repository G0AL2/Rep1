package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: ReactStylesDiffMap.java */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    final ReadableMap f15851a;

    public f0(ReadableMap readableMap) {
        this.f15851a = readableMap;
    }

    public ReadableArray a(String str) {
        return this.f15851a.getArray(str);
    }

    public boolean b(String str, boolean z10) {
        return this.f15851a.isNull(str) ? z10 : this.f15851a.getBoolean(str);
    }

    public float c(String str, float f10) {
        return this.f15851a.isNull(str) ? f10 : (float) this.f15851a.getDouble(str);
    }

    public int d(String str, int i10) {
        return this.f15851a.isNull(str) ? i10 : this.f15851a.getInt(str);
    }

    public ReadableMap e(String str) {
        return this.f15851a.getMap(str);
    }

    public String f(String str) {
        return this.f15851a.getString(str);
    }

    public boolean g(String str) {
        return this.f15851a.hasKey(str);
    }

    public String toString() {
        return "{ " + f0.class.getSimpleName() + ": " + this.f15851a.toString() + " }";
    }
}
