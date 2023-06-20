package l9;

import android.os.SystemClock;
import android.util.Pair;
import ea.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import jb.v;

/* compiled from: BaseUrlExclusionList.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    private final Map<String, Long> f34017a;

    /* renamed from: b */
    private final Map<Integer, Long> f34018b;

    /* renamed from: c */
    private final Map<List<Pair<String, Integer>>, m9.b> f34019c;

    /* renamed from: d */
    private final Random f34020d;

    public b() {
        this(new Random());
    }

    public static /* synthetic */ int a(m9.b bVar, m9.b bVar2) {
        return d(bVar, bVar2);
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) n0.j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<m9.b> c(List<m9.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f34017a);
        h(elapsedRealtime, this.f34018b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m9.b bVar = list.get(i10);
            if (!this.f34017a.containsKey(bVar.f34329b) && !this.f34018b.containsKey(Integer.valueOf(bVar.f34330c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static int d(m9.b bVar, m9.b bVar2) {
        int compare = Integer.compare(bVar.f34330c, bVar2.f34330c);
        return compare != 0 ? compare : bVar.f34329b.compareTo(bVar2.f34329b);
    }

    public static int f(List<m9.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f34330c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private m9.b k(List<m9.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f34331d;
        }
        int nextInt = this.f34020d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            m9.b bVar = list.get(i13);
            i12 += bVar.f34331d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (m9.b) v.c(list);
    }

    public void e(m9.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f34329b, elapsedRealtime, this.f34017a);
        int i10 = bVar.f34330c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f34018b);
        }
    }

    public int g(List<m9.b> list) {
        HashSet hashSet = new HashSet();
        List<m9.b> c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(c10.get(i10).f34330c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f34017a.clear();
        this.f34018b.clear();
        this.f34019c.clear();
    }

    public m9.b j(List<m9.b> list) {
        List<m9.b> c10 = c(list);
        if (c10.size() < 2) {
            return (m9.b) v.b(c10, null);
        }
        Collections.sort(c10, new Comparator() { // from class: l9.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.a((m9.b) obj, (m9.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = c10.get(0).f34330c;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            m9.b bVar = c10.get(i11);
            if (i10 != bVar.f34330c) {
                if (arrayList.size() == 1) {
                    return c10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f34329b, Integer.valueOf(bVar.f34331d)));
                i11++;
            }
        }
        m9.b bVar2 = this.f34019c.get(arrayList);
        if (bVar2 == null) {
            m9.b k10 = k(c10.subList(0, arrayList.size()));
            this.f34019c.put(arrayList, k10);
            return k10;
        }
        return bVar2;
    }

    b(Random random) {
        this.f34019c = new HashMap();
        this.f34020d = random;
        this.f34017a = new HashMap();
        this.f34018b = new HashMap();
    }
}
