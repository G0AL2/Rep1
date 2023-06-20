package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class l extends g {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f19445g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f19446h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f19447i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public l(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static File a(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r16.renameTo(r1) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l a(java.io.File r16, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r17) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l.a(java.io.File, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i):com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l");
    }
}
