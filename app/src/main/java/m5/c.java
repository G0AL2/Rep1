package m5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import k5.b;

/* compiled from: AnimatedImageCompositor.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final k5.a f34236a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34237b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f34238c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedImageCompositor.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34239a;

        static {
            int[] iArr = new int[EnumC0451c.values().length];
            f34239a = iArr;
            try {
                iArr[EnumC0451c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34239a[EnumC0451c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34239a[EnumC0451c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34239a[EnumC0451c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: AnimatedImageCompositor.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, Bitmap bitmap);

        c4.a<Bitmap> b(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedImageCompositor.java */
    /* renamed from: m5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0451c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public c(k5.a aVar, b bVar) {
        this.f34236a = aVar;
        this.f34237b = bVar;
        Paint paint = new Paint();
        this.f34238c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, k5.b bVar) {
        int i10 = bVar.f33149a;
        int i11 = bVar.f33150b;
        canvas.drawRect(i10, i11, i10 + bVar.f33151c, i11 + bVar.f33152d, this.f34238c);
    }

    private EnumC0451c b(int i10) {
        k5.b e10 = this.f34236a.e(i10);
        b.EnumC0427b enumC0427b = e10.f33154f;
        if (enumC0427b == b.EnumC0427b.DISPOSE_DO_NOT) {
            return EnumC0451c.REQUIRED;
        }
        if (enumC0427b == b.EnumC0427b.DISPOSE_TO_BACKGROUND) {
            if (c(e10)) {
                return EnumC0451c.NOT_REQUIRED;
            }
            return EnumC0451c.REQUIRED;
        } else if (enumC0427b == b.EnumC0427b.DISPOSE_TO_PREVIOUS) {
            return EnumC0451c.SKIP;
        } else {
            return EnumC0451c.ABORT;
        }
    }

    private boolean c(k5.b bVar) {
        return bVar.f33149a == 0 && bVar.f33150b == 0 && bVar.f33151c == this.f34236a.h() && bVar.f33152d == this.f34236a.g();
    }

    private boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        k5.b e10 = this.f34236a.e(i10);
        k5.b e11 = this.f34236a.e(i10 - 1);
        if (e10.f33153e == b.a.NO_BLEND && c(e10)) {
            return true;
        }
        return e11.f33154f == b.EnumC0427b.DISPOSE_TO_BACKGROUND && c(e11);
    }

    private int e(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.f34239a[b(i10).ordinal()];
            if (i11 == 1) {
                k5.b e10 = this.f34236a.e(i10);
                c4.a<Bitmap> b10 = this.f34237b.b(i10);
                if (b10 != null) {
                    try {
                        canvas.drawBitmap(b10.y(), 0.0f, 0.0f, (Paint) null);
                        if (e10.f33154f == b.EnumC0427b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, e10);
                        }
                        return i10 + 1;
                    } finally {
                        b10.close();
                    }
                } else if (d(i10)) {
                    return i10;
                }
            } else if (i11 == 2) {
                return i10 + 1;
            } else {
                if (i11 == 3) {
                    return i10;
                }
            }
            i10--;
        }
        return 0;
    }

    public void f(int i10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int e10 = !d(i10) ? e(i10 - 1, canvas) : i10; e10 < i10; e10++) {
            k5.b e11 = this.f34236a.e(e10);
            b.EnumC0427b enumC0427b = e11.f33154f;
            if (enumC0427b != b.EnumC0427b.DISPOSE_TO_PREVIOUS) {
                if (e11.f33153e == b.a.NO_BLEND) {
                    a(canvas, e11);
                }
                this.f34236a.c(e10, canvas);
                this.f34237b.a(e10, bitmap);
                if (enumC0427b == b.EnumC0427b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, e11);
                }
            }
        }
        k5.b e12 = this.f34236a.e(i10);
        if (e12.f33153e == b.a.NO_BLEND) {
            a(canvas, e12);
        }
        this.f34236a.c(i10, canvas);
    }
}
