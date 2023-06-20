package s;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.i;
import t.o;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private int f36591b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36592c;

    /* renamed from: d  reason: collision with root package name */
    public final e f36593d;

    /* renamed from: e  reason: collision with root package name */
    public final b f36594e;

    /* renamed from: f  reason: collision with root package name */
    public d f36595f;

    /* renamed from: i  reason: collision with root package name */
    p.i f36598i;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<d> f36590a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f36596g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f36597h = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36599a;

        static {
            int[] iArr = new int[b.values().length];
            f36599a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36599a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36599a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36599a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36599a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36599a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36599a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36599a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36599a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f36593d = eVar;
        this.f36594e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        } else if (z10 || o(dVar)) {
            this.f36595f = dVar;
            if (dVar.f36590a == null) {
                dVar.f36590a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f36595f.f36590a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f36596g = i10;
            this.f36597h = i11;
            return true;
        } else {
            return false;
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f36590a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                t.i.a(it.next().f36593d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f36590a;
    }

    public int d() {
        if (this.f36592c) {
            return this.f36591b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f36593d.T() == 8) {
            return 0;
        }
        if (this.f36597h != Integer.MIN_VALUE && (dVar = this.f36595f) != null && dVar.f36593d.T() == 8) {
            return this.f36597h;
        }
        return this.f36596g;
    }

    public final d f() {
        switch (a.f36599a[this.f36594e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f36593d.N;
            case 3:
                return this.f36593d.L;
            case 4:
                return this.f36593d.O;
            case 5:
                return this.f36593d.M;
            default:
                throw new AssertionError(this.f36594e.name());
        }
    }

    public e g() {
        return this.f36593d;
    }

    public p.i h() {
        return this.f36598i;
    }

    public d i() {
        return this.f36595f;
    }

    public b j() {
        return this.f36594e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f36590a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f36590a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f36592c;
    }

    public boolean n() {
        return this.f36595f != null;
    }

    public boolean o(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f36594e;
        if (j10 == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f36599a[bVar.ordinal()]) {
            case 1:
                return (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z11 = j10 == b.LEFT || j10 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return (z11 || j10 == b.CENTER_X) ? true : true;
                }
                return z11;
            case 4:
            case 5:
                boolean z12 = j10 == b.TOP || j10 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return (z12 || j10 == b.CENTER_Y) ? true : true;
                }
                return z12;
            case 6:
                return (j10 == b.LEFT || j10 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f36594e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f36595f;
        if (dVar != null && (hashSet = dVar.f36590a) != null) {
            hashSet.remove(this);
            if (this.f36595f.f36590a.size() == 0) {
                this.f36595f.f36590a = null;
            }
        }
        this.f36590a = null;
        this.f36595f = null;
        this.f36596g = 0;
        this.f36597h = RecyclerView.UNDEFINED_DURATION;
        this.f36592c = false;
        this.f36591b = 0;
    }

    public void q() {
        this.f36592c = false;
        this.f36591b = 0;
    }

    public void r(p.c cVar) {
        p.i iVar = this.f36598i;
        if (iVar == null) {
            this.f36598i = new p.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.h();
        }
    }

    public void s(int i10) {
        this.f36591b = i10;
        this.f36592c = true;
    }

    public String toString() {
        return this.f36593d.r() + ":" + this.f36594e.toString();
    }
}
