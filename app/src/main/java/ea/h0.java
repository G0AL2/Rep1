package ea;

import android.os.Handler;
import android.os.Message;
import ea.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes2.dex */
public final class h0 implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f29678b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29679a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SystemHandlerWrapper.java */
    /* loaded from: classes2.dex */
    public static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f29680a;

        private b() {
        }

        private void b() {
            this.f29680a = null;
            h0.m(this);
        }

        @Override // ea.n.a
        public void a() {
            ((Message) ea.a.e(this.f29680a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) ea.a.e(this.f29680a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, h0 h0Var) {
            this.f29680a = message;
            return this;
        }
    }

    public h0(Handler handler) {
        this.f29679a = handler;
    }

    private static b l() {
        b remove;
        List<b> list = f29678b;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new b();
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(b bVar) {
        List<b> list = f29678b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // ea.n
    public n.a a(int i10) {
        return l().d(this.f29679a.obtainMessage(i10), this);
    }

    @Override // ea.n
    public boolean b(int i10) {
        return this.f29679a.hasMessages(i10);
    }

    @Override // ea.n
    public n.a c(int i10, int i11, int i12, Object obj) {
        return l().d(this.f29679a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // ea.n
    public n.a d(int i10, Object obj) {
        return l().d(this.f29679a.obtainMessage(i10, obj), this);
    }

    @Override // ea.n
    public void e(Object obj) {
        this.f29679a.removeCallbacksAndMessages(obj);
    }

    @Override // ea.n
    public n.a f(int i10, int i11, int i12) {
        return l().d(this.f29679a.obtainMessage(i10, i11, i12), this);
    }

    @Override // ea.n
    public boolean g(int i10) {
        return this.f29679a.sendEmptyMessage(i10);
    }

    @Override // ea.n
    public boolean h(n.a aVar) {
        return ((b) aVar).c(this.f29679a);
    }

    @Override // ea.n
    public boolean i(int i10, long j10) {
        return this.f29679a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // ea.n
    public void j(int i10) {
        this.f29679a.removeMessages(i10);
    }

    @Override // ea.n
    public boolean post(Runnable runnable) {
        return this.f29679a.post(runnable);
    }
}
