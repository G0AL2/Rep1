package d5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import u4.d;

/* compiled from: AnimatedDrawable2.java */
/* loaded from: classes.dex */
public class a extends Drawable implements Animatable, l4.a {

    /* renamed from: o  reason: collision with root package name */
    private static final Class<?> f29068o = a.class;

    /* renamed from: p  reason: collision with root package name */
    private static final d5.b f29069p = new c();

    /* renamed from: a  reason: collision with root package name */
    private y4.a f29070a;

    /* renamed from: b  reason: collision with root package name */
    private f5.b f29071b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f29072c;

    /* renamed from: d  reason: collision with root package name */
    private long f29073d;

    /* renamed from: e  reason: collision with root package name */
    private long f29074e;

    /* renamed from: f  reason: collision with root package name */
    private long f29075f;

    /* renamed from: g  reason: collision with root package name */
    private int f29076g;

    /* renamed from: h  reason: collision with root package name */
    private long f29077h;

    /* renamed from: i  reason: collision with root package name */
    private long f29078i;

    /* renamed from: j  reason: collision with root package name */
    private int f29079j;

    /* renamed from: k  reason: collision with root package name */
    private volatile d5.b f29080k;

    /* renamed from: l  reason: collision with root package name */
    private volatile b f29081l;

    /* renamed from: m  reason: collision with root package name */
    private d f29082m;

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f29083n;

    /* compiled from: AnimatedDrawable2.java */
    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0367a implements Runnable {
        RunnableC0367a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.unscheduleSelf(aVar.f29083n);
            a.this.invalidateSelf();
        }
    }

    /* compiled from: AnimatedDrawable2.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar, f5.b bVar, int i10, boolean z10, boolean z11, long j10, long j11, long j12, long j13, long j14, long j15, long j16);
    }

    public a() {
        this(null);
    }

    private static f5.b c(y4.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new f5.a(aVar);
    }

    private long d() {
        return SystemClock.uptimeMillis();
    }

    private void e() {
        this.f29079j++;
        if (z3.a.u(2)) {
            z3.a.w(f29068o, "Dropped a frame. Count: %s", Integer.valueOf(this.f29079j));
        }
    }

    private void f(long j10) {
        long j11 = this.f29073d + j10;
        this.f29075f = j11;
        scheduleSelf(this.f29083n, j11);
    }

    @Override // l4.a
    public void a() {
        y4.a aVar = this.f29070a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long j10;
        long j11;
        a aVar;
        long j12;
        if (this.f29070a == null || this.f29071b == null) {
            return;
        }
        long d10 = d();
        long max = this.f29072c ? (d10 - this.f29073d) + this.f29078i : Math.max(this.f29074e, 0L);
        int b10 = this.f29071b.b(max, this.f29074e);
        if (b10 == -1) {
            b10 = this.f29070a.a() - 1;
            this.f29080k.b(this);
            this.f29072c = false;
        } else if (b10 == 0 && this.f29076g != -1 && d10 >= this.f29075f) {
            this.f29080k.c(this);
        }
        int i10 = b10;
        boolean g10 = this.f29070a.g(this, canvas, i10);
        if (g10) {
            this.f29080k.a(this, i10);
            this.f29076g = i10;
        }
        if (!g10) {
            e();
        }
        long d11 = d();
        if (this.f29072c) {
            long a10 = this.f29071b.a(d11 - this.f29073d);
            if (a10 != -1) {
                long j13 = this.f29077h + a10;
                f(j13);
                j11 = j13;
            } else {
                j11 = -1;
            }
            j10 = a10;
        } else {
            j10 = -1;
            j11 = -1;
        }
        b bVar = this.f29081l;
        if (bVar != null) {
            bVar.a(this, this.f29071b, i10, g10, this.f29072c, this.f29073d, max, this.f29074e, d10, d11, j10, j11);
            aVar = this;
            j12 = max;
        } else {
            aVar = this;
            j12 = max;
        }
        aVar.f29074e = j12;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        y4.a aVar = this.f29070a;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        y4.a aVar = this.f29070a;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f29072c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        y4.a aVar = this.f29070a;
        if (aVar != null) {
            aVar.d(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f29072c) {
            return false;
        }
        long j10 = i10;
        if (this.f29074e != j10) {
            this.f29074e = j10;
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f29082m == null) {
            this.f29082m = new d();
        }
        this.f29082m.b(i10);
        y4.a aVar = this.f29070a;
        if (aVar != null) {
            aVar.j(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f29082m == null) {
            this.f29082m = new d();
        }
        this.f29082m.c(colorFilter);
        y4.a aVar = this.f29070a;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        y4.a aVar;
        if (this.f29072c || (aVar = this.f29070a) == null || aVar.a() <= 1) {
            return;
        }
        this.f29072c = true;
        long d10 = d();
        this.f29073d = d10;
        this.f29075f = d10;
        this.f29074e = -1L;
        this.f29076g = -1;
        invalidateSelf();
        this.f29080k.d(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f29072c) {
            this.f29072c = false;
            this.f29073d = 0L;
            this.f29075f = 0L;
            this.f29074e = -1L;
            this.f29076g = -1;
            unscheduleSelf(this.f29083n);
            this.f29080k.b(this);
        }
    }

    public a(y4.a aVar) {
        this.f29077h = 8L;
        this.f29078i = 0L;
        this.f29080k = f29069p;
        this.f29081l = null;
        this.f29083n = new RunnableC0367a();
        this.f29070a = aVar;
        this.f29071b = c(aVar);
    }
}
