package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.k;
import com.fyber.inneractive.sdk.config.global.l;
import com.fyber.inneractive.sdk.config.global.q;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.flow.e;
import com.fyber.inneractive.sdk.flow.f;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b implements u<com.fyber.inneractive.sdk.response.e> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.a f16781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f16782b;

    public b(e eVar, e.a aVar) {
        this.f16782b = eVar;
        this.f16781a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(com.fyber.inneractive.sdk.response.e eVar, Exception exc, boolean z10) {
        int a10;
        q a11;
        com.fyber.inneractive.sdk.config.global.b bVar;
        k kVar;
        l lVar;
        q a12;
        com.fyber.inneractive.sdk.response.e eVar2 = eVar;
        com.fyber.inneractive.sdk.response.e eVar3 = null;
        if (exc == null) {
            e.a aVar = this.f16781a;
            if (aVar != null) {
                m.a aVar2 = (m.a) aVar;
                s sVar = new s();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = aVar2.f17270a.f16785a;
                if (admParametersOuterClass$AdmParameters != null) {
                    List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
                    com.fyber.inneractive.sdk.config.global.a aVar3 = IAConfigManager.J.f16890z;
                    aVar3.getClass();
                    for (com.fyber.inneractive.sdk.config.global.features.e eVar4 : sVar.f16982c.values()) {
                        if (eVar4 != null && (lVar = aVar3.f16938a) != null && (a12 = lVar.a(eVar4.f16952b)) != null) {
                            eVar4.f16977a = a12.f16977a;
                        }
                    }
                    if (abExperimentsList != null && abExperimentsList.size() > 0) {
                        com.fyber.inneractive.sdk.config.global.a aVar4 = IAConfigManager.J.f16890z;
                        aVar4.f16939b = sVar;
                        for (com.fyber.inneractive.sdk.config.global.features.e eVar5 : sVar.f16982c.values()) {
                            for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                                String identifier = experiment.getIdentifier();
                                String variant = experiment.getVariant();
                                l lVar2 = aVar4.f16938a;
                                if (lVar2 != null && (a11 = lVar2.a(eVar5.f16952b)) != null && (bVar = a11.f16979c.get(identifier)) != null) {
                                    Iterator<k> it = bVar.f16942c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            kVar = null;
                                            break;
                                        }
                                        kVar = it.next();
                                        if (kVar.f16973b.equals(variant)) {
                                            break;
                                        }
                                    }
                                    eVar5.f16953c.add(bVar);
                                    if (kVar != null) {
                                        eVar5.f16954d.put(bVar.f16940a, kVar);
                                    }
                                }
                            }
                        }
                    }
                }
                m mVar = m.this;
                f fVar = mVar.f17269l;
                String str = mVar.f17258a;
                e.b bVar2 = mVar.f17261d;
                fVar.f17207e = null;
                fVar.f17206d = bVar2;
                if (IAConfigManager.g()) {
                    fVar.f17208f = sVar;
                    n nVar = new n(fVar.f17207e, str, sVar, fVar);
                    fVar.f17209g = nVar;
                    nVar.a(eVar2);
                    return;
                }
                IAConfigManager.addListener(fVar);
                IAConfigManager.a();
            }
        } else if (this.f16781a != null) {
            e eVar6 = this.f16782b;
            try {
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = eVar6.f16785a;
                if (admParametersOuterClass$AdmParameters2 != null) {
                    a10 = admParametersOuterClass$AdmParameters2.getAdType().a();
                } else {
                    a10 = AdmParametersOuterClass$AdmParameters.a.UNRECOGNIZED.a();
                }
                com.fyber.inneractive.sdk.response.a a13 = com.fyber.inneractive.sdk.response.a.a(a10);
                if (a13 == null) {
                    a13 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
                }
                com.fyber.inneractive.sdk.response.b a14 = b.a.f17184a.a(a13);
                if (a14 != null) {
                    a14.a((com.fyber.inneractive.sdk.network.m) null);
                    eVar6.a(a14);
                    eVar3 = a14.f20150a;
                } else {
                    IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(a10));
                }
            } catch (Exception e10) {
                IAlog.a("failed parse adm network request with no input stream", e10, new Object[0]);
            }
            ((m.a) this.f16781a).a(exc, InneractiveErrorCode.CONNECTION_ERROR, eVar3);
        }
    }
}
