package k8;

import android.os.Looper;
import da.f;
import i9.u;
import j8.p1;
import j8.p2;
import java.util.List;

/* compiled from: AnalyticsCollector.java */
/* loaded from: classes2.dex */
public interface a extends p2.d, i9.b0, f.a, com.google.android.exoplayer2.drm.k {
    void B();

    void I(List<u.b> list, u.b bVar);

    void b(Exception exc);

    void c(String str);

    void c0(p2 p2Var, Looper looper);

    void e(p1 p1Var, m8.i iVar);

    void f(String str);

    void i(m8.e eVar);

    void l(long j10);

    void m(p1 p1Var, m8.i iVar);

    void n(Exception exc);

    void o(m8.e eVar);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onDroppedFrames(int i10, long j10);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void p(m8.e eVar);

    void q(Object obj, long j10);

    void release();

    void s(Exception exc);

    void t(m8.e eVar);

    void u(int i10, long j10, long j11);

    void v(long j10, int i10);
}
