package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfw extends e {
    final /* synthetic */ zzfz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfw(zzfz zzfzVar, int i10) {
        super(20);
        this.zza = zzfzVar;
    }

    @Override // androidx.collection.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfz.zzd(this.zza, str);
    }
}
