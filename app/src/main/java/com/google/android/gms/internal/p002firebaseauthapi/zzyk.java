package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyk  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzyk extends zzym {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzyk(byte[] bArr, int i10, int i11, boolean z10, zzyj zzyjVar) {
        super(null);
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i11;
        this.zzh = 0;
    }

    private final void zzv() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i10 - i12;
    }

    public final byte zza() throws IOException {
        int i10 = this.zzh;
        if (i10 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 1;
            return bArr[i10];
        }
        throw zzzt.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final int zzb() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final int zzc(int i10) throws zzzt {
        if (i10 >= 0) {
            int i11 = i10 + this.zzh;
            if (i11 >= 0) {
                int i12 = this.zzj;
                if (i11 <= i12) {
                    this.zzj = i11;
                    zzv();
                    return i12;
                }
                throw zzzt.zzi();
            }
            throw zzzt.zzg();
        }
        throw zzzt.zzf();
    }

    public final int zzd() throws IOException {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        throw zzzt.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.zzh = r1
            return r0
        L6c:
            long r0 = r5.zzi()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzyk.zze():int");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final int zzf() throws IOException {
        if (zzp()) {
            this.zzi = 0;
            return 0;
        }
        int zze = zze();
        this.zzi = zze;
        if ((zze >>> 3) != 0) {
            return zze;
        }
        throw zzzt.zzc();
    }

    public final long zzg() throws IOException {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw zzzt.zzi();
    }

    public final long zzh() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = (bArr[i14] << 28) ^ i18;
                            if (j14 < 0) {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.zzh = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.zzh = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.zzh = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.zzh = i14;
                return j11;
            }
        }
        return zzi();
    }

    final long zzi() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zza = zza();
            j10 |= (zza & Byte.MAX_VALUE) << i10;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzzt.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final zzyi zzj() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zze <= i10 - i11) {
                zzyi zzo = zzyi.zzo(this.zze, i11, zze);
                this.zzh += zze;
                return zzo;
            }
        }
        if (zze != 0) {
            if (zze > 0) {
                int i12 = this.zzf;
                int i13 = this.zzh;
                if (zze <= i12 - i13) {
                    int i14 = zze + i13;
                    this.zzh = i14;
                    return zzyi.zzq(Arrays.copyOfRange(this.zze, i13, i14));
                }
            }
            if (zze <= 0) {
                throw zzzt.zzf();
            }
            throw zzzt.zzi();
        }
        return zzyi.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final String zzk() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zze <= i10 - i11) {
                String str = new String(this.zze, i11, zze, zzzr.zzb);
                this.zzh += zze;
                return str;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze < 0) {
            throw zzzt.zzf();
        }
        throw zzzt.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final String zzl() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zze <= i10 - i11) {
                String zzd = zzaci.zzd(this.zze, i11, zze);
                this.zzh += zze;
                return zzd;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze <= 0) {
            throw zzzt.zzf();
        }
        throw zzzt.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final void zzm(int i10) throws zzzt {
        if (this.zzi != i10) {
            throw zzzt.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final void zzn(int i10) {
        this.zzj = i10;
        zzv();
    }

    public final void zzo(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzzt.zzf();
        }
        throw zzzt.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final boolean zzp() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final boolean zzq() throws IOException {
        return zzh() != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzym
    public final boolean zzr(int i10) throws IOException {
        int zzf;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zze;
                    int i13 = this.zzh;
                    this.zzh = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzzt.zze();
            }
            while (i12 < 10) {
                if (zza() < 0) {
                    i12++;
                }
            }
            throw zzzt.zze();
            return true;
        } else if (i11 == 1) {
            zzo(8);
            return true;
        } else if (i11 == 2) {
            zzo(zze());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    zzo(4);
                    return true;
                }
                throw zzzt.zza();
            }
            return false;
        } else {
            do {
                zzf = zzf();
                if (zzf == 0) {
                    break;
                }
            } while (zzr(zzf));
            zzm(((i10 >>> 3) << 3) | 4);
            return true;
        }
    }
}
