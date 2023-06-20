package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* compiled from: BackendResponse.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class e {

    /* compiled from: BackendResponse.java */
    /* loaded from: classes2.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static e a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static e d() {
        return new b(a.INVALID_PAYLOAD, -1L);
    }

    public static e e(long j10) {
        return new b(a.OK, j10);
    }

    public static e f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
