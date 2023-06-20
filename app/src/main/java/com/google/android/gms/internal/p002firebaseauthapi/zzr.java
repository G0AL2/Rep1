package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzr extends zzo implements Serializable {
    private final Pattern zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final zzn zza(CharSequence charSequence) {
        return new zzq(this.zza.matcher(charSequence));
    }
}
