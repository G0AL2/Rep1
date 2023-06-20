package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzcu extends zzcz<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcu(zzcx zzcxVar, String str, Boolean bool, boolean z10) {
        super(zzcxVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzcz
    final /* bridge */ /* synthetic */ Boolean zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = super.zzc();
        String str = (String) obj;
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 28 + str.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(zzc);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
