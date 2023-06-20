package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.inmobi.media.fq;
import java.io.IOException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f18413a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final Stack<C0252a> f18414b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    public final f f18415c = new f();

    /* renamed from: d  reason: collision with root package name */
    public c f18416d;

    /* renamed from: e  reason: collision with root package name */
    public int f18417e;

    /* renamed from: f  reason: collision with root package name */
    public int f18418f;

    /* renamed from: g  reason: collision with root package name */
    public long f18419g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0252a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18420a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18421b;

        public C0252a(int i10, long j10) {
            this.f18420a = i10;
            this.f18421b = j10;
        }
    }

    public void a(c cVar) {
        this.f18416d = cVar;
    }

    public final long b(g gVar, int i10) throws IOException, InterruptedException {
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18413a, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f18413a[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    public final String c(g gVar, int i10) throws IOException, InterruptedException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(bArr, 0, i10, false);
        return new String(bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0640, code lost:
        if (r2.i() == r6.getLeastSignificantBits()) goto L334;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06e0  */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.b] */
    /* JADX WARN: Type inference failed for: r4v94, types: [int] */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r35) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 3102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    public final double a(g gVar, int i10) throws IOException, InterruptedException {
        long b10 = b(gVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) b10);
        }
        return Double.longBitsToDouble(b10);
    }
}
