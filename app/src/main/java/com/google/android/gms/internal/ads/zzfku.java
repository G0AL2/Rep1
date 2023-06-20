package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    zzfku(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfku zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkq
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfmw.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkr
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzfmw.zzc());
                }
            });
        }
        return new zzfku(context, executor, taskCompletionSource.getTask(), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (this.zze) {
            final zzaku zza2 = zzaky.zza();
            zza2.zza(this.zzb.getPackageName());
            zza2.zze(j10);
            zza2.zzg(zzf);
            if (exc != null) {
                zza2.zzf(zzfpk.zza(exc));
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zzb(str2);
            }
            if (str != null) {
                zza2.zzc(str);
            }
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfkt
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    zzaku zzakuVar = zzaku.this;
                    int i11 = i10;
                    int i12 = zzfku.zza;
                    if (task.isSuccessful()) {
                        zzfmv zza3 = ((zzfmw) task.getResult()).zza(((zzaky) zzakuVar.zzal()).zzaw());
                        zza3.zza(i11);
                        zza3.zzc();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfks
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Boolean.valueOf(task.isSuccessful());
            }
        });
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public final Task zze(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }
}
