package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public String f17406a;

    /* renamed from: d  reason: collision with root package name */
    public List<com.fyber.inneractive.sdk.measurement.i> f17409d = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<String> f17407b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<j> f17408c = new ArrayList();

    public final void a(Node node) {
        com.fyber.inneractive.sdk.measurement.i iVar;
        Node d10 = x0.d(node, "AdVerifications");
        if (d10 != null) {
            Iterator it = ((ArrayList) x0.c(d10, "Verification")).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    iVar = null;
                } else {
                    com.fyber.inneractive.sdk.measurement.i iVar2 = new com.fyber.inneractive.sdk.measurement.i();
                    iVar2.f17351e = x0.b(node2, "vendor");
                    Node d11 = x0.d(node2, "JavaScriptResource");
                    if (d11 != null) {
                        iVar2.f17353g = true;
                        try {
                            iVar2.f17352f = x0.a(d11);
                            iVar2.f17348b = x0.b(d11, "apiFramework");
                            iVar2.f17347a = new URL(iVar2.f17352f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d12 = x0.d(node2, "TrackingEvents");
                    if (d12 != null) {
                        Iterator it2 = ((ArrayList) x0.c(d12, "Tracking")).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            p a10 = p.a(node3);
                            if (node3 != null && a10.f17453a.equalsIgnoreCase("verificationNotExecuted")) {
                                iVar2.a(q.EVENT_VERIFICATION_NOT_EXECUTED, a10.f17454b);
                            }
                        }
                    }
                    Node d13 = x0.d(node2, "VerificationParameters");
                    if (d13 != null) {
                        iVar2.f17350d = x0.a(d13);
                    }
                    iVar = iVar2;
                }
                if (iVar != null) {
                    IAlog.a("Verification Found - %s", iVar.toString());
                    this.f17409d.add(iVar);
                }
            }
        }
    }

    public void b(Node node) {
        Iterator it;
        j jVar;
        f fVar;
        Iterator it2;
        m mVar;
        Iterator it3;
        if (node == null) {
            return;
        }
        Node d10 = x0.d(node, "AdSystem");
        if (d10 != null) {
            x0.b(d10, MediationMetaData.KEY_VERSION);
            x0.a(d10);
        }
        Node d11 = x0.d(node, "Error");
        if (d11 != null) {
            String a10 = x0.a(d11);
            if (!TextUtils.isEmpty(a10)) {
                this.f17406a = a10;
            }
        }
        Iterator it4 = ((ArrayList) x0.c(node, "Impression")).iterator();
        while (it4.hasNext()) {
            String a11 = x0.a((Node) it4.next());
            if (!TextUtils.isEmpty(a11)) {
                this.f17407b.add(a11);
            }
        }
        Node d12 = x0.d(node, "Creatives");
        if (d12 != null) {
            Iterator it5 = ((ArrayList) x0.c(d12, "Creative")).iterator();
            while (it5.hasNext()) {
                Node node2 = (Node) it5.next();
                if (node2 == null) {
                    it = it5;
                    jVar = null;
                } else {
                    j jVar2 = new j();
                    x0.b(node2, "AdID");
                    x0.b(node2, "id");
                    x0.a(node2, "sequence");
                    Node d13 = x0.d(node2, "Linear");
                    if (d13 != null) {
                        l lVar = new l();
                        Node d14 = x0.d(d13, "MediaFiles");
                        if (d14 != null) {
                            ArrayList arrayList = (ArrayList) x0.c(d14, "MediaFile");
                            if (!arrayList.isEmpty()) {
                                lVar.f17432a = new ArrayList();
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    Node node3 = (Node) it6.next();
                                    if (node3 == null) {
                                        it2 = it5;
                                        it3 = it6;
                                        mVar = null;
                                    } else {
                                        it2 = it5;
                                        mVar = new m();
                                        it3 = it6;
                                        mVar.f17437a = x0.b(node3, "delivery");
                                        mVar.f17438b = x0.a(node3, "width");
                                        mVar.f17439c = x0.a(node3, "height");
                                        mVar.f17440d = x0.b(node3, "type");
                                        x0.b(node3, "id");
                                        mVar.f17442f = x0.b(node3, "apiFramework");
                                        mVar.f17441e = x0.a(node3, "bitrate");
                                        String b10 = x0.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(b10)) {
                                            try {
                                                Boolean.valueOf(b10);
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                        String b11 = x0.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(b11)) {
                                            try {
                                                Boolean.valueOf(b11);
                                            } catch (NumberFormatException unused2) {
                                            }
                                        }
                                        mVar.f17443g = x0.a(node3);
                                    }
                                    if (mVar != null) {
                                        lVar.f17432a.add(mVar);
                                    }
                                    it5 = it2;
                                    it6 = it3;
                                }
                            }
                        }
                        it = it5;
                        Node d15 = x0.d(d13, "VideoClicks");
                        if (d15 != null) {
                            lVar.f17434c = x0.a(x0.d(d15, "ClickThrough"));
                            ArrayList arrayList2 = (ArrayList) x0.c(d15, "ClickTracking");
                            if (!arrayList2.isEmpty()) {
                                lVar.f17435d = new ArrayList();
                                Iterator it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    String a12 = x0.a((Node) it7.next());
                                    if (!TextUtils.isEmpty(a12)) {
                                        lVar.f17435d.add(a12);
                                    }
                                }
                            }
                        }
                        Node d16 = x0.d(d13, "TrackingEvents");
                        if (d16 != null) {
                            ArrayList arrayList3 = (ArrayList) x0.c(d16, "Tracking");
                            if (!arrayList3.isEmpty()) {
                                lVar.f17433b = new ArrayList();
                                Iterator it8 = arrayList3.iterator();
                                while (it8.hasNext()) {
                                    p a13 = p.a((Node) it8.next());
                                    if (a13 != null) {
                                        lVar.f17433b.add(a13);
                                    }
                                }
                            }
                        }
                        Node d17 = x0.d(d13, "Duration");
                        if (d17 != null) {
                            lVar.f17436e = x0.a(d17);
                        }
                        jVar2.f17430a = lVar;
                    } else {
                        it = it5;
                    }
                    Node d18 = x0.d(node2, "CompanionAds");
                    if (d18 != null) {
                        List<Node> c10 = x0.c(d18, "Companion");
                        jVar2.f17431b = new ArrayList();
                        Iterator it9 = ((ArrayList) c10).iterator();
                        while (it9.hasNext()) {
                            Node node4 = (Node) it9.next();
                            if (node4 == null) {
                                fVar = null;
                            } else {
                                fVar = new f();
                                fVar.f17410a = x0.a(node4, "width");
                                fVar.f17411b = x0.a(node4, "height");
                                fVar.f17412c = x0.b(node4, "id");
                                x0.b(node4, "apiFramework");
                                x0.a(node4, "expandedWidth");
                                x0.a(node4, "expandedHeight");
                                Node d19 = x0.d(node4, "StaticResource");
                                if (d19 != null) {
                                    i iVar = new i();
                                    iVar.f17428a = x0.b(d19, "creativeType");
                                    iVar.f17429b = x0.a(d19);
                                    fVar.f17413d = iVar;
                                }
                                Node d20 = x0.d(node4, "HTMLResource");
                                if (d20 != null) {
                                    fVar.f17415f = x0.a(d20);
                                }
                                Node d21 = x0.d(node4, "IFrameResource");
                                if (d21 != null) {
                                    fVar.f17414e = x0.a(d21);
                                }
                                Node d22 = x0.d(node4, "CompanionClickThrough");
                                if (d22 != null) {
                                    fVar.f17416g = x0.a(d22);
                                }
                                ArrayList arrayList4 = (ArrayList) x0.c(node4, "CompanionClickTracking");
                                if (arrayList4.size() > 0) {
                                    fVar.f17417h = new ArrayList();
                                    Iterator it10 = arrayList4.iterator();
                                    while (it10.hasNext()) {
                                        String a14 = x0.a((Node) it10.next());
                                        if (!TextUtils.isEmpty(a14)) {
                                            fVar.f17417h.add(a14);
                                        }
                                    }
                                }
                                Node d23 = x0.d(node4, "TrackingEvents");
                                if (d23 != null) {
                                    ArrayList arrayList5 = (ArrayList) x0.c(d23, "Tracking");
                                    if (!arrayList5.isEmpty()) {
                                        fVar.f17419j = new ArrayList();
                                        Iterator it11 = arrayList5.iterator();
                                        while (it11.hasNext()) {
                                            p a15 = p.a((Node) it11.next());
                                            if (a15 != null) {
                                                fVar.f17419j.add(a15);
                                            }
                                        }
                                    }
                                }
                            }
                            if (fVar != null) {
                                jVar2.f17431b.add(fVar);
                            }
                        }
                    }
                    jVar = jVar2;
                }
                if (jVar != null) {
                    this.f17408c.add(jVar);
                }
                it5 = it;
            }
        }
        Node d24 = x0.d(node, "Extensions");
        if (d24 != null) {
            Iterator it12 = ((ArrayList) x0.c(d24, "Extension")).iterator();
            while (it12.hasNext()) {
                Node node5 = (Node) it12.next();
                if ("AdVerifications".equalsIgnoreCase(x0.b(node5, "type"))) {
                    a(node5);
                }
            }
        }
        a(node);
    }
}
