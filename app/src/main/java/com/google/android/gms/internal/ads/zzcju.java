package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcju implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcju(zzchr zzchrVar) {
        Context context = zzchrVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzchrVar.zzp().zza);
        this.zzc = new WeakReference(zzchrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(zzcju zzcjuVar, String str, Map map) {
        zzchr zzchrVar = (zzchr) zzcjuVar.zzc.get();
        if (zzchrVar != null) {
            zzchrVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzb();

    @VisibleForTesting
    public final void zzc(String str, String str2, String str3, String str4) {
        zzcfb.zza.post(new zzcjt(this, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd(String str, String str2, int i10) {
        zzcfb.zza.post(new zzcjr(this, str, str2, i10));
    }

    @VisibleForTesting
    public final void zze(String str, String str2, long j10) {
        zzcfb.zza.post(new zzcjs(this, str, str2, j10));
    }

    @VisibleForTesting
    public final void zzf(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        zzcfb.zza.post(new zzcjq(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    @VisibleForTesting
    public final void zzg(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        zzcfb.zza.post(new zzcjp(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzh(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzn(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzo(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzp(int i10) {
    }

    public abstract boolean zzq(String str);

    public boolean zzr(String str, String[] strArr) {
        return zzq(str);
    }

    public boolean zzs(String str, String[] strArr, zzcjm zzcjmVar) {
        return zzq(str);
    }
}
