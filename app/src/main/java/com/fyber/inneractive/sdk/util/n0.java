package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class n0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<o0> f20312a;

    public n0(Looper looper, o0 o0Var) {
        super(looper);
        this.f20312a = new WeakReference<>(o0Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        o0 o0Var = (o0) s.a(this.f20312a);
        if (o0Var != null) {
            o0Var.handleMessage(message);
        }
    }
}
