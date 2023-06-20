package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfpd implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfpg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpd(zzfpg zzfpgVar, CharSequence charSequence) {
        this.zzb = zzfpgVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(zzfol.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(zzfol.zza(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
