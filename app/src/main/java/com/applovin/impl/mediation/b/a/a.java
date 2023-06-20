package com.applovin.impl.mediation.b.a;

import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final l<Integer> f7333a = new l<>();

    /* renamed from: b  reason: collision with root package name */
    private final TreeSet<Integer> f7334b = new TreeSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, MaxAd> f7335c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f7336d;

    /* renamed from: e  reason: collision with root package name */
    private int f7337e;

    public a(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private int a(int i10, boolean z10) {
        int d10 = this.f7333a.d(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + d10;
            while (d10 < this.f7333a.size() && i11 >= this.f7333a.a(d10).intValue()) {
                i11++;
                d10++;
            }
        }
        return d10;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            v.i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f7333a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f7333a.isEmpty()) {
            this.f7333a.a((l<Integer>) Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = this.f7333a.a().intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f7333a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            }
            this.f7333a.a((l<Integer>) Integer.valueOf(intValue));
        }
    }

    private void c(int i10, int i11) {
        if (this.f7335c.containsKey(Integer.valueOf(i10))) {
            this.f7335c.put(Integer.valueOf(i11), this.f7335c.get(Integer.valueOf(i10)));
            this.f7334b.add(Integer.valueOf(i11));
            this.f7335c.remove(Integer.valueOf(i10));
            this.f7334b.remove(Integer.valueOf(i10));
        }
    }

    public int a() {
        int i10 = this.f7336d;
        if (i10 != -1 && this.f7337e != -1) {
            while (i10 <= this.f7337e) {
                if (a(i10) && !b(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void a(int i10, int i11) {
        this.f7336d = i10;
        this.f7337e = i11;
    }

    public void a(MaxAd maxAd, int i10) {
        this.f7335c.put(Integer.valueOf(i10), maxAd);
        this.f7334b.add(Integer.valueOf(i10));
    }

    public void a(Collection<Integer> collection) {
        for (Integer num : collection) {
            this.f7335c.remove(num);
            this.f7334b.remove(num);
        }
    }

    public boolean a(int i10) {
        return this.f7333a.contains(Integer.valueOf(i10));
    }

    public Collection<Integer> b() {
        return new TreeSet((SortedSet) this.f7334b);
    }

    public void b(int i10, int i11) {
        i(i10);
        h(i11);
    }

    public boolean b(int i10) {
        return this.f7334b.contains(Integer.valueOf(i10));
    }

    public MaxAd c(int i10) {
        return this.f7335c.get(Integer.valueOf(i10));
    }

    public void c() {
        this.f7335c.clear();
        this.f7334b.clear();
    }

    public Collection<Integer> d(int i10) {
        return new TreeSet((SortedSet) this.f7334b.tailSet(Integer.valueOf(i10), false));
    }

    public int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public int f(int i10) {
        return i10 + a(i10, false);
    }

    public int g(int i10) {
        if (a(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public void h(int i10) {
        int c10 = this.f7333a.c(Integer.valueOf(i10));
        for (int size = this.f7333a.size() - 1; size >= c10; size--) {
            Integer a10 = this.f7333a.a(size);
            int intValue = a10.intValue() + 1;
            c(a10.intValue(), intValue);
            this.f7333a.a(size, Integer.valueOf(intValue));
        }
    }

    public void i(int i10) {
        int c10 = this.f7333a.c(Integer.valueOf(i10));
        if (a(i10)) {
            this.f7335c.remove(Integer.valueOf(i10));
            this.f7334b.remove(Integer.valueOf(i10));
            this.f7333a.b(c10);
        }
        while (c10 < this.f7333a.size()) {
            Integer a10 = this.f7333a.a(c10);
            int intValue = a10.intValue() - 1;
            c(a10.intValue(), intValue);
            this.f7333a.a(c10, Integer.valueOf(intValue));
            c10++;
        }
    }
}
