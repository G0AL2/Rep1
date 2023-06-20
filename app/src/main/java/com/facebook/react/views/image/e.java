package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: MultiPostprocessor.java */
/* loaded from: classes.dex */
public class e implements b6.d {

    /* renamed from: a  reason: collision with root package name */
    private final List<b6.d> f16096a;

    private e(List<b6.d> list) {
        this.f16096a = new LinkedList(list);
    }

    public static b6.d d(List<b6.d> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new e(list);
            }
            return list.get(0);
        }
        return null;
    }

    @Override // b6.d
    public c4.a<Bitmap> a(Bitmap bitmap, o5.f fVar) {
        c4.a<Bitmap> aVar = null;
        try {
            c4.a<Bitmap> aVar2 = null;
            for (b6.d dVar : this.f16096a) {
                aVar = dVar.a(aVar2 != null ? aVar2.y() : bitmap, fVar);
                c4.a.w(aVar2);
                aVar2 = aVar.clone();
            }
            return aVar.clone();
        } finally {
            c4.a.w(aVar);
        }
    }

    @Override // b6.d
    public t3.d b() {
        LinkedList linkedList = new LinkedList();
        for (b6.d dVar : this.f16096a) {
            linkedList.push(dVar.b());
        }
        return new t3.f(linkedList);
    }

    @Override // b6.d
    public String getName() {
        StringBuilder sb2 = new StringBuilder();
        for (b6.d dVar : this.f16096a) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(dVar.getName());
        }
        sb2.insert(0, "MultiPostProcessor (");
        sb2.append(")");
        return sb2.toString();
    }
}
