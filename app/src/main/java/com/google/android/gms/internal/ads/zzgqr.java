package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashSet zza(int i10) {
        return new HashSet(zzd(i10));
    }

    public static LinkedHashMap zzb(int i10) {
        return new LinkedHashMap(zzd(i10));
    }

    public static List zzc(int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i10);
    }

    private static int zzd(int i10) {
        return i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
