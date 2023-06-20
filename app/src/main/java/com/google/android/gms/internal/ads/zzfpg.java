package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfpg {
    private final zzfoh zza;
    private final zzfpf zzb;

    private zzfpg(zzfpf zzfpfVar) {
        zzfog zzfogVar = zzfog.zza;
        this.zzb = zzfpfVar;
        this.zza = zzfogVar;
    }

    public static zzfpg zzb(int i10) {
        return new zzfpg(new zzfpc(TTAdSdk.INIT_LOCAL_FAIL_CODE));
    }

    public static zzfpg zzc(zzfoh zzfohVar) {
        return new zzfpg(new zzfpa(zzfohVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfpd(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
