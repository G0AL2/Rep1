package q;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    protected a f35745a;

    /* renamed from: e  reason: collision with root package name */
    protected int f35749e;

    /* renamed from: f  reason: collision with root package name */
    protected String f35750f;

    /* renamed from: i  reason: collision with root package name */
    protected long f35753i;

    /* renamed from: b  reason: collision with root package name */
    protected int f35746b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f35747c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f35748d = (float[][]) Array.newInstance(float.class, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    protected float[] f35751g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    protected boolean f35752h = false;

    /* renamed from: j  reason: collision with root package name */
    protected float f35754j = Float.NaN;

    public String toString() {
        String str = this.f35750f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f35749e; i10++) {
            str = str + "[" + this.f35747c[i10] + " , " + decimalFormat.format(this.f35748d[i10]) + "] ";
        }
        return str;
    }
}
