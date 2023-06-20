package z5;

import android.graphics.Bitmap;

/* compiled from: BitmapCounter.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f39991a;

    /* renamed from: b  reason: collision with root package name */
    private long f39992b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39993c;

    /* renamed from: d  reason: collision with root package name */
    private final int f39994d;

    /* renamed from: e  reason: collision with root package name */
    private final c4.h<Bitmap> f39995e;

    /* compiled from: BitmapCounter.java */
    /* renamed from: z5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0565a implements c4.h<Bitmap> {
        C0565a() {
        }

        @Override // c4.h
        /* renamed from: b */
        public void a(Bitmap bitmap) {
            try {
                a.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public a(int i10, int i11) {
        y3.k.b(Boolean.valueOf(i10 > 0));
        y3.k.b(Boolean.valueOf(i11 > 0));
        this.f39993c = i10;
        this.f39994d = i11;
        this.f39995e = new C0565a();
    }

    public synchronized void a(Bitmap bitmap) {
        int e10 = com.facebook.imageutils.a.e(bitmap);
        y3.k.c(this.f39991a > 0, "No bitmaps registered.");
        long j10 = e10;
        y3.k.d(j10 <= this.f39992b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(e10), Long.valueOf(this.f39992b));
        this.f39992b -= j10;
        this.f39991a--;
    }

    public synchronized int b() {
        return this.f39991a;
    }

    public synchronized int c() {
        return this.f39993c;
    }

    public synchronized int d() {
        return this.f39994d;
    }

    public c4.h<Bitmap> e() {
        return this.f39995e;
    }

    public synchronized long f() {
        return this.f39992b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int e10 = com.facebook.imageutils.a.e(bitmap);
        int i10 = this.f39991a;
        if (i10 < this.f39993c) {
            long j10 = this.f39992b;
            long j11 = e10;
            if (j10 + j11 <= this.f39994d) {
                this.f39991a = i10 + 1;
                this.f39992b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}
