package z4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import o5.f;
import y4.c;
import y4.d;

/* compiled from: BitmapAnimationBackend.java */
/* loaded from: classes.dex */
public class a implements y4.a, c.b {

    /* renamed from: m  reason: collision with root package name */
    private static final Class<?> f39978m = a.class;

    /* renamed from: a  reason: collision with root package name */
    private final f f39979a;

    /* renamed from: b  reason: collision with root package name */
    private final b f39980b;

    /* renamed from: c  reason: collision with root package name */
    private final d f39981c;

    /* renamed from: d  reason: collision with root package name */
    private final c f39982d;

    /* renamed from: e  reason: collision with root package name */
    private final b5.a f39983e;

    /* renamed from: f  reason: collision with root package name */
    private final b5.b f39984f;

    /* renamed from: h  reason: collision with root package name */
    private Rect f39986h;

    /* renamed from: i  reason: collision with root package name */
    private int f39987i;

    /* renamed from: j  reason: collision with root package name */
    private int f39988j;

    /* renamed from: l  reason: collision with root package name */
    private InterfaceC0564a f39990l;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap.Config f39989k = Bitmap.Config.ARGB_8888;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f39985g = new Paint(6);

    /* compiled from: BitmapAnimationBackend.java */
    /* renamed from: z4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0564a {
        void a(a aVar, int i10);

        void b(a aVar, int i10, int i11);

        void c(a aVar, int i10);
    }

    public a(f fVar, b bVar, d dVar, c cVar, b5.a aVar, b5.b bVar2) {
        this.f39979a = fVar;
        this.f39980b = bVar;
        this.f39981c = dVar;
        this.f39982d = cVar;
        this.f39983e = aVar;
        this.f39984f = bVar2;
        n();
    }

    private boolean k(int i10, c4.a<Bitmap> aVar, Canvas canvas, int i11) {
        if (c4.a.C(aVar)) {
            if (this.f39986h == null) {
                canvas.drawBitmap(aVar.y(), 0.0f, 0.0f, this.f39985g);
            } else {
                canvas.drawBitmap(aVar.y(), (Rect) null, this.f39986h, this.f39985g);
            }
            if (i11 != 3) {
                this.f39980b.f(i10, aVar, i11);
            }
            InterfaceC0564a interfaceC0564a = this.f39990l;
            if (interfaceC0564a != null) {
                interfaceC0564a.b(this, i10, i11);
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean l(Canvas canvas, int i10, int i11) {
        c4.a<Bitmap> e10;
        boolean k10;
        int i12 = 3;
        boolean z10 = false;
        try {
            if (i11 == 0) {
                e10 = this.f39980b.e(i10);
                k10 = k(i10, e10, canvas, 0);
                i12 = 1;
            } else if (i11 == 1) {
                e10 = this.f39980b.b(i10, this.f39987i, this.f39988j);
                if (m(i10, e10) && k(i10, e10, canvas, 1)) {
                    z10 = true;
                }
                k10 = z10;
                i12 = 2;
            } else if (i11 == 2) {
                e10 = this.f39979a.b(this.f39987i, this.f39988j, this.f39989k);
                if (m(i10, e10) && k(i10, e10, canvas, 2)) {
                    z10 = true;
                }
                k10 = z10;
            } else if (i11 != 3) {
                return false;
            } else {
                e10 = this.f39980b.a(i10);
                k10 = k(i10, e10, canvas, 3);
                i12 = -1;
            }
            c4.a.w(e10);
            return (k10 || i12 == -1) ? k10 : l(canvas, i10, i12);
        } catch (RuntimeException e11) {
            z3.a.D(f39978m, "Failed to create frame bitmap", e11);
            return false;
        } finally {
            c4.a.w(null);
        }
    }

    private boolean m(int i10, c4.a<Bitmap> aVar) {
        if (c4.a.C(aVar)) {
            boolean a10 = this.f39982d.a(i10, aVar.y());
            if (!a10) {
                c4.a.w(aVar);
            }
            return a10;
        }
        return false;
    }

    private void n() {
        int e10 = this.f39982d.e();
        this.f39987i = e10;
        if (e10 == -1) {
            Rect rect = this.f39986h;
            this.f39987i = rect == null ? -1 : rect.width();
        }
        int c10 = this.f39982d.c();
        this.f39988j = c10;
        if (c10 == -1) {
            Rect rect2 = this.f39986h;
            this.f39988j = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // y4.d
    public int a() {
        return this.f39981c.a();
    }

    @Override // y4.d
    public int b() {
        return this.f39981c.b();
    }

    @Override // y4.a
    public int c() {
        return this.f39988j;
    }

    @Override // y4.a
    public void clear() {
        this.f39980b.clear();
    }

    @Override // y4.a
    public void d(Rect rect) {
        this.f39986h = rect;
        this.f39982d.d(rect);
        n();
    }

    @Override // y4.a
    public int e() {
        return this.f39987i;
    }

    @Override // y4.a
    public void f(ColorFilter colorFilter) {
        this.f39985g.setColorFilter(colorFilter);
    }

    @Override // y4.a
    public boolean g(Drawable drawable, Canvas canvas, int i10) {
        b5.b bVar;
        InterfaceC0564a interfaceC0564a;
        InterfaceC0564a interfaceC0564a2 = this.f39990l;
        if (interfaceC0564a2 != null) {
            interfaceC0564a2.a(this, i10);
        }
        boolean l10 = l(canvas, i10, 0);
        if (!l10 && (interfaceC0564a = this.f39990l) != null) {
            interfaceC0564a.c(this, i10);
        }
        b5.a aVar = this.f39983e;
        if (aVar != null && (bVar = this.f39984f) != null) {
            aVar.a(bVar, this.f39980b, this, i10);
        }
        return l10;
    }

    @Override // y4.c.b
    public void h() {
        clear();
    }

    @Override // y4.d
    public int i(int i10) {
        return this.f39981c.i(i10);
    }

    @Override // y4.a
    public void j(int i10) {
        this.f39985g.setAlpha(i10);
    }
}
