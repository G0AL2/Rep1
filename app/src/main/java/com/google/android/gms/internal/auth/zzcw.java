package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzcw extends zzcz {
    final /* synthetic */ zzhl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzcx zzcxVar, String str, Object obj, boolean z10, zzhl zzhlVar, byte[] bArr) {
        super(zzcxVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    final Object zza(Object obj) {
        try {
            return zzhi.zzl(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 27 + str.length());
            sb2.append("Invalid byte[] value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
