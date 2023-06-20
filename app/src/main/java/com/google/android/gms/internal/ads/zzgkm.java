package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgkq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzgkm<MessageType extends zzgkq<MessageType, BuilderType>, BuilderType extends zzgkm<MessageType, BuilderType>> extends zzgiq<MessageType, BuilderType> {
    protected zzgkq zza;
    protected boolean zzb = false;
    private final zzgkq zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgkm(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzgkq) messagetype.zzb(4, null, null);
    }

    private static final void zza(zzgkq zzgkqVar, zzgkq zzgkqVar2) {
        zzgmi.zza().zzb(zzgkqVar.getClass()).zzg(zzgkqVar, zzgkqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzgiq
    protected final /* synthetic */ zzgiq zzag(zzgir zzgirVar) {
        zzaj((zzgkq) zzgirVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq
    /* renamed from: zzai */
    public final zzgkm zzaf() {
        zzgkm zzgkmVar = (zzgkm) this.zzc.zzb(5, null, null);
        zzgkmVar.zzaj(zzan());
        return zzgkmVar;
    }

    public final zzgkm zzaj(zzgkq zzgkqVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zza(this.zza, zzgkqVar);
        return this;
    }

    public final zzgkm zzak(byte[] bArr, int i10, int i11, zzgkc zzgkcVar) throws zzglc {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        try {
            zzgmi.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzgiu(zzgkcVar));
            return this;
        } catch (zzglc e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzglc.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaR()) {
            return zzan;
        }
        throw new zzgnj(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    /* renamed from: zzam */
    public MessageType zzan() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzgkq zzgkqVar = this.zza;
        zzgmi.zza().zzb(zzgkqVar.getClass()).zzf(zzgkqVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzap() {
        zzgkq zzgkqVar = (zzgkq) this.zza.zzb(4, null, null);
        zza(zzgkqVar, this.zza);
        this.zza = zzgkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmb
    public final /* synthetic */ zzgma zzbh() {
        return this.zzc;
    }
}
