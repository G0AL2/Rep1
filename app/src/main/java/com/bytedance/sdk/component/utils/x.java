package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class x extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f10486a;

    /* compiled from: WeakHandler.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Message message);
    }

    public x(a aVar) {
        this.f10486a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f10486a.get();
        if (aVar == null || message == null) {
            return;
        }
        aVar.a(message);
    }

    public x(Looper looper, a aVar) {
        super(looper);
        this.f10486a = new WeakReference<>(aVar);
    }
}
