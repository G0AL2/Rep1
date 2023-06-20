package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: n  reason: collision with root package name */
    public a f18761n;

    /* renamed from: o  reason: collision with root package name */
    public int f18762o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f18763p;

    /* renamed from: q  reason: collision with root package name */
    public k.c f18764q;

    /* renamed from: r  reason: collision with root package name */
    public k.a f18765r;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final k.c f18766a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f18767b;

        /* renamed from: c  reason: collision with root package name */
        public final k.b[] f18768c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18769d;

        public a(k.c cVar, k.a aVar, byte[] bArr, k.b[] bVarArr, int i10) {
            this.f18766a = cVar;
            this.f18767b = bArr;
            this.f18768c = bVarArr;
            this.f18769d = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f18761n = null;
            this.f18764q = null;
            this.f18765r = null;
        }
        this.f18762o = 0;
        this.f18763p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void b(long j10) {
        this.f18748g = j10;
        this.f18763p = j10 != 0;
        k.c cVar = this.f18764q;
        this.f18762o = cVar != null ? cVar.f18774d : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int i10;
        byte[] bArr = kVar.f19579a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = bArr[0];
        a aVar = this.f18761n;
        if (!aVar.f18768c[(b10 >> 1) & (255 >>> (8 - aVar.f18769d))].f18770a) {
            i10 = aVar.f18766a.f18774d;
        } else {
            i10 = aVar.f18766a.f18775e;
        }
        long j10 = this.f18763p ? (this.f18762o + i10) / 4 : 0;
        kVar.d(kVar.f19581c + 4);
        byte[] bArr2 = kVar.f19579a;
        int i11 = kVar.f19581c;
        bArr2[i11 - 4] = (byte) (j10 & 255);
        bArr2[i11 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f18763p = true;
        this.f18762o = i10;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j10, h.a aVar) throws IOException, InterruptedException {
        a aVar2;
        int i10;
        long j11;
        int i11;
        if (this.f18761n != null) {
            return false;
        }
        if (this.f18764q == null) {
            k.a(1, kVar, false);
            long f10 = kVar.f();
            int l10 = kVar.l();
            long f11 = kVar.f();
            int e10 = kVar.e();
            int e11 = kVar.e();
            int e12 = kVar.e();
            int l11 = kVar.l();
            this.f18764q = new k.c(f10, l10, f11, e10, e11, e12, (int) Math.pow(2.0d, l11 & 15), (int) Math.pow(2.0d, (l11 & 240) >> 4), (kVar.l() & 1) > 0, Arrays.copyOf(kVar.f19579a, kVar.f19581c));
        } else if (this.f18765r == null) {
            k.a(3, kVar, false);
            String b10 = kVar.b((int) kVar.f());
            long f12 = kVar.f();
            String[] strArr = new String[(int) f12];
            int length = b10.length() + 11 + 4;
            for (int i12 = 0; i12 < f12; i12++) {
                strArr[i12] = kVar.b((int) kVar.f());
                length = length + 4 + strArr[i12].length();
            }
            if ((kVar.l() & 1) != 0) {
                this.f18765r = new k.a(b10, strArr, length + 1);
            } else {
                throw new l("framing bit expected to be set");
            }
        } else {
            int i13 = kVar.f19581c;
            byte[] bArr = new byte[i13];
            int i14 = 0;
            System.arraycopy(kVar.f19579a, 0, bArr, 0, i13);
            int i15 = this.f18764q.f18771a;
            int i16 = 5;
            k.a(5, kVar, false);
            int l12 = kVar.l() + 1;
            i iVar = new i(kVar.f19579a);
            iVar.b(kVar.f19580b * 8);
            int i17 = 0;
            while (true) {
                int i18 = 16;
                if (i17 < l12) {
                    if (iVar.a(24) == 5653314) {
                        int a10 = iVar.a(16);
                        int a11 = iVar.a(24);
                        long[] jArr = new long[a11];
                        long j12 = 0;
                        if (!iVar.a()) {
                            boolean a12 = iVar.a();
                            while (i14 < a11) {
                                if (a12) {
                                    if (iVar.a()) {
                                        i11 = a10;
                                        jArr[i14] = iVar.a(5) + 1;
                                    } else {
                                        i11 = a10;
                                        jArr[i14] = 0;
                                    }
                                } else {
                                    i11 = a10;
                                    jArr[i14] = iVar.a(5) + 1;
                                }
                                i14++;
                                a10 = i11;
                            }
                            i10 = a10;
                        } else {
                            i10 = a10;
                            int a13 = iVar.a(5) + 1;
                            int i19 = 0;
                            while (i19 < a11) {
                                int a14 = iVar.a(k.a(a11 - i19));
                                int i20 = i19;
                                int i21 = 0;
                                while (i21 < a14 && i20 < a11) {
                                    jArr[i20] = a13;
                                    i20++;
                                    i21++;
                                    a11 = a11;
                                }
                                a13++;
                                i19 = i20;
                                a11 = a11;
                            }
                        }
                        int i22 = a11;
                        int a15 = iVar.a(4);
                        if (a15 > 2) {
                            throw new l("lookup type greater than 2 not decodable: " + a15);
                        }
                        if (a15 == 1 || a15 == 2) {
                            iVar.b(32);
                            iVar.b(32);
                            int a16 = iVar.a(4) + 1;
                            iVar.b(1);
                            if (a15 == 1) {
                                if (i10 != 0) {
                                    j11 = (long) Math.floor(Math.pow(i22, 1.0d / i10));
                                }
                                iVar.b((int) (a16 * j12));
                            } else {
                                j11 = i22 * i10;
                            }
                            j12 = j11;
                            iVar.b((int) (a16 * j12));
                        }
                        i17++;
                        i14 = 0;
                    } else {
                        throw new l("expected code book to start with [0x56, 0x43, 0x42] at " + ((iVar.f18759c * 8) + iVar.f18760d));
                    }
                } else {
                    int i23 = 6;
                    int a17 = iVar.a(6) + 1;
                    for (int i24 = 0; i24 < a17; i24++) {
                        if (iVar.a(16) != 0) {
                            throw new l("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i25 = 1;
                    int a18 = iVar.a(6) + 1;
                    int i26 = 0;
                    while (i26 < a18) {
                        int a19 = iVar.a(i18);
                        if (a19 == 0) {
                            int i27 = 8;
                            iVar.b(8);
                            iVar.b(16);
                            iVar.b(16);
                            iVar.b(6);
                            iVar.b(8);
                            int a20 = iVar.a(4) + 1;
                            int i28 = 0;
                            while (i28 < a20) {
                                iVar.b(i27);
                                i28++;
                                i27 = 8;
                            }
                        } else if (a19 == i25) {
                            int a21 = iVar.a(i16);
                            int[] iArr = new int[a21];
                            int i29 = -1;
                            for (int i30 = 0; i30 < a21; i30++) {
                                iArr[i30] = iVar.a(4);
                                if (iArr[i30] > i29) {
                                    i29 = iArr[i30];
                                }
                            }
                            int i31 = i29 + 1;
                            int[] iArr2 = new int[i31];
                            for (int i32 = 0; i32 < i31; i32++) {
                                int i33 = 1;
                                iArr2[i32] = iVar.a(3) + 1;
                                int a22 = iVar.a(2);
                                int i34 = 8;
                                if (a22 > 0) {
                                    iVar.b(8);
                                }
                                int i35 = 0;
                                while (i35 < (i33 << a22)) {
                                    iVar.b(i34);
                                    i35++;
                                    i33 = 1;
                                    i34 = 8;
                                }
                            }
                            iVar.b(2);
                            int a23 = iVar.a(4);
                            int i36 = 0;
                            int i37 = 0;
                            for (int i38 = 0; i38 < a21; i38++) {
                                i36 += iArr2[iArr[i38]];
                                while (i37 < i36) {
                                    iVar.b(a23);
                                    i37++;
                                }
                            }
                        } else {
                            throw new l("floor type greater than 1 not decodable: " + a19);
                        }
                        i26++;
                        i23 = 6;
                        i16 = 5;
                        i25 = 1;
                        i18 = 16;
                    }
                    int i39 = 1;
                    int a24 = iVar.a(i23) + 1;
                    int i40 = 0;
                    while (i40 < a24) {
                        if (iVar.a(16) <= 2) {
                            iVar.b(24);
                            iVar.b(24);
                            iVar.b(24);
                            int a25 = iVar.a(i23) + i39;
                            int i41 = 8;
                            iVar.b(8);
                            int[] iArr3 = new int[a25];
                            for (int i42 = 0; i42 < a25; i42++) {
                                iArr3[i42] = ((iVar.a() ? iVar.a(5) : 0) * 8) + iVar.a(3);
                            }
                            int i43 = 0;
                            while (i43 < a25) {
                                int i44 = 0;
                                while (i44 < i41) {
                                    if ((iArr3[i43] & (1 << i44)) != 0) {
                                        iVar.b(i41);
                                    }
                                    i44++;
                                    i41 = 8;
                                }
                                i43++;
                                i41 = 8;
                            }
                            i40++;
                            i23 = 6;
                            i39 = 1;
                        } else {
                            throw new l("residueType greater than 2 is not decodable");
                        }
                    }
                    int a26 = iVar.a(i23) + 1;
                    for (int i45 = 0; i45 < a26; i45++) {
                        int a27 = iVar.a(16);
                        if (a27 != 0) {
                            Log.e("VorbisUtil", "mapping type other than 0 not supported: " + a27);
                        } else {
                            int a28 = iVar.a() ? iVar.a(4) + 1 : 1;
                            if (iVar.a()) {
                                int a29 = iVar.a(8) + 1;
                                for (int i46 = 0; i46 < a29; i46++) {
                                    int i47 = i15 - 1;
                                    iVar.b(k.a(i47));
                                    iVar.b(k.a(i47));
                                }
                            }
                            if (iVar.a(2) != 0) {
                                throw new l("to reserved bits must be zero after mapping coupling steps");
                            }
                            if (a28 > 1) {
                                for (int i48 = 0; i48 < i15; i48++) {
                                    iVar.b(4);
                                }
                            }
                            for (int i49 = 0; i49 < a28; i49++) {
                                iVar.b(8);
                                iVar.b(8);
                                iVar.b(8);
                            }
                        }
                    }
                    int a30 = iVar.a(6) + 1;
                    k.b[] bVarArr = new k.b[a30];
                    for (int i50 = 0; i50 < a30; i50++) {
                        bVarArr[i50] = new k.b(iVar.a(), iVar.a(16), iVar.a(16), iVar.a(8));
                    }
                    if (iVar.a()) {
                        aVar2 = new a(this.f18764q, this.f18765r, bArr, bVarArr, k.a(a30 - 1));
                    } else {
                        throw new l("framing bit after modes not set as expected");
                    }
                }
            }
        }
        aVar2 = null;
        this.f18761n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f18761n.f18766a.f18776f);
        arrayList.add(this.f18761n.f18767b);
        k.c cVar = this.f18761n.f18766a;
        aVar.f18755a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/vorbis", (String) null, cVar.f18773c, -1, cVar.f18771a, (int) cVar.f18772b, -1, arrayList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
        return true;
    }
}
