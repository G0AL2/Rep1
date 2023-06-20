package com.iab.omid.library.applovin.walking.a;

import com.iab.omid.library.applovin.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f24005a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f24006b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f24007c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f24008d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24005a = linkedBlockingQueue;
        this.f24006b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f24007c.poll();
        this.f24008d = poll;
        if (poll != null) {
            poll.a(this.f24006b);
        }
    }

    @Override // com.iab.omid.library.applovin.walking.a.b.a
    public void a(b bVar) {
        this.f24008d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f24007c.add(bVar);
        if (this.f24008d == null) {
            a();
        }
    }
}
