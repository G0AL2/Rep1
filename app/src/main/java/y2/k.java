package y2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Urls.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f39249f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f39250g = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a> f39251a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39252b;

    /* renamed from: c  reason: collision with root package name */
    private int f39253c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f39254d;

    /* renamed from: e  reason: collision with root package name */
    private final int f39255e;

    /* compiled from: Urls.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final String f39256a;

        /* renamed from: b  reason: collision with root package name */
        int f39257b;

        a(k kVar, String str) {
            this.f39256a = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            k.f39249f.add(this.f39256a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            k.f39250g.add(this.f39256a);
        }

        public String toString() {
            return this.f39256a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(List<String> list) {
        int i10;
        if (!list.isEmpty()) {
            int size = list.size();
            this.f39252b = size;
            this.f39251a = new ArrayList<>(size);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String str : list) {
                a aVar = new a(this, str);
                if (f39249f.contains(str)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(aVar);
                } else if (f39250g.contains(str)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(aVar);
                } else {
                    this.f39251a.add(aVar);
                }
            }
            if (arrayList != null) {
                this.f39251a.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f39251a.addAll(arrayList2);
            }
            Integer num = e.f39197k;
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            } else {
                i10 = this.f39252b >= 2 ? 1 : 2;
            }
            this.f39255e = i10;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f39254d < this.f39255e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b() {
        if (a()) {
            int i10 = this.f39253c + 1;
            if (i10 >= this.f39252b - 1) {
                this.f39253c = -1;
                this.f39254d++;
            } else {
                this.f39253c = i10;
            }
            a aVar = this.f39251a.get(i10);
            aVar.f39257b = (this.f39254d * this.f39252b) + this.f39253c;
            return aVar;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str) {
        ArrayList<a> arrayList = new ArrayList<>(1);
        this.f39251a = arrayList;
        arrayList.add(new a(this, str));
        this.f39252b = 1;
        this.f39255e = 1;
    }
}
