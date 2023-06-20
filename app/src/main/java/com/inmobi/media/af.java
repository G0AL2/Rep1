package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* compiled from: BackgroundRunnable.java */
/* loaded from: classes3.dex */
public abstract class af<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24509a = af.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Handler f24510b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private byte f24511c;

    /* renamed from: f  reason: collision with root package name */
    WeakReference<T> f24512f;

    /* JADX INFO: Access modifiers changed from: protected */
    public af(T t10, byte b10) {
        this.f24511c = (byte) -1;
        this.f24511c = b10;
        this.f24512f = new WeakReference<>(t10);
    }

    public abstract void a();

    public void b() {
        hu.a((byte) 1, f24509a, "Could not execute runnable due to OutOfMemory.");
        T t10 = this.f24512f.get();
        if (t10 != null) {
            hq.a().a(t10.hashCode());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
        this.f24510b.post(new Runnable() { // from class: com.inmobi.media.af.1
            @Override // java.lang.Runnable
            public final void run() {
                T t10 = af.this.f24512f.get();
                if (t10 != null) {
                    hq a10 = hq.a();
                    int hashCode = t10.hashCode();
                    Queue<af> queue = a10.f25691a.get(hashCode);
                    if (queue != null) {
                        queue.poll();
                        af peek = queue.peek();
                        if (queue.size() > 0 && peek != null) {
                            a10.a(peek);
                        }
                        if (queue.size() == 0) {
                            a10.f25691a.remove(hashCode);
                        }
                    }
                }
            }
        });
    }
}
