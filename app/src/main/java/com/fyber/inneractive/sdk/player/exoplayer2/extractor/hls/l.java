package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f18304g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f18305h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final String f18306a;

    /* renamed from: b  reason: collision with root package name */
    public final r f18307b;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f18309d;

    /* renamed from: f  reason: collision with root package name */
    public int f18311f;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18308c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();

    /* renamed from: e  reason: collision with root package name */
    public byte[] f18310e = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];

    public l(String str, r rVar) {
        this.f18306a = str;
        this.f18307b = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.f18309d = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws IOException, InterruptedException {
        Matcher matcher;
        String d10;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        int i10 = (int) bVar.f18143b;
        int i11 = this.f18311f;
        byte[] bArr = this.f18310e;
        if (i11 == bArr.length) {
            this.f18310e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f18310e;
        int i12 = this.f18311f;
        int a10 = bVar.a(bArr2, i12, bArr2.length - i12);
        if (a10 != -1) {
            int i13 = this.f18311f + a10;
            this.f18311f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(this.f18310e);
        try {
            Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f19337a;
            String d11 = kVar.d();
            if (d11 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f19338b.matcher(d11).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + d11);
            }
            long j10 = 0;
            long j11 = 0;
            while (true) {
                String d12 = kVar.d();
                if (TextUtils.isEmpty(d12)) {
                    while (true) {
                        String d13 = kVar.d();
                        if (d13 == null) {
                            matcher = null;
                            break;
                        } else if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f19337a.matcher(d13).matches()) {
                            do {
                                d10 = kVar.d();
                                if (d10 != null) {
                                }
                            } while (!d10.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.f19336a.matcher(d13);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        a(0L);
                    } else {
                        long a11 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long a12 = this.f18307b.a((j11 + a11) - j10);
                        n a13 = a(a12 - a11);
                        this.f18308c.a(this.f18310e, this.f18311f);
                        a13.a(this.f18308c, this.f18311f);
                        a13.a(a12, 1, this.f18311f, 0, null);
                    }
                    return -1;
                } else if (d12.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f18304g.matcher(d12);
                    if (matcher2.find()) {
                        Matcher matcher3 = f18305h.matcher(d12);
                        if (matcher3.find()) {
                            j10 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                            j11 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.l("X-TIMESTAMP-MAP doesn't contain media timestamp: " + d12);
                        }
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.l("X-TIMESTAMP-MAP doesn't contain local timestamp: " + d12);
                    }
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.l(e10);
        }
    }

    public final n a(long j10) {
        n a10 = this.f18309d.a(0, 3);
        a10.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(null, "text/vtt", null, -1, 0, this.f18306a, -1, null, j10, Collections.emptyList()));
        this.f18309d.c();
        return a10;
    }
}
