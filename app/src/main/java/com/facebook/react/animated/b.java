package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AnimatedNode.java */
/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a  reason: collision with root package name */
    List<b> f15235a;

    /* renamed from: b  reason: collision with root package name */
    int f15236b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f15237c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f15238d = -1;

    public final void a(b bVar) {
        if (this.f15235a == null) {
            this.f15235a = new ArrayList(1);
        }
        ((List) f6.a.c(this.f15235a)).add(bVar);
        bVar.b(this);
    }

    public void b(b bVar) {
    }

    public void c(b bVar) {
    }

    public abstract String d();

    public String e() {
        String str;
        Iterator<b> it;
        List<b> list = this.f15235a;
        String str2 = "";
        if (list == null || list.size() <= 0) {
            str = "";
        } else {
            str = "";
            while (this.f15235a.iterator().hasNext()) {
                str = str + " " + it.next().f15238d;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d());
        if (str.length() > 0) {
            str2 = " children: " + str;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void f(b bVar) {
        if (this.f15235a == null) {
            return;
        }
        bVar.c(this);
        this.f15235a.remove(bVar);
    }

    public void g() {
    }
}
