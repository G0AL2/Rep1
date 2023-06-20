package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.a;
import com.ironsource.sdk.g.e;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes3.dex */
public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public c f28200a;

    public a(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = this.f28200a;
        if (cVar == null) {
            Logger.i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                cVar.a((com.ironsource.sdk.h.c) message.obj);
                return;
            }
            this.f28200a.a((com.ironsource.sdk.h.c) message.obj, new e(i10, a.AnonymousClass1.a(i10)));
        } catch (Throwable th) {
            Logger.i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
