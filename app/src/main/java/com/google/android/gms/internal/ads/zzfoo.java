package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfoo {
    private final String zza;
    private final zzfon zzb;
    private zzfon zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfoo(String str, zzfom zzfomVar) {
        zzfon zzfonVar = new zzfon(null);
        this.zzb = zzfonVar;
        this.zzc = zzfonVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfon zzfonVar = this.zzb.zzb;
        String str = "";
        while (zzfonVar != null) {
            Object obj = zzfonVar.zza;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzfonVar = zzfonVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfoo zza(Object obj) {
        zzfon zzfonVar = new zzfon(null);
        this.zzc.zzb = zzfonVar;
        this.zzc = zzfonVar;
        zzfonVar.zza = obj;
        return this;
    }
}
