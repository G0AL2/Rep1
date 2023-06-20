package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaai implements zzabd {
    private static final zzaao zza = new zzaag();
    private final zzaao zzb;

    public zzaai() {
        zzaao zzaaoVar;
        zzaao[] zzaaoVarArr = new zzaao[2];
        zzaaoVarArr[0] = zzzg.zza();
        try {
            zzaaoVar = (zzaao) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzaaoVar = zza;
        }
        zzaaoVarArr[1] = zzaaoVar;
        zzaah zzaahVar = new zzaah(zzaaoVarArr);
        zzzr.zzf(zzaahVar, "messageInfoFactory");
        this.zzb = zzaahVar;
    }

    private static boolean zzb(zzaan zzaanVar) {
        return zzaanVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabd
    public final zzabc zza(Class cls) {
        zzabe.zzG(cls);
        zzaan zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzzl.class.isAssignableFrom(cls)) {
                return zzaau.zzc(zzabe.zzB(), zzzb.zzb(), zzb.zza());
            }
            return zzaau.zzc(zzabe.zzz(), zzzb.zza(), zzb.zza());
        } else if (zzzl.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzaat.zzl(cls, zzb, zzaaw.zzb(), zzaae.zze(), zzabe.zzB(), zzzb.zzb(), zzaam.zzb());
            }
            return zzaat.zzl(cls, zzb, zzaaw.zzb(), zzaae.zze(), zzabe.zzB(), null, zzaam.zzb());
        } else if (zzb(zzb)) {
            return zzaat.zzl(cls, zzb, zzaaw.zza(), zzaae.zzd(), zzabe.zzz(), zzzb.zza(), zzaam.zza());
        } else {
            return zzaat.zzl(cls, zzb, zzaaw.zza(), zzaae.zzd(), zzabe.zzA(), null, zzaam.zza());
        }
    }
}
