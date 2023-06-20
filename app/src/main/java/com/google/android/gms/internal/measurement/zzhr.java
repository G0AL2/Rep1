package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhr extends zzhy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhr(zzhv zzhvVar, String str, Long l10, boolean z10) {
        super(zzhvVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            Log.e("PhenotypeFlag", "Invalid long value for " + zzc + ": " + ((String) obj));
            return null;
        }
    }
}
