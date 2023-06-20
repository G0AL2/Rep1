package q;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private a f35732a;

    /* renamed from: b  reason: collision with root package name */
    private String f35733b;

    /* renamed from: c  reason: collision with root package name */
    private int f35734c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f35735d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f35736e = 0;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<b> f35737f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f35738a;

        /* renamed from: b  reason: collision with root package name */
        float f35739b;
    }

    public float a(float f10) {
        return (float) this.f35732a.a(f10);
    }

    public String toString() {
        String str = this.f35733b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f35737f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + "[" + next.f35738a + " , " + decimalFormat.format(next.f35739b) + "] ";
        }
        return str;
    }
}
