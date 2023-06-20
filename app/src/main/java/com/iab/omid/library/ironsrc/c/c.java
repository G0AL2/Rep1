package com.iab.omid.library.ironsrc.c;

import android.view.View;
import com.iab.omid.library.ironsrc.c.a;
import com.iab.omid.library.ironsrc.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24301a;

    public c(a aVar) {
        this.f24301a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.ironsrc.b.a a10 = com.iab.omid.library.ironsrc.b.a.a();
        if (a10 != null) {
            Collection<com.iab.omid.library.ironsrc.adsession.a> c10 = a10.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c10.size() * 2) + 3);
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c10) {
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

    @Override // com.iab.omid.library.ironsrc.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.ironsrc.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.ironsrc.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0324a interfaceC0324a, boolean z10) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0324a.a(it.next(), this.f24301a, jSONObject);
        }
    }
}
