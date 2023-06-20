package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzaq {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzat zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzgi zzgiVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzat zzatVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgiVar.zzaz().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzey.zzn(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgiVar.zzaz().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzgiVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgiVar.zzaz().zzk().zzb("Param value can't be null", zzgiVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgiVar.zzv().zzO(bundle2, next, zzA);
                    }
                }
            }
            zzatVar = new zzat(bundle2);
        } else {
            zzatVar = new zzat(new Bundle());
        }
        this.zzf = zzatVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String obj = this.zzf.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaq zza(zzgi zzgiVar, long j10) {
        return new zzaq(zzgiVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzaq(zzgi zzgiVar, String str, String str2, String str3, long j10, long j11, zzat zzatVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzatVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgiVar.zzaz().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzey.zzn(str2), zzey.zzn(str3));
        }
        this.zzf = zzatVar;
    }
}
