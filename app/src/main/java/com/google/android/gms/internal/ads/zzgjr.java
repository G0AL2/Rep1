package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgjr implements zzgml {
    private final zzgjq zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgjr(zzgjq zzgjqVar) {
        zzgla.zzf(zzgjqVar, "input");
        this.zza = zzgjqVar;
        zzgjqVar.zzc = this;
    }

    private final Object zzP(zzgmt zzgmtVar, zzgkc zzgkcVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzgmtVar.zze();
            zzgmtVar.zzh(zze, this, zzgkcVar);
            zzgmtVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzglc.zzg();
        } finally {
            this.zzc = i10;
        }
    }

    private final Object zzQ(zzgmt zzgmtVar, zzgkc zzgkcVar) throws IOException {
        zzgjq zzgjqVar;
        int zzn = this.zza.zzn();
        zzgjq zzgjqVar2 = this.zza;
        if (zzgjqVar2.zza < zzgjqVar2.zzb) {
            int zze = zzgjqVar2.zze(zzn);
            Object zze2 = zzgmtVar.zze();
            this.zza.zza++;
            zzgmtVar.zzh(zze2, this, zzgkcVar);
            zzgmtVar.zzf(zze2);
            this.zza.zzz(0);
            zzgjqVar.zza--;
            this.zza.zzA(zze);
            return zze2;
        }
        throw new zzglc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() != i10) {
            throw zzglc.zzj();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw zzglc.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzglc.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzglc.zzg();
        }
    }

    public static zzgjr zzq(zzgjq zzgjqVar) {
        zzgjr zzgjrVar = zzgjqVar.zzc;
        return zzgjrVar != null ? zzgjrVar : new zzgjr(zzgjqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzglpVar.zzg(this.zza.zzo());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzglpVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzd() < zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkj)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd);
                return;
            } else if (i10 != 5) {
                throw zzglc.zza();
            } else {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
        }
        zzgkj zzgkjVar = (zzgkj) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgkjVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd2);
        } else if (i11 != 5) {
            throw zzglc.zza();
        } else {
            do {
                zzgkjVar.zze(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    @Deprecated
    public final void zzC(List list, zzgmt zzgmtVar, zzgkc zzgkcVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzglc.zza();
        }
        do {
            list.add(zzP(zzgmtVar, zzgkcVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgkrVar.zzh(this.zza.zzh());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgkrVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzglpVar.zzg(this.zza.zzp());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzglpVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzF(List list, zzgmt zzgmtVar, zzgkc zzgkcVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzglc.zza();
        }
        do {
            list.add(zzQ(zzgmtVar, zzgkcVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkr)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd);
                return;
            } else if (i10 != 5) {
                throw zzglc.zza();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
        }
        zzgkr zzgkrVar = (zzgkr) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgkrVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < zzd2);
        } else if (i11 != 5) {
            throw zzglc.zza();
        } else {
            do {
                zzgkrVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzglpVar.zzg(this.zza.zzt());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzglpVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzd() < zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgkrVar.zzh(this.zza.zzl());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgkrVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzglpVar.zzg(this.zza.zzu());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzglpVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzu()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) == 2) {
            if (!(list instanceof zzgli) || z10) {
                do {
                    list.add(z10 ? zzu() : zzt());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            zzgli zzgliVar = (zzgli) list;
            do {
                zzgliVar.zzi(zzp());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        throw zzglc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgkrVar.zzh(this.zza.zzn());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgkrVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzglpVar.zzg(this.zza.zzv());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzglpVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzv()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final boolean zzO() throws IOException {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final zzgji zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    @Deprecated
    public final Object zzr(zzgmt zzgmtVar, zzgkc zzgkcVar) throws IOException {
        zzS(3);
        return zzP(zzgmtVar, zzgkcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final Object zzs(zzgmt zzgmtVar, zzgkc zzgkcVar) throws IOException {
        zzS(2);
        return zzQ(zzgmtVar, zzgkcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final String zzt() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final String zzu() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgiw) {
            zzgiw zzgiwVar = (zzgiw) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgiwVar.zze(this.zza.zzD());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgiwVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzglc.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgjz) {
            zzgjz zzgjzVar = (zzgjz) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzgjzVar.zze(this.zza.zzb());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgjzVar.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzd() < zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgkrVar.zzh(this.zza.zzf());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i10 == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgkrVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzglc.zza();
            }
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i11 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzglc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkr)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd);
                return;
            } else if (i10 != 5) {
                throw zzglc.zza();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
        }
        zzgkr zzgkrVar = (zzgkr) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgkrVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < zzd2);
        } else if (i11 != 5) {
            throw zzglc.zza();
        } else {
            do {
                zzgkrVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        }
    }
}
