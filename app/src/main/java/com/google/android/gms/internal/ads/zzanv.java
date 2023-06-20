package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzanv implements zzany {
    private static zzanv zzb;
    private final Context zzc;
    private final zzfmj zzd;
    private final zzfmq zze;
    private final zzfms zzf;
    private final zzaow zzg;
    private final zzfku zzh;
    private final Executor zzi;
    private final zzfmp zzj;
    private final zzapl zzl;
    private volatile boolean zzn;
    private final int zzp;
    volatile long zza = 0;
    private final Object zzm = new Object();
    private volatile boolean zzo = false;
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzanv(Context context, zzfku zzfkuVar, zzfmj zzfmjVar, zzfmq zzfmqVar, zzfms zzfmsVar, zzaow zzaowVar, Executor executor, zzfkp zzfkpVar, int i10, zzapl zzaplVar) {
        this.zzc = context;
        this.zzh = zzfkuVar;
        this.zzd = zzfmjVar;
        this.zze = zzfmqVar;
        this.zzf = zzfmsVar;
        this.zzg = zzaowVar;
        this.zzi = executor;
        this.zzp = i10;
        this.zzl = zzaplVar;
        this.zzj = new zzant(this, zzfkpVar);
    }

    public static synchronized zzanv zza(String str, Context context, boolean z10, boolean z11) {
        zzanv zzb2;
        synchronized (zzanv.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzanv zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        zzanv zzanvVar;
        synchronized (zzanv.class) {
            if (zzb == null) {
                zzfkv zza = zzfkw.zza();
                zza.zza(str);
                zza.zzc(z10);
                zzfkw zzd = zza.zzd();
                zzfku zza2 = zzfku.zza(context, executor, z11);
                zzaog zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcz)).booleanValue() ? zzaog.zzc(context) : null;
                zzapl zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcA)).booleanValue() ? zzapl.zzd(context, executor) : null;
                zzfln zze = zzfln.zze(context, executor, zza2, zzd);
                zzaov zzaovVar = new zzaov(context);
                zzaow zzaowVar = new zzaow(zzd, zze, new zzapj(context, zzaovVar), zzaovVar, zzc, zzd2);
                int zzb2 = zzflw.zzb(context, zza2);
                zzfkp zzfkpVar = new zzfkp();
                zzanv zzanvVar2 = new zzanv(context, zza2, new zzfmj(context, zzb2), new zzfmq(context, zzb2, new zzans(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbQ)).booleanValue()), new zzfms(context, zzaowVar, zza2, zzfkpVar), zzaowVar, executor, zzfkpVar, zzb2, zzd2);
                zzb = zzanvVar2;
                zzanvVar2.zzm();
                zzb.zzo();
            }
            zzanvVar = zzb;
        }
        return zzanvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzanv r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanv.zzj(com.google.android.gms.internal.ads.zzanv):void");
    }

    private final void zzr() {
        zzapl zzaplVar = this.zzl;
        if (zzaplVar != null) {
            zzaplVar.zzh();
        }
    }

    private final zzfmi zzs(int i10) {
        if (zzflw.zza(this.zzp)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbO)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzd(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzr();
        zzo();
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(jh.DEFAULT_BITMAP_TIMEOUT, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context) {
        zzr();
        zzo();
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context, View view, Activity activity) {
        zzr();
        zzo();
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent) {
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfmr e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzl(int i10, int i11, int i12) {
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfmi zzs = zzs(1);
        if (zzs != null) {
            if (this.zzf.zzc(zzs)) {
                this.zzo = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (this.zzn) {
            return;
        }
        synchronized (this.zzm) {
            if (!this.zzn) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfmi zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzflw.zza(this.zzp)) {
                    this.zzi.execute(new zzanu(this));
                }
            }
        }
    }

    public final synchronized boolean zzq() {
        return this.zzo;
    }
}
