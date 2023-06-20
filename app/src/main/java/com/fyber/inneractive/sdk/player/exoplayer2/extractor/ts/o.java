package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;

/* loaded from: classes2.dex */
public final class o implements v {

    /* renamed from: a  reason: collision with root package name */
    public final h f18952a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.j f18953b = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    public int f18954c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f18955d;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.r f18956e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18957f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18958g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18959h;

    /* renamed from: i  reason: collision with root package name */
    public int f18960i;

    /* renamed from: j  reason: collision with root package name */
    public int f18961j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18962k;

    /* renamed from: l  reason: collision with root package name */
    public long f18963l;

    public o(h hVar) {
        this.f18952a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        this.f18956e = rVar;
        this.f18952a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a() {
        this.f18954c = 0;
        this.f18955d = 0;
        this.f18959h = false;
        this.f18952a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z10) {
        boolean z11;
        if (z10) {
            int i10 = this.f18954c;
            if (i10 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i10 == 3) {
                if (this.f18961j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f18961j + " more bytes");
                }
                this.f18952a.b();
            }
            a(1);
        }
        while (kVar.a() > 0) {
            int i11 = this.f18954c;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (a(kVar, this.f18953b.f19575a, Math.min(10, this.f18960i)) && a(kVar, (byte[]) null, this.f18960i)) {
                            this.f18953b.b(0);
                            this.f18963l = -9223372036854775807L;
                            if (this.f18957f) {
                                this.f18953b.c(4);
                                this.f18953b.c(1);
                                this.f18953b.c(1);
                                long a10 = (this.f18953b.a(3) << 30) | (this.f18953b.a(15) << 15) | this.f18953b.a(15);
                                this.f18953b.c(1);
                                if (!this.f18959h && this.f18958g) {
                                    this.f18953b.c(4);
                                    this.f18953b.c(1);
                                    this.f18953b.c(1);
                                    long a11 = (this.f18953b.a(3) << 30) | (this.f18953b.a(15) << 15) | this.f18953b.a(15);
                                    this.f18953b.c(1);
                                    this.f18956e.b(a11);
                                    this.f18959h = true;
                                }
                                this.f18963l = this.f18956e.b(a10);
                            }
                            this.f18952a.a(this.f18963l, this.f18962k);
                            a(3);
                        }
                    } else if (i11 == 3) {
                        int a12 = kVar.a();
                        int i12 = this.f18961j;
                        int i13 = i12 != -1 ? a12 - i12 : 0;
                        if (i13 > 0) {
                            a12 -= i13;
                            kVar.d(kVar.f19580b + a12);
                        }
                        this.f18952a.a(kVar);
                        int i14 = this.f18961j;
                        if (i14 != -1) {
                            int i15 = i14 - a12;
                            this.f18961j = i15;
                            if (i15 == 0) {
                                this.f18952a.b();
                                a(1);
                            }
                        }
                    }
                } else if (a(kVar, this.f18953b.f19575a, 9)) {
                    this.f18953b.b(0);
                    int a13 = this.f18953b.a(24);
                    if (a13 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + a13);
                        this.f18961j = -1;
                        z11 = false;
                    } else {
                        this.f18953b.c(8);
                        int a14 = this.f18953b.a(16);
                        this.f18953b.c(5);
                        this.f18962k = this.f18953b.b();
                        this.f18953b.c(2);
                        this.f18957f = this.f18953b.b();
                        this.f18958g = this.f18953b.b();
                        this.f18953b.c(6);
                        int a15 = this.f18953b.a(8);
                        this.f18960i = a15;
                        if (a14 == 0) {
                            this.f18961j = -1;
                        } else {
                            this.f18961j = ((a14 + 6) - 9) - a15;
                        }
                        z11 = true;
                    }
                    a(z11 ? 2 : 0);
                }
            } else {
                kVar.f(kVar.a());
            }
        }
    }

    public final void a(int i10) {
        this.f18954c = i10;
        this.f18955d = 0;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, byte[] bArr, int i10) {
        int min = Math.min(kVar.a(), i10 - this.f18955d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.f(min);
        } else {
            System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, this.f18955d, min);
            kVar.f19580b += min;
        }
        int i11 = this.f18955d + min;
        this.f18955d = i11;
        return i11 == i10;
    }
}
