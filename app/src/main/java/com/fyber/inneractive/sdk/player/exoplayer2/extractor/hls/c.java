package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18215a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18216b;

    /* renamed from: c  reason: collision with root package name */
    public final k f18217c;

    /* renamed from: d  reason: collision with root package name */
    public final a.C0250a[] f18218d;

    /* renamed from: e  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f18219e;

    /* renamed from: f  reason: collision with root package name */
    public final r f18220f;

    /* renamed from: g  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> f18221g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18222h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f18223i;

    /* renamed from: j  reason: collision with root package name */
    public IOException f18224j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0250a f18225k;

    /* renamed from: l  reason: collision with root package name */
    public Uri f18226l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f18227m;

    /* renamed from: n  reason: collision with root package name */
    public String f18228n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f18229o;

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e f18230p;

    /* loaded from: classes.dex */
    public static final class a extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.c {

        /* renamed from: l  reason: collision with root package name */
        public final String f18231l;

        /* renamed from: m  reason: collision with root package name */
        public byte[] f18232m;

        public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i10, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, iVar, i10, obj, bArr);
            this.f18231l = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a f18233a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f18234b;

        /* renamed from: c  reason: collision with root package name */
        public a.C0250a f18235c;

        public b() {
            a();
        }

        public void a() {
            this.f18233a = null;
            this.f18234b = false;
            this.f18235c = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0249c extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a {

        /* renamed from: g  reason: collision with root package name */
        public int f18236g;

        public C0249c(r rVar, int[] iArr) {
            super(rVar, iArr);
            this.f18236g = a(rVar.a(0));
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public void a(long j10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.f18236g, elapsedRealtime)) {
                for (int i10 = this.f19340b - 1; i10 >= 0; i10--) {
                    if (!b(i10, elapsedRealtime)) {
                        this.f18236g = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public int d() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public int e() {
            return this.f18236g;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public Object g() {
            return null;
        }
    }

    public c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar, a.C0250a[] c0250aArr, d dVar, k kVar, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.f18219e = eVar;
        this.f18218d = c0250aArr;
        this.f18217c = kVar;
        this.f18221g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[c0250aArr.length];
        int[] iArr = new int[c0250aArr.length];
        for (int i10 = 0; i10 < c0250aArr.length; i10++) {
            iVarArr[i10] = c0250aArr[i10].f18318b;
            iArr[i10] = i10;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b) dVar;
        this.f18215a = bVar.a(1);
        this.f18216b = bVar.a(3);
        r rVar = new r(iVarArr);
        this.f18220f = rVar;
        this.f18230p = new C0249c(rVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f18226l = uri;
        this.f18227m = bArr;
        this.f18228n = str;
        this.f18229o = bArr2;
    }
}
