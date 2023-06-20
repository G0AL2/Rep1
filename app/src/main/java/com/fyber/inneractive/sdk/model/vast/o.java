package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public String f17451a;

    /* renamed from: b  reason: collision with root package name */
    public List<d> f17452b;

    public static o a(Node node) {
        d dVar;
        o oVar = new o();
        oVar.f17451a = x0.b(node, MediationMetaData.KEY_VERSION);
        ArrayList arrayList = (ArrayList) x0.c(node, "Ad");
        if (!arrayList.isEmpty()) {
            oVar.f17452b = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    dVar = null;
                } else {
                    d dVar2 = new d();
                    dVar2.f17403a = x0.b(node2, "id");
                    Node d10 = x0.d(node2, "Wrapper");
                    if (d10 != null) {
                        dVar2.f17404b = s.c(d10);
                    }
                    Node d11 = x0.d(node2, "InLine");
                    if (d11 != null) {
                        dVar2.f17405c = k.c(d11);
                    }
                    dVar = dVar2;
                }
                oVar.f17452b.add(dVar);
            }
        }
        return oVar;
    }

    public String toString() {
        return new StringBuilder("Vast: version - " + this.f17451a + "\nAds: ").toString();
    }
}
