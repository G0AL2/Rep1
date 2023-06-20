package ga;

import android.opengl.Matrix;
import ea.i0;

/* compiled from: FrameRotationQueue.java */
/* loaded from: classes2.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f30702a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f30703b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final i0<float[]> f30704c = new i0<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f30705d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] j11 = this.f30704c.j(j10);
        if (j11 == null) {
            return false;
        }
        b(this.f30703b, j11);
        if (!this.f30705d) {
            a(this.f30702a, this.f30703b);
            this.f30705d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f30702a, 0, this.f30703b, 0);
        return true;
    }

    public void d() {
        this.f30704c.c();
        this.f30705d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f30704c.a(j10, fArr);
    }
}
