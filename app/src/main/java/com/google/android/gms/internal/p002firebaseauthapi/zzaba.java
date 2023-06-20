package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaba  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaba implements zzaan {
    private final zzaaq zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaba(zzaaq zzaaqVar, String str, Object[] objArr) {
        this.zza = zzaaqVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.zzd = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaan
    public final zzaaq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaan
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaan
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
