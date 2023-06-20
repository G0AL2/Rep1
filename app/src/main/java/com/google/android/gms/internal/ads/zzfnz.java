package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfnz {
    public static zzfvl zza(Task task) {
        final zzfny zzfnyVar = new zzfny(task);
        task.addOnCompleteListener(zzfvs.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfnx
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfny zzfnyVar2 = zzfny.this;
                if (task2.isCanceled()) {
                    zzfnyVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfnyVar2.zzd(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzfnyVar2.zze(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfnyVar;
    }
}
