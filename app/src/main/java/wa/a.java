package wa;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f38524h = new int[3];

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f38525i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f38526j = new int[4];

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f38527k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f38528a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f38529b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f38530c;

    /* renamed from: d  reason: collision with root package name */
    private int f38531d;

    /* renamed from: e  reason: collision with root package name */
    private int f38532e;

    /* renamed from: f  reason: collision with root package name */
    private int f38533f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f38534g;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f38534g;
        if (z10) {
            int[] iArr = f38526j;
            iArr[0] = 0;
            iArr[1] = this.f38533f;
            iArr[2] = this.f38532e;
            iArr[3] = this.f38531d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f38526j;
            iArr2[0] = 0;
            iArr2[1] = this.f38531d;
            iArr2[2] = this.f38532e;
            iArr2[3] = this.f38533f;
        }
        float width = 1.0f - (i10 / (rectF.width() / 2.0f));
        float[] fArr = f38527k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f38529b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f38526j, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f38529b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f38524h;
        iArr[0] = this.f38533f;
        iArr[1] = this.f38532e;
        iArr[2] = this.f38531d;
        Paint paint = this.f38530c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f38525i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f38530c);
        canvas.restore();
    }

    public Paint c() {
        return this.f38528a;
    }

    public void d(int i10) {
        this.f38531d = z.a.f(i10, 68);
        this.f38532e = z.a.f(i10, 20);
        this.f38533f = z.a.f(i10, 0);
    }

    public a(int i10) {
        this.f38534g = new Path();
        d(i10);
        Paint paint = new Paint(4);
        this.f38529b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f38528a = paint2;
        paint2.setColor(this.f38531d);
        this.f38530c = new Paint(paint);
    }
}
