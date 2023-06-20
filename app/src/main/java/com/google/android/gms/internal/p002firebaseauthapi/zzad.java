package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzad  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzad {
    private final zzl zza;
    private final zzac zzb;

    private zzad(zzac zzacVar) {
        zzk zzkVar = zzk.zza;
        this.zzb = zzacVar;
        this.zza = zzkVar;
    }

    public static zzad zzb(char c10) {
        return new zzad(new zzy(new zzi('.')));
    }

    public static zzad zzc(String str) {
        zzo zza = zzv.zza("[.-]");
        if (!((zzq) zza.zza("")).zza.matches()) {
            return new zzad(new zzaa(zza));
        }
        throw new IllegalArgumentException(zzae.zzb("The pattern may not match the empty string: %s", zza));
    }

    public final List zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add((String) zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
