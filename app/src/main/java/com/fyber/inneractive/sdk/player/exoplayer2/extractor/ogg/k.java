package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.l;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public static final class a {
        public a(String str, String[] strArr, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18770a;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f18770a = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f18771a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18772b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18773c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18774d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18775e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f18776f;

        public c(long j10, int i10, long j11, int i11, int i12, int i13, int i14, int i15, boolean z10, byte[] bArr) {
            this.f18771a = i10;
            this.f18772b = j11;
            this.f18773c = i12;
            this.f18774d = i14;
            this.f18775e = i15;
            this.f18776f = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static boolean a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z10) throws l {
        if (kVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw new l("too short header: " + kVar.a());
        } else if (kVar.l() != i10) {
            if (z10) {
                return false;
            }
            throw new l("expected header type " + Integer.toHexString(i10));
        } else if (kVar.l() == 118 && kVar.l() == 111 && kVar.l() == 114 && kVar.l() == 98 && kVar.l() == 105 && kVar.l() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw new l("expected characters 'vorbis'");
        }
    }
}
