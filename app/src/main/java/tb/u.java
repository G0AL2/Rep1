package tb;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes3.dex */
class u implements pc.d, pc.c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<pc.b<Object>, Executor>> f37304a = new HashMap();

    /* renamed from: b */
    private Queue<pc.a<?>> f37305b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f37306c;

    public u(Executor executor) {
        this.f37306c = executor;
    }

    public static /* synthetic */ void d(Map.Entry entry, pc.a aVar) {
        g(entry, aVar);
    }

    private synchronized Set<Map.Entry<pc.b<Object>, Executor>> f(pc.a<?> aVar) {
        ConcurrentHashMap<pc.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f37304a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public static /* synthetic */ void g(Map.Entry entry, pc.a aVar) {
        ((pc.b) entry.getKey()).a(aVar);
    }

    @Override // pc.d
    public synchronized <T> void a(Class<T> cls, Executor executor, pc.b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        d0.b(executor);
        if (!this.f37304a.containsKey(cls)) {
            this.f37304a.put(cls, new ConcurrentHashMap<>());
        }
        this.f37304a.get(cls).put(bVar, executor);
    }

    @Override // pc.c
    public void b(final pc.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue<pc.a<?>> queue = this.f37305b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<pc.b<Object>, Executor> entry : f(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: tb.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.d(entry, aVar);
                    }
                });
            }
        }
    }

    @Override // pc.d
    public <T> void c(Class<T> cls, pc.b<? super T> bVar) {
        a(cls, this.f37306c, bVar);
    }

    public void e() {
        Queue<pc.a<?>> queue;
        synchronized (this) {
            queue = this.f37305b;
            if (queue != null) {
                this.f37305b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (pc.a<?> aVar : queue) {
                b(aVar);
            }
        }
    }
}
