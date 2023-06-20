package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgls implements zzgmu {
    private static final zzgly zza = new zzglq();
    private final zzgly zzb;

    public zzgls() {
        zzgly zzglyVar;
        zzgly[] zzglyVarArr = new zzgly[2];
        zzglyVarArr[0] = zzgkl.zza();
        try {
            zzglyVar = (zzgly) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzglyVar = zza;
        }
        zzglyVarArr[1] = zzglyVar;
        zzglr zzglrVar = new zzglr(zzglyVarArr);
        zzgla.zzf(zzglrVar, "messageInfoFactory");
        this.zzb = zzglrVar;
    }

    private static boolean zzb(zzglx zzglxVar) {
        return zzglxVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final zzgmt zza(Class cls) {
        zzgmv.zzG(cls);
        zzglx zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgkq.class.isAssignableFrom(cls)) {
                return zzgme.zzc(zzgmv.zzB(), zzgkf.zzb(), zzb.zza());
            }
            return zzgme.zzc(zzgmv.zzz(), zzgkf.zza(), zzb.zza());
        } else if (zzgkq.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzgmd.zzl(cls, zzb, zzgmg.zzb(), zzglo.zze(), zzgmv.zzB(), zzgkf.zzb(), zzglw.zzb());
            }
            return zzgmd.zzl(cls, zzb, zzgmg.zzb(), zzglo.zze(), zzgmv.zzB(), null, zzglw.zzb());
        } else if (zzb(zzb)) {
            return zzgmd.zzl(cls, zzb, zzgmg.zza(), zzglo.zzd(), zzgmv.zzz(), zzgkf.zza(), zzglw.zza());
        } else {
            return zzgmd.zzl(cls, zzb, zzgmg.zza(), zzglo.zzd(), zzgmv.zzA(), null, zzglw.zza());
        }
    }
}
