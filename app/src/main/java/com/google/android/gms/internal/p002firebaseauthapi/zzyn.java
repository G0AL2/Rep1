package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyn  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzyn implements zzabb {
    private final zzym zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzyn(zzym zzymVar) {
        zzzr.zzf(zzymVar, "input");
        this.zza = zzymVar;
        zzymVar.zzc = this;
    }

    private final Object zzP(zzabc zzabcVar, zzyy zzyyVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzabcVar.zze();
            zzabcVar.zzh(zze, this, zzyyVar);
            zzabcVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzzt.zzg();
        } finally {
            this.zzc = i10;
        }
    }

    private final Object zzQ(zzabc zzabcVar, zzyy zzyyVar) throws IOException {
        zzym zzymVar;
        int zze = ((zzyk) this.zza).zze();
        zzym zzymVar2 = this.zza;
        if (zzymVar2.zza < zzymVar2.zzb) {
            int zzc = zzymVar2.zzc(zze);
            Object zze2 = zzabcVar.zze();
            this.zza.zza++;
            zzabcVar.zzh(zze2, this, zzyyVar);
            zzabcVar.zzf(zze2);
            this.zza.zzm(0);
            zzymVar.zza--;
            this.zza.zzn(zzc);
            return zze2;
        }
        throw new zzzt("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzb() != i10) {
            throw zzzt.zzi();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw zzzt.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzzt.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzzt.zzg();
        }
    }

    public static zzyn zzq(zzym zzymVar) {
        zzyn zzynVar = zzymVar.zzc;
        return zzynVar != null ? zzynVar : new zzyn(zzymVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzA(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zze = ((zzyk) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzaafVar.zzf(((zzyk) this.zza).zzg());
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzaafVar.zzf(((zzyk) this.zza).zzg());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zze2 = ((zzyk) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzyk) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Long.valueOf(((zzyk) this.zza).zzg()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzB(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzzf)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zze = ((zzyk) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzyk) this.zza).zzd())));
                } while (this.zza.zzb() < zzb);
                return;
            } else if (i10 != 5) {
                throw zzzt.zza();
            } else {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzyk) this.zza).zzd())));
                    zzym zzymVar = this.zza;
                    if (zzymVar.zzp()) {
                        return;
                    }
                    zzf = zzymVar.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
        }
        zzzf zzzfVar = (zzzf) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zze2 = ((zzyk) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzzfVar.zze(Float.intBitsToFloat(((zzyk) this.zza).zzd()));
            } while (this.zza.zzb() < zzb2);
        } else if (i11 != 5) {
            throw zzzt.zza();
        } else {
            do {
                zzzfVar.zze(Float.intBitsToFloat(((zzyk) this.zza).zzd()));
                zzym zzymVar2 = this.zza;
                if (zzymVar2.zzp()) {
                    return;
                }
                zzf2 = zzymVar2.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    @Deprecated
    public final void zzC(List list, zzabc zzabcVar, zzyy zzyyVar) throws IOException {
        int zzf;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzzt.zza();
        }
        do {
            list.add(zzP(zzabcVar, zzyyVar));
            zzym zzymVar = this.zza;
            if (zzymVar.zzp() || this.zzd != 0) {
                return;
            }
            zzf = zzymVar.zzf();
        } while (zzf == i10);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzD(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzzmVar.zzf(((zzyk) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzzmVar.zzf(((zzyk) this.zza).zze());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyk) this.zza).zze()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzE(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzaafVar.zzf(((zzyk) this.zza).zzh());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzaafVar.zzf(((zzyk) this.zza).zzh());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzyk) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Long.valueOf(((zzyk) this.zza).zzh()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzF(List list, zzabc zzabcVar, zzyy zzyyVar) throws IOException {
        int zzf;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzzt.zza();
        }
        do {
            list.add(zzQ(zzabcVar, zzyyVar));
            zzym zzymVar = this.zza;
            if (zzymVar.zzp() || this.zzd != 0) {
                return;
            }
            zzf = zzymVar.zzf();
        } while (zzf == i10);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzG(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzzm)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zze = ((zzyk) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            } else if (i10 != 5) {
                throw zzzt.zza();
            } else {
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zzd()));
                    zzym zzymVar = this.zza;
                    if (zzymVar.zzp()) {
                        return;
                    }
                    zzf = zzymVar.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
        }
        zzzm zzzmVar = (zzzm) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zze2 = ((zzyk) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzzmVar.zzf(((zzyk) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
        } else if (i11 != 5) {
            throw zzzt.zza();
        } else {
            do {
                zzzmVar.zzf(((zzyk) this.zza).zzd());
                zzym zzymVar2 = this.zza;
                if (zzymVar2.zzp()) {
                    return;
                }
                zzf2 = zzymVar2.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzH(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zze = ((zzyk) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzaafVar.zzf(((zzyk) this.zza).zzg());
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzaafVar.zzf(((zzyk) this.zza).zzg());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zze2 = ((zzyk) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzyk) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Long.valueOf(((zzyk) this.zza).zzg()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzI(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzzmVar.zzf(zzym.zzs(((zzyk) this.zza).zze()));
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzzmVar.zzf(zzym.zzs(((zzyk) this.zza).zze()));
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzym.zzs(((zzyk) this.zza).zze())));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Integer.valueOf(zzym.zzs(((zzyk) this.zza).zze())));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzJ(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzaafVar.zzf(zzym.zzt(((zzyk) this.zza).zzh()));
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzaafVar.zzf(zzym.zzt(((zzyk) this.zza).zzh()));
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzym.zzt(((zzyk) this.zza).zzh())));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Long.valueOf(zzym.zzt(((zzyk) this.zza).zzh())));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int zzf;
        int zzf2;
        if ((this.zzb & 7) == 2) {
            if (!(list instanceof zzzy) || z10) {
                do {
                    list.add(z10 ? zzu() : zzt());
                    zzym zzymVar = this.zza;
                    if (zzymVar.zzp()) {
                        return;
                    }
                    zzf = zzymVar.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            zzzy zzzyVar = (zzzy) list;
            do {
                zzzyVar.zzi(zzp());
                zzym zzymVar2 = this.zza;
                if (zzymVar2.zzp()) {
                    return;
                }
                zzf2 = zzymVar2.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        throw zzzt.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzL(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzzmVar.zzf(((zzyk) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzzmVar.zzf(((zzyk) this.zza).zze());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyk) this.zza).zze()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzM(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzaafVar.zzf(((zzyk) this.zza).zzh());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzaafVar.zzf(((zzyk) this.zza).zzh());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzyk) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Long.valueOf(((zzyk) this.zza).zzh()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final boolean zzO() throws IOException {
        int i10;
        zzym zzymVar = this.zza;
        if (zzymVar.zzp() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return zzymVar.zzr(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final double zza() throws IOException {
        zzS(1);
        return Double.longBitsToDouble(((zzyk) this.zza).zzg());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final float zzb() throws IOException {
        zzS(5);
        return Float.intBitsToFloat(((zzyk) this.zza).zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzf();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zze() throws IOException {
        zzS(0);
        return ((zzyk) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzf() throws IOException {
        zzS(5);
        return ((zzyk) this.zza).zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzg() throws IOException {
        zzS(0);
        return ((zzyk) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzh() throws IOException {
        zzS(5);
        return ((zzyk) this.zza).zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzi() throws IOException {
        zzS(0);
        return zzym.zzs(((zzyk) this.zza).zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final int zzj() throws IOException {
        zzS(0);
        return ((zzyk) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final long zzk() throws IOException {
        zzS(1);
        return ((zzyk) this.zza).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final long zzl() throws IOException {
        zzS(0);
        return ((zzyk) this.zza).zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final long zzm() throws IOException {
        zzS(1);
        return ((zzyk) this.zza).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final long zzn() throws IOException {
        zzS(0);
        return zzym.zzt(((zzyk) this.zza).zzh());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final long zzo() throws IOException {
        zzS(0);
        return ((zzyk) this.zza).zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final zzyi zzp() throws IOException {
        zzS(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    @Deprecated
    public final Object zzr(zzabc zzabcVar, zzyy zzyyVar) throws IOException {
        zzS(3);
        return zzP(zzabcVar, zzyyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final Object zzs(zzabc zzabcVar, zzyy zzyyVar) throws IOException {
        zzS(2);
        return zzQ(zzabcVar, zzyyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final String zzt() throws IOException {
        zzS(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final String zzu() throws IOException {
        zzS(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzv(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzxx) {
            zzxx zzxxVar = (zzxx) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzxxVar.zze(this.zza.zzq());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzxxVar.zze(this.zza.zzq());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzq()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzw(List list) throws IOException {
        int zzf;
        if ((this.zzb & 7) != 2) {
            throw zzzt.zza();
        }
        do {
            list.add(zzp());
            zzym zzymVar = this.zza;
            if (zzymVar.zzp()) {
                return;
            }
            zzf = zzymVar.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzx(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zze = ((zzyk) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzyvVar.zze(Double.longBitsToDouble(((zzyk) this.zza).zzg()));
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzyvVar.zze(Double.longBitsToDouble(((zzyk) this.zza).zzg()));
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zze2 = ((zzyk) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzyk) this.zza).zzg())));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((zzyk) this.zza).zzg())));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzy(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzb = this.zza.zzb() + ((zzyk) this.zza).zze();
                    do {
                        zzzmVar.zzf(((zzyk) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzzt.zza();
            }
            do {
                zzzmVar.zzf(((zzyk) this.zza).zze());
                zzym zzymVar = this.zza;
                if (zzymVar.zzp()) {
                    return;
                }
                zzf2 = zzymVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyk) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzzt.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyk) this.zza).zze()));
            zzym zzymVar2 = this.zza;
            if (zzymVar2.zzp()) {
                return;
            }
            zzf = zzymVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabb
    public final void zzz(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzzm)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zze = ((zzyk) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            } else if (i10 != 5) {
                throw zzzt.zza();
            } else {
                do {
                    list.add(Integer.valueOf(((zzyk) this.zza).zzd()));
                    zzym zzymVar = this.zza;
                    if (zzymVar.zzp()) {
                        return;
                    }
                    zzf = zzymVar.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
        }
        zzzm zzzmVar = (zzzm) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zze2 = ((zzyk) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzzmVar.zzf(((zzyk) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
        } else if (i11 != 5) {
            throw zzzt.zza();
        } else {
            do {
                zzzmVar.zzf(((zzyk) this.zza).zzd());
                zzym zzymVar2 = this.zza;
                if (zzymVar2.zzp()) {
                    return;
                }
                zzf2 = zzymVar2.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
        }
    }
}
