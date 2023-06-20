package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbhw implements zzbke {
    final /* synthetic */ zzbhx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhw(zzbhx zzbhxVar) {
        this.zza = zzbhxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final Boolean zza(String str, boolean z10) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final Double zzb(String str, double d10) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Double.valueOf(sharedPreferences2.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final Long zzc(String str, long j10) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Long.valueOf(sharedPreferences2.getLong(str, j10));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final String zzd(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zze;
        return sharedPreferences.getString(str, str2);
    }
}
