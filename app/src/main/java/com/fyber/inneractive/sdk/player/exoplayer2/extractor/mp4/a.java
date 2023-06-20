package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f18532l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f18534m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f18536n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f18538o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f18540p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f18542q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f18544r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f18546s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f18548t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f18550u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f18552v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f18554w0;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f18556x0;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f18558y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f18560z0;

    /* renamed from: a  reason: collision with root package name */
    public final int f18561a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f18511b = u.a("ftyp");

    /* renamed from: c  reason: collision with root package name */
    public static final int f18513c = u.a("avc1");

    /* renamed from: d  reason: collision with root package name */
    public static final int f18515d = u.a("avc3");

    /* renamed from: e  reason: collision with root package name */
    public static final int f18517e = u.a("hvc1");

    /* renamed from: f  reason: collision with root package name */
    public static final int f18519f = u.a("hev1");

    /* renamed from: g  reason: collision with root package name */
    public static final int f18521g = u.a("s263");

    /* renamed from: h  reason: collision with root package name */
    public static final int f18523h = u.a("d263");

    /* renamed from: i  reason: collision with root package name */
    public static final int f18525i = u.a("mdat");

    /* renamed from: j  reason: collision with root package name */
    public static final int f18527j = u.a("mp4a");

    /* renamed from: k  reason: collision with root package name */
    public static final int f18529k = u.a(".mp3");

    /* renamed from: l  reason: collision with root package name */
    public static final int f18531l = u.a("wave");

    /* renamed from: m  reason: collision with root package name */
    public static final int f18533m = u.a("lpcm");

    /* renamed from: n  reason: collision with root package name */
    public static final int f18535n = u.a("sowt");

    /* renamed from: o  reason: collision with root package name */
    public static final int f18537o = u.a("ac-3");

    /* renamed from: p  reason: collision with root package name */
    public static final int f18539p = u.a("dac3");

    /* renamed from: q  reason: collision with root package name */
    public static final int f18541q = u.a("ec-3");

    /* renamed from: r  reason: collision with root package name */
    public static final int f18543r = u.a("dec3");

    /* renamed from: s  reason: collision with root package name */
    public static final int f18545s = u.a("dtsc");

    /* renamed from: t  reason: collision with root package name */
    public static final int f18547t = u.a("dtsh");

    /* renamed from: u  reason: collision with root package name */
    public static final int f18549u = u.a("dtsl");

    /* renamed from: v  reason: collision with root package name */
    public static final int f18551v = u.a("dtse");

    /* renamed from: w  reason: collision with root package name */
    public static final int f18553w = u.a("ddts");

    /* renamed from: x  reason: collision with root package name */
    public static final int f18555x = u.a("tfdt");

    /* renamed from: y  reason: collision with root package name */
    public static final int f18557y = u.a("tfhd");

    /* renamed from: z  reason: collision with root package name */
    public static final int f18559z = u.a("trex");
    public static final int A = u.a("trun");
    public static final int B = u.a("sidx");
    public static final int C = u.a("moov");
    public static final int D = u.a("mvhd");
    public static final int E = u.a("trak");
    public static final int F = u.a("mdia");
    public static final int G = u.a("minf");
    public static final int H = u.a("stbl");
    public static final int I = u.a("avcC");
    public static final int J = u.a("hvcC");
    public static final int K = u.a("esds");
    public static final int L = u.a("moof");
    public static final int M = u.a("traf");
    public static final int N = u.a("mvex");
    public static final int O = u.a("mehd");
    public static final int P = u.a("tkhd");
    public static final int Q = u.a("edts");
    public static final int R = u.a("elst");
    public static final int S = u.a("mdhd");
    public static final int T = u.a("hdlr");
    public static final int U = u.a("stsd");
    public static final int V = u.a("pssh");
    public static final int W = u.a("sinf");
    public static final int X = u.a("schm");
    public static final int Y = u.a("schi");
    public static final int Z = u.a("tenc");

    /* renamed from: a0  reason: collision with root package name */
    public static final int f18510a0 = u.a("encv");

    /* renamed from: b0  reason: collision with root package name */
    public static final int f18512b0 = u.a("enca");

    /* renamed from: c0  reason: collision with root package name */
    public static final int f18514c0 = u.a("frma");

    /* renamed from: d0  reason: collision with root package name */
    public static final int f18516d0 = u.a("saiz");

    /* renamed from: e0  reason: collision with root package name */
    public static final int f18518e0 = u.a("saio");

    /* renamed from: f0  reason: collision with root package name */
    public static final int f18520f0 = u.a("sbgp");

    /* renamed from: g0  reason: collision with root package name */
    public static final int f18522g0 = u.a("sgpd");

    /* renamed from: h0  reason: collision with root package name */
    public static final int f18524h0 = u.a("uuid");

    /* renamed from: i0  reason: collision with root package name */
    public static final int f18526i0 = u.a("senc");

    /* renamed from: j0  reason: collision with root package name */
    public static final int f18528j0 = u.a("pasp");

    /* renamed from: k0  reason: collision with root package name */
    public static final int f18530k0 = u.a("TTML");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0253a extends a {
        public final long P0;
        public final List<b> Q0;
        public final List<C0253a> R0;

        public C0253a(int i10, long j10) {
            super(i10);
            this.P0 = j10;
            this.Q0 = new ArrayList();
            this.R0 = new ArrayList();
        }

        public C0253a c(int i10) {
            int size = this.R0.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0253a c0253a = this.R0.get(i11);
                if (c0253a.f18561a == i10) {
                    return c0253a;
                }
            }
            return null;
        }

        public b d(int i10) {
            int size = this.Q0.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.Q0.get(i11);
                if (bVar.f18561a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a
        public String toString() {
            return a.a(this.f18561a) + " leaves: " + Arrays.toString(this.Q0.toArray()) + " containers: " + Arrays.toString(this.R0.toArray());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.k P0;

        public b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
            super(i10);
            this.P0 = kVar;
        }
    }

    static {
        u.a("vmhd");
        f18532l0 = u.a("mp4v");
        f18534m0 = u.a("stts");
        f18536n0 = u.a("stss");
        f18538o0 = u.a("ctts");
        f18540p0 = u.a("stsc");
        f18542q0 = u.a("stsz");
        f18544r0 = u.a("stz2");
        f18546s0 = u.a("stco");
        f18548t0 = u.a("co64");
        f18550u0 = u.a("tx3g");
        f18552v0 = u.a("wvtt");
        f18554w0 = u.a("stpp");
        f18556x0 = u.a("c608");
        f18558y0 = u.a("samr");
        f18560z0 = u.a("sawb");
        A0 = u.a("udta");
        B0 = u.a("meta");
        C0 = u.a("ilst");
        D0 = u.a("mean");
        E0 = u.a("name");
        F0 = u.a("data");
        G0 = u.a("emsg");
        H0 = u.a("st3d");
        I0 = u.a("sv3d");
        J0 = u.a("proj");
        K0 = u.a("vp08");
        L0 = u.a("vp09");
        M0 = u.a("vpcC");
        N0 = u.a("camm");
        O0 = u.a("alac");
    }

    public a(int i10) {
        this.f18561a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f18561a);
    }
}
