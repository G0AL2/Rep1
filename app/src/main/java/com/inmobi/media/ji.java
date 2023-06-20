package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Task.java */
/* loaded from: classes3.dex */
public final class ji {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f25864a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f25865b;

    /* compiled from: Task.java */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final ji f25866a = new ji((byte) 0);
    }

    /* synthetic */ ji(byte b10) {
        this();
    }

    public static ji a() {
        return a.f25866a;
    }

    private ji() {
        this.f25865b = new Handler(Looper.getMainLooper());
    }

    public final void a(Runnable runnable) {
        this.f25865b.post(runnable);
    }
}
