package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.b.c;
import com.iab.omid.library.inmobi.b.f;
import com.iab.omid.library.inmobi.d.e;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f24139a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f24140b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f24141c;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.inmobi.e.a f24143e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f24144f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f24148j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24149k;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f24142d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f24145g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24146h = false;

    /* renamed from: i  reason: collision with root package name */
    private final String f24147i = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f24141c = adSessionConfiguration;
        this.f24140b = adSessionContext;
        c(null);
        this.f24144f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.inmobi.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24144f.a();
        com.iab.omid.library.inmobi.b.a.a().a(this);
        this.f24144f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f24142d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f24139a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f24143e = new com.iab.omid.library.inmobi.e.a(view);
    }

    private void d(View view) {
        Collection<a> b10 = com.iab.omid.library.inmobi.b.a.a().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.d() == view) {
                aVar.f24143e.clear();
            }
        }
    }

    private void j() {
        if (this.f24148j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f24149k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f24142d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24149k = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24146h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f24142d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f24148j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f24149k = true;
    }

    public View d() {
        return this.f24143e.get();
    }

    public boolean e() {
        return this.f24145g && !this.f24146h;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24146h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24145g;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f24146h) {
            return;
        }
        this.f24143e.clear();
        removeAllFriendlyObstructions();
        this.f24146h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.inmobi.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f24144f = null;
    }

    public boolean g() {
        return this.f24146h;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public String getAdSessionId() {
        return this.f24147i;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24144f;
    }

    public boolean h() {
        return this.f24141c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24141c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24146h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24146h) {
            return;
        }
        this.f24142d.clear();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24146h) {
            return;
        }
        b(view);
        c a10 = a(view);
        if (a10 != null) {
            this.f24142d.remove(a10);
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f24145g) {
            return;
        }
        this.f24145g = true;
        com.iab.omid.library.inmobi.b.a.a().b(this);
        this.f24144f.a(f.a().d());
        this.f24144f.a(this, this.f24140b);
    }
}
