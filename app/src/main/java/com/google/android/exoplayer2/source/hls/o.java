package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.a0;
import ea.j0;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p8.w;
import p8.x;

/* compiled from: WebvttExtractor.java */
/* loaded from: classes2.dex */
public final class o implements p8.i {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f21556g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f21557h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f21558a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f21559b;

    /* renamed from: d  reason: collision with root package name */
    private p8.k f21561d;

    /* renamed from: f  reason: collision with root package name */
    private int f21563f;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f21560c = new a0();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f21562e = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];

    public o(String str, j0 j0Var) {
        this.f21558a = str;
        this.f21559b = j0Var;
    }

    private p8.a0 b(long j10) {
        p8.a0 f10 = this.f21561d.f(0, 3);
        f10.d(new p1.b().e0("text/vtt").V(this.f21558a).i0(j10).E());
        this.f21561d.r();
        return f10;
    }

    private void d() throws j2 {
        a0 a0Var = new a0(this.f21562e);
        aa.i.e(a0Var);
        long j10 = 0;
        long j11 = 0;
        for (String p10 = a0Var.p(); !TextUtils.isEmpty(p10); p10 = a0Var.p()) {
            if (p10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f21556g.matcher(p10);
                if (!matcher.find()) {
                    throw j2.a(p10.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(p10) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "), null);
                }
                Matcher matcher2 = f21557h.matcher(p10);
                if (!matcher2.find()) {
                    throw j2.a(p10.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(p10) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "), null);
                }
                j11 = aa.i.d((String) ea.a.e(matcher.group(1)));
                j10 = j0.f(Long.parseLong((String) ea.a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = aa.i.a(a0Var);
        if (a10 == null) {
            b(0L);
            return;
        }
        long d10 = aa.i.d((String) ea.a.e(a10.group(1)));
        long b10 = this.f21559b.b(j0.j((j10 + d10) - j11));
        p8.a0 b11 = b(b10 - d10);
        this.f21560c.N(this.f21562e, this.f21563f);
        b11.a(this.f21560c, this.f21563f);
        b11.e(b10, 1, this.f21563f, 0, null);
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f21561d = kVar;
        kVar.n(new x.b(-9223372036854775807L));
    }

    @Override // p8.i
    public int g(p8.j jVar, w wVar) throws IOException {
        ea.a.e(this.f21561d);
        int b10 = (int) jVar.b();
        int i10 = this.f21563f;
        byte[] bArr = this.f21562e;
        if (i10 == bArr.length) {
            this.f21562e = Arrays.copyOf(bArr, ((b10 != -1 ? b10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f21562e;
        int i11 = this.f21563f;
        int c10 = jVar.c(bArr2, i11, bArr2.length - i11);
        if (c10 != -1) {
            int i12 = this.f21563f + c10;
            this.f21563f = i12;
            if (b10 == -1 || i12 != b10) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        jVar.d(this.f21562e, 0, 6, false);
        this.f21560c.N(this.f21562e, 6);
        if (aa.i.b(this.f21560c)) {
            return true;
        }
        jVar.d(this.f21562e, 6, 3, false);
        this.f21560c.N(this.f21562e, 9);
        return aa.i.b(this.f21560c);
    }

    @Override // p8.i
    public void release() {
    }
}
