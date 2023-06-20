package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b2 {

    /* renamed from: a  reason: collision with root package name */
    private String f13921a;

    /* renamed from: b  reason: collision with root package name */
    private String f13922b;

    /* renamed from: c  reason: collision with root package name */
    private String f13923c;

    /* renamed from: d  reason: collision with root package name */
    private String f13924d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<n2> f13925e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<com.chartboost.sdk.Model.b> f13926f;

    public b2() {
        this.f13921a = "";
        this.f13922b = "";
        this.f13923c = "USD";
        this.f13924d = "";
        this.f13925e = new ArrayList<>();
        this.f13926f = new ArrayList<>();
    }

    private String e() {
        Iterator<n2> it;
        String str = "";
        int i10 = 0;
        while (this.f13925e.iterator().hasNext()) {
            str = "Seatbid " + i10 + " : " + it.next().toString() + "\n";
            i10++;
        }
        return str;
    }

    public ArrayList<com.chartboost.sdk.Model.b> a() {
        return this.f13926f;
    }

    public HashMap<String, com.chartboost.sdk.Model.b> b() {
        HashMap<String, com.chartboost.sdk.Model.b> hashMap = new HashMap<>();
        Iterator<com.chartboost.sdk.Model.b> it = this.f13926f.iterator();
        while (it.hasNext()) {
            com.chartboost.sdk.Model.b next = it.next();
            hashMap.put(next.f13682b, next);
        }
        return hashMap;
    }

    public String c() {
        return this.f13921a;
    }

    public ArrayList<n2> d() {
        return this.f13925e;
    }

    public String toString() {
        return "id: " + this.f13921a + "\nnbr: " + this.f13922b + "\ncurrency: " + this.f13923c + "\nbidId: " + this.f13924d + "\nseatbid: " + e() + "\n";
    }

    public b2(String str, String str2, String str3, String str4, ArrayList<n2> arrayList, ArrayList<com.chartboost.sdk.Model.b> arrayList2) {
        this.f13921a = str;
        this.f13922b = str2;
        this.f13923c = str3;
        this.f13924d = str4;
        this.f13925e = arrayList;
        this.f13926f = arrayList2;
    }
}
