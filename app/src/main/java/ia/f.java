package ia;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty.java */
/* loaded from: classes.dex */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f31878a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f31878a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f31878a.set(imageView.getImageMatrix());
        return this.f31878a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
