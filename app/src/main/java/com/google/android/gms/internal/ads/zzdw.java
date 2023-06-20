package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdw {
    private static zzdw zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzdw(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzdt(this, null), intentFilter);
    }

    public static synchronized zzdw zzb(Context context) {
        zzdw zzdwVar;
        synchronized (zzdw.class) {
            if (zza == null) {
                zza = new zzdw(context);
            }
            zzdwVar = zza;
        }
        return zzdwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzdw zzdwVar, int i10) {
        synchronized (zzdwVar.zzd) {
            if (zzdwVar.zze == i10) {
                return;
            }
            zzdwVar.zze = i10;
            Iterator it = zzdwVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzvw zzvwVar = (zzvw) weakReference.get();
                if (zzvwVar != null) {
                    zzvwVar.zza.zzk(i10);
                } else {
                    zzdwVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    public final void zzd(final zzvw zzvwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzvwVar));
        this.zzb.post(new Runnable(zzvwVar, null) { // from class: com.google.android.gms.internal.ads.zzdq
            public final /* synthetic */ zzvw zzb;

            @Override // java.lang.Runnable
            public final void run() {
                zzdw zzdwVar = zzdw.this;
                zzvw zzvwVar2 = this.zzb;
                zzvwVar2.zza.zzk(zzdwVar.zza());
            }
        });
    }
}
