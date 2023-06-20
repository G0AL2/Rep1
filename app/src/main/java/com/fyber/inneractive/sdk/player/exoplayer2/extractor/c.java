package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final Constructor<? extends f> f18148a;

    static {
        Constructor<? extends f> constructor;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f18148a = constructor;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public synchronized f[] a() {
        f[] fVarArr;
        Constructor<? extends f> constructor = f18148a;
        fVarArr = new f[constructor == null ? 11 : 12];
        fVarArr[0] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a(), 0);
        fVarArr[1] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d(0, null);
        fVarArr[2] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f();
        fVarArr[3] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b(0, -9223372036854775807L);
        fVarArr[4] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(0L);
        fVarArr[5] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(0L);
        fVarArr[6] = new u(1, new r(0L), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e(0, Collections.emptyList()));
        fVarArr[7] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.b();
        fVarArr[8] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c();
        fVarArr[9] = new p(new r(0L));
        fVarArr[10] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.a();
        if (constructor != null) {
            try {
                fVarArr[11] = constructor.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }
        return fVarArr;
    }
}
