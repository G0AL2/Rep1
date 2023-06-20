package com.ironsource.b;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private c f26077a;

    /* renamed from: b  reason: collision with root package name */
    private String f26078b;

    /* renamed from: c  reason: collision with root package name */
    private String f26079c;

    public b(c cVar, String str, String str2, ArrayList<com.ironsource.mediationsdk.a.c> arrayList) {
        this.f26077a = cVar;
        this.f26078b = str;
        this.f26079c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            com.ironsource.d.c a10 = com.ironsource.d.b.a(this.f26079c, this.f26078b, arrayList);
            if (a10 != null) {
                int i10 = a10.f26096a;
                if (i10 == 200 || i10 == 204) {
                    z10 = true;
                }
            }
        } catch (Exception unused) {
        }
        c cVar = this.f26077a;
        if (cVar != null) {
            cVar.a(null, z10);
        }
    }
}
