package com.iab.omid.library.inmobi.c;

import android.view.View;
import com.iab.omid.library.inmobi.c.a;
import com.iab.omid.library.inmobi.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24187a;

    public c(a aVar) {
        this.f24187a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.inmobi.b.a a10 = com.iab.omid.library.inmobi.b.a.a();
        if (a10 != null) {
            Collection<com.iab.omid.library.inmobi.adsession.a> c10 = a10.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c10.size() * 2) + 3);
            for (com.iab.omid.library.inmobi.adsession.a aVar : c10) {
                View d10 = aVar.d();
                if (d10 != null && f.c(d10) && (rootView = d10.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a11 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a11) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.inmobi.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.inmobi.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.inmobi.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0321a interfaceC0321a, boolean z10) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0321a.a(it.next(), this.f24187a, jSONObject);
        }
    }
}
