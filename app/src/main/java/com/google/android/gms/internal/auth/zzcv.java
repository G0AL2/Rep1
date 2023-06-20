package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzcv extends zzcz<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcv(zzcx zzcxVar, String str, Double d10, boolean z10) {
        super(zzcxVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    final /* bridge */ /* synthetic */ Double zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 27 + str.length());
            sb2.append("Invalid double value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
