package q;

import java.text.DecimalFormat;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected a f35740a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f35741b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f35742c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f35743d;

    /* renamed from: e  reason: collision with root package name */
    private String f35744e;

    public float a(float f10) {
        return (float) this.f35740a.a(f10, 0);
    }

    public String toString() {
        String str = this.f35744e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f35743d; i10++) {
            str = str + "[" + this.f35741b[i10] + " , " + decimalFormat.format(this.f35742c[i10]) + "] ";
        }
        return str;
    }
}
