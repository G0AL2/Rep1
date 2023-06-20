package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n2 {

    /* renamed from: a  reason: collision with root package name */
    private String f14227a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<i0> f14228b;

    public n2() {
        this.f14227a = "";
        this.f14228b = new ArrayList<>();
    }

    private String a() {
        Iterator<i0> it;
        String str = "";
        int i10 = 0;
        while (this.f14228b.iterator().hasNext()) {
            str = "Bid " + i10 + " : " + it.next().toString() + "\n";
            i10++;
        }
        return str;
    }

    public ArrayList<i0> b() {
        return this.f14228b;
    }

    public String toString() {
        return "seat: " + this.f14227a + "\nbid: " + a() + "\n";
    }

    public n2(String str, ArrayList<i0> arrayList) {
        this.f14227a = str;
        this.f14228b = arrayList;
    }
}
