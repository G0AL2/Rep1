package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxr;
import com.google.android.gms.internal.p002firebaseauthapi.zzxs;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzxr<MessageType extends zzxs<MessageType, BuilderType>, BuilderType extends zzxr<MessageType, BuilderType>> implements zzaap {
    @Override // 
    /* renamed from: zzf */
    public abstract zzxr clone();

    protected abstract zzxr zzg(zzxs zzxsVar);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaap
    public final /* bridge */ /* synthetic */ zzaap zzh(zzaaq zzaaqVar) {
        if (zzH().getClass().isInstance(zzaaqVar)) {
            return zzg((zzxs) zzaaqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
