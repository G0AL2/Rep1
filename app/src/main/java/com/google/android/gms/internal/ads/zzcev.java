package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcev implements zzbbg {
    @VisibleForTesting
    final zzces zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    @VisibleForTesting
    final HashSet zzb = new HashSet();
    @VisibleForTesting
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcet zzf = new zzcet();

    public zzcev(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzces(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbg
    public final void zza(boolean z10) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        if (z10) {
            if (currentTimeMillis - this.zze.zzd() > ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaN)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = this.zze.zzc();
            }
            this.zzg = true;
            return;
        }
        this.zze.zzt(currentTimeMillis);
        this.zze.zzJ(this.zza.zzd);
    }

    public final zzcek zzb(Clock clock, String str) {
        return new zzcek(clock, this, this.zzf.zza(), str);
    }

    public final void zzc(zzcek zzcekVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcekVar);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, long j10) {
        synchronized (this.zzd) {
            this.zza.zzf(zzlVar, j10);
        }
    }

    public final void zzi(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzj() {
        return this.zzg;
    }

    public final Bundle zzk(Context context, zzfdi zzfdiVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzcek) it2.next()).zza());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzfdiVar.zzc(hashSet);
            return bundle;
        }
        zzceu zzceuVar = (zzceu) it.next();
        throw null;
    }
}
