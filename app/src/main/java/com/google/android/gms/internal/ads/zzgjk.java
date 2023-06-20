package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgjk extends zzgjq {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjk(byte[] bArr, int i10, int i11, boolean z10, zzgjj zzgjjVar) {
        super(null);
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzJ() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final void zzA(int i10) {
        this.zzk = i10;
        zzJ();
    }

    public final void zzB(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzglc.zzf();
        }
        throw zzglc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzE(int i10) throws IOException {
        int zzm;
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
                throw zzglc.zze();
            }
            while (i12 < 10) {
                if (zza() < 0) {
                    i12++;
                }
            }
            throw zzglc.zze();
            return true;
        } else if (i11 == 1) {
            zzB(8);
            return true;
        } else if (i11 == 2) {
            zzB(zzj());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    zzB(4);
                    return true;
                }
                throw zzglc.zza();
            }
            return false;
        } else {
            do {
                zzm = zzm();
                if (zzm == 0) {
                    break;
                }
            } while (zzE(zzm));
            zzz(((i10 >>> 3) << 3) | 4);
            return true;
        }
    }

    public final byte zza() throws IOException {
        int i10 = this.zzh;
        if (i10 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 1;
            return bArr[i10];
        }
        throw zzglc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzd() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zze(int i10) throws zzglc {
        if (i10 >= 0) {
            int i11 = i10 + (this.zzh - this.zzi);
            if (i11 >= 0) {
                int i12 = this.zzk;
                if (i11 <= i12) {
                    this.zzk = i11;
                    zzJ();
                    return i12;
                }
                throw zzglc.zzj();
            }
            throw zzglc.zzg();
        }
        throw zzglc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        throw zzglc.zzj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() throws java.io.IOException {
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
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgjk.zzj():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzl() throws IOException {
        return zzgjq.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzglc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw zzglc.zzj();
    }

    public final long zzr() throws IOException {
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
        return zzs();
    }

    final long zzs() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zza = zza();
            j10 |= (zza & Byte.MAX_VALUE) << i10;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzglc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final long zzu() throws IOException {
        return zzgjq.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final zzgji zzw() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj <= i10 - i11) {
                zzgji zzw = zzgji.zzw(this.zze, i11, zzj);
                this.zzh += zzj;
                return zzw;
            }
        }
        if (zzj != 0) {
            if (zzj > 0) {
                int i12 = this.zzf;
                int i13 = this.zzh;
                if (zzj <= i12 - i13) {
                    int i14 = zzj + i13;
                    this.zzh = i14;
                    return zzgji.zzz(Arrays.copyOfRange(this.zze, i13, i14));
                }
            }
            if (zzj <= 0) {
                throw zzglc.zzf();
            }
            throw zzglc.zzj();
        }
        return zzgji.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final String zzx() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj <= i10 - i11) {
                String str = new String(this.zze, i11, zzj, zzgla.zzb);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw zzglc.zzf();
        }
        throw zzglc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final String zzy() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj <= i10 - i11) {
                String zzh = zzgnz.zzh(this.zze, i11, zzj);
                this.zzh += zzj;
                return zzh;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw zzglc.zzf();
        }
        throw zzglc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    public final void zzz(int i10) throws zzglc {
        if (this.zzj != i10) {
            throw zzglc.zzb();
        }
    }
}
