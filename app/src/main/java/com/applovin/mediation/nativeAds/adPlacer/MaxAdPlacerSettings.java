package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.v;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f9056a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f9057b = new TreeSet();

    /* renamed from: c  reason: collision with root package name */
    private int f9058c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f9059d = 256;

    /* renamed from: e  reason: collision with root package name */
    private int f9060e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f9056a = str;
    }

    public void addFixedPosition(int i10) {
        this.f9057b.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f9056a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f9057b;
    }

    public int getMaxAdCount() {
        return this.f9059d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f9060e;
    }

    public int getRepeatingInterval() {
        return this.f9058c;
    }

    public boolean hasValidPositioning() {
        return !this.f9057b.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f9058c >= 2;
    }

    public void resetFixedPositions() {
        this.f9057b.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f9059d = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f9060e = i10;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f9058c = i10;
            v.f("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f9058c = 0;
        v.h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f9056a + "', fixedPositions=" + this.f9057b + ", repeatingInterval=" + this.f9058c + ", maxAdCount=" + this.f9059d + ", maxPreloadedAdCount=" + this.f9060e + '}';
    }
}
