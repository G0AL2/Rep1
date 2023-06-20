package y1;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import d2.i;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    private final Path f39065a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f39066b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f39067c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final List<m> f39068d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final d2.i f39069e;

    /* compiled from: MergePathsContent.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39070a;

        static {
            int[] iArr = new int[i.a.values().length];
            f39070a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39070a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39070a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39070a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39070a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(d2.i iVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            iVar.c();
            this.f39069e = iVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a() {
        for (int i10 = 0; i10 < this.f39068d.size(); i10++) {
            this.f39067c.addPath(this.f39068d.get(i10).getPath());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.f39066b.reset();
        this.f39065a.reset();
        for (int size = this.f39068d.size() - 1; size >= 1; size--) {
            m mVar = this.f39068d.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> j10 = dVar.j();
                for (int size2 = j10.size() - 1; size2 >= 0; size2--) {
                    Path path = j10.get(size2).getPath();
                    path.transform(dVar.k());
                    this.f39066b.addPath(path);
                }
            } else {
                this.f39066b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f39068d.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> j11 = dVar2.j();
            for (int i10 = 0; i10 < j11.size(); i10++) {
                Path path2 = j11.get(i10).getPath();
                path2.transform(dVar2.k());
                this.f39065a.addPath(path2);
            }
        } else {
            this.f39065a.set(mVar2.getPath());
        }
        this.f39067c.op(this.f39065a, this.f39066b, op);
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f39068d.size(); i10++) {
            this.f39068d.get(i10).b(list, list2);
        }
    }

    @Override // y1.j
    public void g(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f39068d.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // y1.m
    public Path getPath() {
        this.f39067c.reset();
        if (this.f39069e.d()) {
            return this.f39067c;
        }
        int i10 = a.f39070a[this.f39069e.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            d(Path.Op.UNION);
        } else if (i10 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            d(Path.Op.XOR);
        }
        return this.f39067c;
    }
}
