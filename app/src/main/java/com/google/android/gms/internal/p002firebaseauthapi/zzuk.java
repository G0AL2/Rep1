package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk  reason: invalid package */
/* loaded from: classes2.dex */
public class zzuk {
    zzth zza;
    ExecutorService zzb;

    public final Task zzP(final zzuj zzujVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzui
            @Override // java.lang.Runnable
            public final void run() {
                zzujVar.zzc(taskCompletionSource, zzuk.this.zza);
            }
        });
        return taskCompletionSource.getTask();
    }
}
