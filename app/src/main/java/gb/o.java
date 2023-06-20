package gb;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f30803a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Queue<n<ResultT>> f30804b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30805c;

    public final void a(e<ResultT> eVar) {
        n<ResultT> poll;
        synchronized (this.f30803a) {
            if (this.f30804b != null && !this.f30805c) {
                this.f30805c = true;
                while (true) {
                    synchronized (this.f30803a) {
                        poll = this.f30804b.poll();
                        if (poll == null) {
                            this.f30805c = false;
                            return;
                        }
                    }
                    poll.a(eVar);
                }
            }
        }
    }

    public final void b(n<ResultT> nVar) {
        synchronized (this.f30803a) {
            if (this.f30804b == null) {
                this.f30804b = new ArrayDeque();
            }
            this.f30804b.add(nVar);
        }
    }
}
