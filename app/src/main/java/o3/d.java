package o3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f34956a;

    /* compiled from: WeakHandler.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Message message);
    }

    public d(Looper looper, a aVar) {
        super(looper);
        this.f34956a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f34956a.get();
        if (aVar == null || message == null) {
            return;
        }
        aVar.a(message);
    }
}
