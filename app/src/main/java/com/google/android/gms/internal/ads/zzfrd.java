package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfrd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, int i11) {
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
    }

    public abstract zzfrd zzb(Object obj);
}
