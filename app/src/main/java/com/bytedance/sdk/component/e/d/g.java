package com.bytedance.sdk.component.e.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class g extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f10399a;

    /* compiled from: WeakHandler.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Message message);
    }

    public g(Looper looper, a aVar) {
        super(looper);
        this.f10399a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f10399a.get();
        if (aVar == null || message == null) {
            return;
        }
        aVar.a(message);
    }
}
