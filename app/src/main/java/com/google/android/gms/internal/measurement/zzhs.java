package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhs extends zzhy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhs(zzhv zzhvVar, String str, Boolean bool, boolean z10) {
        super(zzhvVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhy
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzgz.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgz.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = super.zzc();
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzc + ": " + ((String) obj));
        return null;
    }
}
