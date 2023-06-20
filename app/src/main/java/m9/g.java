package m9;

import java.util.Collections;
import java.util.List;

/* compiled from: Period.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f34366a;

    /* renamed from: b  reason: collision with root package name */
    public final long f34367b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f34368c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f34369d;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f34368c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f34368c.get(i11).f34323b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f34366a = str;
        this.f34367b = j10;
        this.f34368c = Collections.unmodifiableList(list);
        this.f34369d = Collections.unmodifiableList(list2);
    }
}
