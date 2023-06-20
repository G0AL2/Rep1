package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.List;

/* loaded from: classes.dex */
public class i extends c<com.fyber.inneractive.sdk.response.g, y> implements i.b {

    /* renamed from: h  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.i f17238h;

    public i(String str) {
    }

    @Override // com.fyber.inneractive.sdk.flow.c, com.fyber.inneractive.sdk.interfaces.a
    public void a() {
        this.f17238h.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.c
    public String b() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.c
    public void d() {
        super.d();
    }

    @Override // com.fyber.inneractive.sdk.flow.c
    public void e() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        IAlog.a(IAlog.a(this) + "start called", new Object[0]);
        y yVar = new y(c(), this.f17201f, (com.fyber.inneractive.sdk.response.g) this.f17197b, this.f17196a);
        this.f17198c = yVar;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) this.f17197b;
        com.fyber.inneractive.sdk.player.i iVar = new com.fyber.inneractive.sdk.player.i(gVar, this.f17196a, yVar, this);
        this.f17238h = iVar;
        y yVar2 = (y) this.f17198c;
        yVar2.f17324g = iVar;
        yVar2.f17244f = this.f17202g;
        AdSessionContext adSessionContext = null;
        iVar.f19700e = null;
        if (gVar != null && (bVar2 = gVar.C) != null) {
            iVar.f19700e = bVar2.f17389d.poll();
        }
        if (iVar.f19700e == null) {
            iVar.b();
            i.b bVar3 = iVar.f19699d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
            i iVar2 = (i) bVar3;
            iVar2.a((InneractiveError) inneractiveInfrastructureError);
            iVar2.a(inneractiveInfrastructureError);
            return;
        }
        iVar.e();
        a.InterfaceC0239a interfaceC0239a = iVar.f19701f;
        if (interfaceC0239a != null) {
            com.fyber.inneractive.sdk.player.f fVar = (com.fyber.inneractive.sdk.player.f) interfaceC0239a;
            com.fyber.inneractive.sdk.measurement.a aVar = fVar.f17730h;
            if (aVar != null) {
                com.fyber.inneractive.sdk.measurement.g gVar2 = new com.fyber.inneractive.sdk.measurement.g();
                List<com.fyber.inneractive.sdk.measurement.i> list = fVar.f19689x.f17390e;
                y yVar3 = fVar.f17728f;
                try {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                    Owner owner = Owner.NATIVE;
                    AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                    List<VerificationScriptResource> a10 = gVar2.a(list);
                    if (((com.fyber.inneractive.sdk.measurement.d) aVar).f17331c != null && ((com.fyber.inneractive.sdk.measurement.d) aVar).f17330b != null) {
                        adSessionContext = AdSessionContext.createNativeAdSessionContext(((com.fyber.inneractive.sdk.measurement.d) aVar).f17331c, ((com.fyber.inneractive.sdk.measurement.d) aVar).f17330b, a10, "", "");
                    }
                    AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, adSessionContext);
                    gVar2.f17339a = createAdSession;
                    gVar2.f17340b = AdEvents.createAdEvents(createAdSession);
                    gVar2.f17341c = MediaEvents.createMediaEvents(gVar2.f17339a);
                    gVar2.f17339a.start();
                    gVar2.f17344f = yVar3;
                    fVar.f17731i = gVar2;
                    fVar.f17732j = new com.fyber.inneractive.sdk.player.g(gVar2);
                }
            }
            if (fVar.f17731i == null && (bVar = fVar.f19689x) != null) {
                for (com.fyber.inneractive.sdk.measurement.i iVar3 : bVar.f17390e) {
                    com.fyber.inneractive.sdk.measurement.j jVar = com.fyber.inneractive.sdk.measurement.j.ERROR_DURING_RESOURCE_LOAD;
                    com.fyber.inneractive.sdk.model.vast.q qVar = com.fyber.inneractive.sdk.model.vast.q.EVENT_VERIFICATION_NOT_EXECUTED;
                    com.fyber.inneractive.sdk.player.f.a(new com.fyber.inneractive.sdk.measurement.h(iVar3, iVar3.a(qVar), jVar), qVar);
                }
            }
        }
        iVar.d();
    }
}
