package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyx  reason: invalid package */
/* loaded from: classes2.dex */
final class zzyx {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyx(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzyx) {
            zzyx zzyxVar = (zzyx) obj;
            return this.zza == zzyxVar.zza && this.zzb == zzyxVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
