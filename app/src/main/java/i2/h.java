package i2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import y1.u;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f31527a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Path> f31528b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<Path> f31529c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<float[]> f31530d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static final float f31531e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    class b extends ThreadLocal<Path> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    class c extends ThreadLocal<Path> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    class d extends ThreadLocal<float[]> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f10, float f11, float f12) {
        com.airbnb.lottie.c.a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f31527a.get();
        Path path2 = f31528b.get();
        Path path3 = f31529c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            com.airbnb.lottie.c.b("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = g.f(min, length);
                max = g.f(max, length);
            }
            if (min < 0.0f) {
                min = g.f(min, length);
            }
            if (max < 0.0f) {
                max = g.f(max, length);
            }
            int i10 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i10 == 0) {
                path.reset();
                com.airbnb.lottie.c.b("applyTrimPathIfNeeded");
                return;
            }
            if (i10 >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.airbnb.lottie.c.b("applyTrimPathIfNeeded");
        } else {
            com.airbnb.lottie.c.b("applyTrimPathIfNeeded");
        }
    }

    public static void b(Path path, u uVar) {
        if (uVar == null || uVar.k()) {
            return;
        }
        a(path, ((z1.d) uVar.i()).p() / 100.0f, ((z1.d) uVar.e()).p() / 100.0f, ((z1.d) uVar.g()).p() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f10 = pointF.x;
            float f11 = pointF2.x;
            float f12 = pointF2.y;
            path.cubicTo(pointF3.x + f10, pointF.y + pointF3.y, f11 + pointF4.x, f12 + pointF4.y, f11, f12);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f31530d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f31531e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f31530d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (((float) IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * f10) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean j(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static boolean k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Bitmap l(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void m(Canvas canvas, RectF rectF, Paint paint) {
        n(canvas, rectF, paint, 31);
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint, int i10) {
        com.airbnb.lottie.c.a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i10);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        com.airbnb.lottie.c.b("Utils#saveLayer");
    }
}
