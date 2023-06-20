package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19033a;

        /* renamed from: b  reason: collision with root package name */
        public final long f19034b;

        public a(int i10, long j10) {
            this.f19033a = i10;
            this.f19034b = j10;
        }

        public static a a(g gVar, k kVar) throws IOException, InterruptedException {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(kVar.f19579a, 0, 8, false);
            kVar.e(0);
            return new a(kVar.c(), kVar.f());
        }
    }

    public static b a(g gVar) throws IOException, InterruptedException {
        gVar.getClass();
        k kVar = new k(16);
        if (a.a(gVar, kVar).f19033a != u.a("RIFF")) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(kVar.f19579a, 0, 4, false);
        kVar.e(0);
        int c10 = kVar.c();
        if (c10 != u.a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + c10);
            return null;
        }
        a a10 = a.a(gVar, kVar);
        while (a10.f19033a != u.a("fmt ")) {
            bVar.a((int) a10.f19034b, false);
            a10 = a.a(gVar, kVar);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(a10.f19034b >= 16);
        bVar.a(kVar.f19579a, 0, 16, false);
        kVar.e(0);
        int h10 = kVar.h();
        int h11 = kVar.h();
        int g10 = kVar.g();
        int g11 = kVar.g();
        int h12 = kVar.h();
        int h13 = kVar.h();
        int i10 = (h11 * h13) / 8;
        if (h12 == i10) {
            int a11 = u.a(h13);
            if (a11 == 0) {
                Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + h13);
                return null;
            } else if (h10 != 1 && h10 != 65534) {
                Log.e("WavHeaderReader", "Unsupported WAV format type: " + h10);
                return null;
            } else {
                bVar.a(((int) a10.f19034b) - 16, false);
                return new b(h11, g10, g11, h12, h13, a11);
            }
        }
        throw new l("Expected block alignment: " + i10 + "; got: " + h12);
    }
}
