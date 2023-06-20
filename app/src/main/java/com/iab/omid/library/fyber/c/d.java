package com.iab.omid.library.fyber.c;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.fyber.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f24072a = new int[2];

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0318a interfaceC0318a, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            interfaceC0318a.a(viewGroup.getChildAt(i10), this, jSONObject, z10);
        }
    }

    @TargetApi(21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0318a interfaceC0318a, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0318a.a((View) it2.next(), this, jSONObject, z10);
            }
        }
    }

    @Override // com.iab.omid.library.fyber.c.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.fyber.d.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f24072a);
        int[] iArr = this.f24072a;
        return com.iab.omid.library.fyber.d.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.fyber.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0318a interfaceC0318a, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10 || Build.VERSION.SDK_INT < 21) {
                a(viewGroup, jSONObject, interfaceC0318a, z11);
            } else {
                b(viewGroup, jSONObject, interfaceC0318a, z11);
            }
        }
    }
}
