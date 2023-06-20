package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfii {
    private final Context zza;
    private final Executor zzb;
    private final zzcfn zzc;
    private final zzfhu zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfii(Context context, Executor executor, zzcfn zzcfnVar, zzfhu zzfhuVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfnVar;
        this.zzd = zzfhuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfhs zzfhsVar) {
        zzfhh zza = zzfhg.zza(this.zza, 14);
        zza.zzf();
        zza.zze(this.zzc.zza(str));
        if (zzfhsVar == null) {
            this.zzd.zzb(zza.zzj());
            return;
        }
        zzfhsVar.zza(zza);
        zzfhsVar.zzg();
    }

    public final void zzc(final String str, final zzfhs zzfhsVar) {
        if (zzfhu.zza() && ((Boolean) zzbji.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfih
                @Override // java.lang.Runnable
                public final void run() {
                    zzfii.this.zzb(str, zzfhsVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfig
                @Override // java.lang.Runnable
                public final void run() {
                    zzfii.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
