package ea;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Clock.java */
/* loaded from: classes2.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f29651a = new g0();

    long a();

    n b(Looper looper, Handler.Callback callback);

    void c();

    long elapsedRealtime();
}
