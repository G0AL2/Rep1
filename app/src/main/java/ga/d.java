package ga;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* compiled from: OrientationListener.java */
/* loaded from: classes2.dex */
final class d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f30706a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f30707b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f30708c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f30709d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private final Display f30710e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f30711f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f30712g;

    /* compiled from: OrientationListener.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f30710e = display;
        this.f30711f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f30707b);
        SensorManager.getOrientation(this.f30707b, this.f30709d);
        return this.f30709d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f30711f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f30712g) {
            c.a(this.f30708c, fArr);
            this.f30712g = true;
        }
        float[] fArr2 = this.f30707b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f30707b, 0, this.f30708c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i11 = 129;
                i12 = 130;
            } else if (i10 != 3) {
                throw new IllegalStateException();
            } else {
                i12 = 1;
            }
            float[] fArr2 = this.f30707b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f30707b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f30706a, sensorEvent.values);
        d(this.f30706a, this.f30710e.getRotation());
        float a10 = a(this.f30706a);
        e(this.f30706a);
        c(this.f30706a);
        b(this.f30706a, a10);
    }
}
