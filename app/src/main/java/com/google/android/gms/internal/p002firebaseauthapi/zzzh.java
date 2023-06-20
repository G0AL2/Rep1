package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.google.android.gms.internal.p002firebaseauthapi.zzzl;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzh  reason: invalid package */
/* loaded from: classes2.dex */
public class zzzh<MessageType extends zzzl<MessageType, BuilderType>, BuilderType extends zzzh<MessageType, BuilderType>> extends zzxr<MessageType, BuilderType> {
    protected zzzl zza;
    protected boolean zzb = false;
    private final zzzl zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzzh(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzzl) messagetype.zzj(4, null, null);
    }

    private static final void zza(zzzl zzzlVar, zzzl zzzlVar2) {
        zzaay.zza().zzb(zzzlVar.getClass()).zzg(zzzlVar, zzzlVar2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* synthetic */ zzaaq zzH() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxr
    protected final /* synthetic */ zzxr zzg(zzxs zzxsVar) {
        zzj((zzzl) zzxsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxr
    /* renamed from: zzi */
    public final zzzh zzf() {
        zzzh zzzhVar = (zzzh) this.zzc.zzj(5, null, null);
        zzzhVar.zzj(zzm());
        return zzzhVar;
    }

    public final zzzh zzj(zzzl zzzlVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zza(this.zza, zzzlVar);
        return this;
    }

    public final MessageType zzk() {
        MessageType zzm = zzm();
        if (zzm.zzG()) {
            return zzm;
        }
        throw new zzabs(zzm);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaap
    /* renamed from: zzl */
    public MessageType zzm() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzzl zzzlVar = this.zza;
        zzaay.zza().zzb(zzzlVar.getClass()).zzf(zzzlVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzo() {
        zzzl zzzlVar = (zzzl) this.zza.zzj(4, null, null);
        zza(zzzlVar, this.zza);
        this.zza = zzzlVar;
    }
}
