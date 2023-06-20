package j8;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b9.l;
import java.util.ArrayList;
import l8.y;

/* compiled from: DefaultRenderersFactory.java */
/* loaded from: classes2.dex */
public class l implements a3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32548a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32552e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32554g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32555h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32556i;

    /* renamed from: b  reason: collision with root package name */
    private final b9.j f32549b = new b9.j();

    /* renamed from: c  reason: collision with root package name */
    private int f32550c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f32551d = 5000;

    /* renamed from: f  reason: collision with root package name */
    private b9.q f32553f = b9.q.f4997a;

    public l(Context context) {
        this.f32548a = context;
    }

    @Override // j8.a3
    public w2[] a(Handler handler, com.google.android.exoplayer2.video.d dVar, l8.r rVar, r9.l lVar, c9.e eVar) {
        ArrayList<w2> arrayList = new ArrayList<>();
        h(this.f32548a, this.f32550c, this.f32553f, this.f32552e, handler, dVar, this.f32551d, arrayList);
        l8.s c10 = c(this.f32548a, this.f32554g, this.f32555h, this.f32556i);
        if (c10 != null) {
            b(this.f32548a, this.f32550c, this.f32553f, this.f32552e, c10, handler, rVar, arrayList);
        }
        g(this.f32548a, lVar, handler.getLooper(), this.f32550c, arrayList);
        e(this.f32548a, eVar, handler.getLooper(), this.f32550c, arrayList);
        d(this.f32548a, this.f32550c, arrayList);
        f(this.f32548a, handler, this.f32550c, arrayList);
        return (w2[]) arrayList.toArray(new w2[0]);
    }

    protected void b(Context context, int i10, b9.q qVar, boolean z10, l8.s sVar, Handler handler, l8.r rVar, ArrayList<w2> arrayList) {
        int i11;
        int i12;
        arrayList.add(new l8.d0(context, i(), qVar, z10, handler, rVar, sVar));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (w2) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, l8.r.class, l8.s.class).newInstance(handler, rVar, sVar));
                    ea.r.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        i12 = i11 + 1;
                        arrayList.add(i11, (w2) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, l8.r.class, l8.s.class).newInstance(handler, rVar, sVar));
                        ea.r.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        arrayList.add(i12, (w2) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, l8.r.class, l8.s.class).newInstance(handler, rVar, sVar));
                        ea.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating FLAC extension", e10);
                    }
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                i12 = i11 + 1;
            } catch (ClassNotFoundException unused3) {
            }
            try {
                try {
                    arrayList.add(i11, (w2) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, l8.r.class, l8.s.class).newInstance(handler, rVar, sVar));
                    ea.r.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i11 = i12;
                    i12 = i11;
                    arrayList.add(i12, (w2) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, l8.r.class, l8.s.class).newInstance(handler, rVar, sVar));
                    ea.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                }
                arrayList.add(i12, (w2) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, l8.r.class, l8.s.class).newInstance(handler, rVar, sVar));
                ea.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    protected l8.s c(Context context, boolean z10, boolean z11, boolean z12) {
        return new y.e().g(l8.e.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    protected void d(Context context, int i10, ArrayList<w2> arrayList) {
        arrayList.add(new ga.b());
    }

    protected void e(Context context, c9.e eVar, Looper looper, int i10, ArrayList<w2> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.a(eVar, looper));
    }

    protected void f(Context context, Handler handler, int i10, ArrayList<w2> arrayList) {
    }

    protected void g(Context context, r9.l lVar, Looper looper, int i10, ArrayList<w2> arrayList) {
        arrayList.add(new r9.m(lVar, looper));
    }

    protected void h(Context context, int i10, b9.q qVar, boolean z10, Handler handler, com.google.android.exoplayer2.video.d dVar, long j10, ArrayList<w2> arrayList) {
        int i11;
        arrayList.add(new com.google.android.exoplayer2.video.c(context, i(), qVar, j10, z10, handler, dVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    arrayList.add(size, (w2) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.google.android.exoplayer2.video.d.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, dVar, 50));
                    ea.r.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (w2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.google.android.exoplayer2.video.d.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, dVar, 50));
                    ea.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
                arrayList.add(i11, (w2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.google.android.exoplayer2.video.d.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, dVar, 50));
                ea.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    protected l.b i() {
        return this.f32549b;
    }

    public l j(int i10) {
        this.f32550c = i10;
        return this;
    }
}
