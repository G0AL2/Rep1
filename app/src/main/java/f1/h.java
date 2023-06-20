package f1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: classes.dex */
class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f29981a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f29982b;

    /* renamed from: c  reason: collision with root package name */
    private final float f29983c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f29984d;

    /* renamed from: e  reason: collision with root package name */
    private final PointF f29985e;

    /* renamed from: f  reason: collision with root package name */
    private float f29986f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f29984d = new float[2];
        this.f29985e = new PointF();
        this.f29981a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f29982b = pathMeasure;
        this.f29983c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t10) {
        return Float.valueOf(this.f29986f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t10, Float f10) {
        this.f29986f = f10.floatValue();
        this.f29982b.getPosTan(this.f29983c * f10.floatValue(), this.f29984d, null);
        PointF pointF = this.f29985e;
        float[] fArr = this.f29984d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f29981a.set(t10, pointF);
    }
}
