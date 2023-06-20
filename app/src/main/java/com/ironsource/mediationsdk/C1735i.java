package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1735i {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f27082a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f27083b;

    /* renamed from: com.ironsource.mediationsdk.i$a */
    /* loaded from: classes3.dex */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C1735i(List<String> list, int i10) {
        this.f27083b = i10;
        for (String str : list) {
            ArrayList<a> arrayList = new ArrayList<>();
            this.f27082a.put(str, arrayList);
        }
    }

    public final String a(String str) {
        ArrayList<a> arrayList = this.f27082a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                sb2.append(str2);
                sb2.append(it.next().ordinal());
                str2 = sb2.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb2 = new StringBuilder();
            }
        }
        return str2;
    }

    public final void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f27083b == 0) {
            return;
        }
        for (String str : this.f27082a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f27082a.get(str);
            if (this.f27083b != -1 && arrayList.size() == this.f27083b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
