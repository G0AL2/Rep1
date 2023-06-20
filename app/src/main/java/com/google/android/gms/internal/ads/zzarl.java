package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzarl extends Handler {
    final /* synthetic */ zzarm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzarl(zzarm zzarmVar, Looper looper) {
        super(looper);
        this.zza = zzarmVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
