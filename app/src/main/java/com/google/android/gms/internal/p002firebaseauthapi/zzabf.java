package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabf  reason: invalid package */
/* loaded from: classes2.dex */
final class zzabf extends zzabp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabf(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabp
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                Map.Entry zzg = zzg(i10);
                if (((zzzc) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzzc) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
