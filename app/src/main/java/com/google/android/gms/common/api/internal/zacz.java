package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zacz extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(zada zadaVar, Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zada zadaVar;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                StringBuilder sb2 = new StringBuilder(70);
                sb2.append("TransformationResultHandler received unknown message type: ");
                sb2.append(i10);
                Log.e("TransformedResultImpl", sb2.toString());
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
        PendingResult<?> pendingResult = (PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            zadaVar = this.zaa.zab;
            zada zadaVar2 = (zada) Preconditions.checkNotNull(zadaVar);
            if (pendingResult == null) {
                zadaVar2.zaj(new Status(13, "Transform returned null"));
            } else if (pendingResult instanceof zacp) {
                zadaVar2.zaj(((zacp) pendingResult).zaa());
            } else {
                zadaVar2.zai(pendingResult);
            }
        }
    }
}
