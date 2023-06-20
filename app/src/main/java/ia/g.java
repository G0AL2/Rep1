package ia;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f31879a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f31880b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f31881c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f31879a);
        matrix2.getValues(this.f31880b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f31880b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f31879a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f31881c.setValues(this.f31880b);
        return this.f31881c;
    }
}
