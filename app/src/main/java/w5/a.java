package w5;

/* compiled from: CloseableAnimatedImage.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private k5.c f38200c;

    @Override // w5.c
    public synchronized int b() {
        if (!isClosed()) {
            throw null;
        }
        return 0;
    }

    @Override // w5.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
        }
    }

    @Override // w5.c
    public boolean d() {
        return true;
    }

    @Override // w5.h
    public synchronized int getHeight() {
        if (!isClosed()) {
            throw null;
        }
        return 0;
    }

    @Override // w5.h
    public synchronized int getWidth() {
        if (!isClosed()) {
            throw null;
        }
        return 0;
    }

    @Override // w5.c
    public synchronized boolean isClosed() {
        return true;
    }

    public synchronized k5.c l() {
        return this.f38200c;
    }
}
