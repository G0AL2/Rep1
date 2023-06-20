package s4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import t4.b;
import u4.q;

/* compiled from: DebugControllerOverlayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements b {

    /* renamed from: a  reason: collision with root package name */
    private String f36719a;

    /* renamed from: b  reason: collision with root package name */
    private String f36720b;

    /* renamed from: c  reason: collision with root package name */
    private int f36721c;

    /* renamed from: d  reason: collision with root package name */
    private int f36722d;

    /* renamed from: e  reason: collision with root package name */
    private int f36723e;

    /* renamed from: f  reason: collision with root package name */
    private String f36724f;

    /* renamed from: g  reason: collision with root package name */
    private q.b f36725g;

    /* renamed from: i  reason: collision with root package name */
    private int f36727i;

    /* renamed from: j  reason: collision with root package name */
    private int f36728j;

    /* renamed from: p  reason: collision with root package name */
    private int f36734p;

    /* renamed from: q  reason: collision with root package name */
    private int f36735q;

    /* renamed from: r  reason: collision with root package name */
    private int f36736r;

    /* renamed from: s  reason: collision with root package name */
    private int f36737s;

    /* renamed from: t  reason: collision with root package name */
    private int f36738t;

    /* renamed from: u  reason: collision with root package name */
    private long f36739u;

    /* renamed from: v  reason: collision with root package name */
    private String f36740v;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, String> f36726h = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private int f36729k = 80;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f36730l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Matrix f36731m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    private final Rect f36732n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final RectF f36733o = new RectF();

    /* renamed from: w  reason: collision with root package name */
    private int f36741w = -1;

    /* renamed from: x  reason: collision with root package name */
    private int f36742x = 0;

    public a() {
        h();
    }

    private void b(Canvas canvas, String str, Object obj) {
        d(canvas, str, String.valueOf(obj), -1);
    }

    private void c(Canvas canvas, String str, String str2) {
        d(canvas, str, str2, -1);
    }

    private void d(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float measureText = this.f36730l.measureText(str3);
        float measureText2 = this.f36730l.measureText(str2);
        this.f36730l.setColor(1711276032);
        int i11 = this.f36737s;
        int i12 = this.f36738t;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + measureText + measureText2 + 4.0f, i12 + this.f36736r + 8, this.f36730l);
        this.f36730l.setColor(-1);
        canvas.drawText(str3, this.f36737s, this.f36738t, this.f36730l);
        this.f36730l.setColor(i10);
        canvas.drawText(str2, this.f36737s + measureText, this.f36738t, this.f36730l);
        this.f36738t += this.f36736r;
    }

    private static String f(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void g(Rect rect, int i10, int i11) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f36730l.setTextSize(min);
        int i12 = min + 8;
        this.f36736r = i12;
        int i13 = this.f36729k;
        if (i13 == 80) {
            this.f36736r = i12 * (-1);
        }
        this.f36734p = rect.left + 10;
        this.f36735q = i13 == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    @Override // t4.b
    public void a(long j10) {
        this.f36739u = j10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f36730l.setStyle(Paint.Style.STROKE);
        this.f36730l.setStrokeWidth(2.0f);
        this.f36730l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f36730l);
        this.f36730l.setStyle(Paint.Style.FILL);
        this.f36730l.setColor(this.f36742x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f36730l);
        this.f36730l.setStyle(Paint.Style.FILL);
        this.f36730l.setStrokeWidth(0.0f);
        this.f36730l.setColor(-1);
        this.f36737s = this.f36734p;
        this.f36738t = this.f36735q;
        String str = this.f36720b;
        if (str != null) {
            c(canvas, "IDs", f("%s, %s", this.f36719a, str));
        } else {
            c(canvas, "ID", this.f36719a);
        }
        c(canvas, "D", f("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        d(canvas, "I", f("%dx%d", Integer.valueOf(this.f36721c), Integer.valueOf(this.f36722d)), e(this.f36721c, this.f36722d, this.f36725g));
        c(canvas, "I", f("%d KiB", Integer.valueOf(this.f36723e / IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES)));
        String str2 = this.f36724f;
        if (str2 != null) {
            c(canvas, "i format", str2);
        }
        int i10 = this.f36727i;
        if (i10 > 0) {
            c(canvas, "anim", f("f %d, l %d", Integer.valueOf(i10), Integer.valueOf(this.f36728j)));
        }
        q.b bVar = this.f36725g;
        if (bVar != null) {
            b(canvas, "scale", bVar);
        }
        long j10 = this.f36739u;
        if (j10 >= 0) {
            c(canvas, "t", f("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f36740v;
        if (str3 != null) {
            d(canvas, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str3, this.f36741w);
        }
        for (Map.Entry<String, String> entry : this.f36726h.entrySet()) {
            c(canvas, entry.getKey(), entry.getValue());
        }
    }

    int e(int i10, int i11, q.b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            if (bVar != null) {
                Rect rect = this.f36732n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f36731m.reset();
                bVar.a(this.f36731m, this.f36732n, i10, i11, 0.0f, 0.0f);
                RectF rectF = this.f36733o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i10;
                rectF.bottom = i11;
                this.f36731m.mapRect(rectF);
                width = Math.min(width, (int) this.f36733o.width());
                height = Math.min(height, (int) this.f36733o.height());
            }
            float f10 = width;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = height;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int abs = Math.abs(i10 - width);
            int abs2 = Math.abs(i11 - height);
            float f16 = abs;
            if (f16 < f11 && abs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && abs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h() {
        this.f36721c = -1;
        this.f36722d = -1;
        this.f36723e = -1;
        this.f36726h = new HashMap<>();
        this.f36727i = -1;
        this.f36728j = -1;
        this.f36724f = null;
        i(null);
        this.f36739u = -1L;
        this.f36740v = null;
        this.f36741w = -1;
        invalidateSelf();
    }

    public void i(String str) {
        if (str == null) {
            str = "none";
        }
        this.f36719a = str;
        invalidateSelf();
    }

    public void j(int i10, int i11) {
        this.f36721c = i10;
        this.f36722d = i11;
        invalidateSelf();
    }

    public void k(int i10) {
        this.f36723e = i10;
    }

    public void l(String str, int i10) {
        this.f36740v = str;
        this.f36741w = i10;
        invalidateSelf();
    }

    public void m(q.b bVar) {
        this.f36725g = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        g(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
