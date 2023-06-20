package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.b.c;
import com.iab.omid.library.ironsrc.b.f;
import com.iab.omid.library.ironsrc.d.e;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f24252a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f24253b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f24254c;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.e.a f24256e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f24257f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f24261j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24262k;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f24255d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f24258g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24259h = false;

    /* renamed from: i  reason: collision with root package name */
    private String f24260i = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f24254c = adSessionConfiguration;
        this.f24253b = adSessionContext;
        c(null);
        this.f24257f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24257f.a();
        com.iab.omid.library.ironsrc.b.a.a().a(this);
        this.f24257f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f24255d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f24252a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    private void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f24256e = new com.iab.omid.library.ironsrc.e.a(view);
    }

    private void d(View view) {
        Collection<a> b10 = com.iab.omid.library.ironsrc.b.a.a().b();
        if (b10 == null || b10.size() <= 0) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.d() == view) {
                aVar.f24256e.clear();
            }
        }
    }

    private void j() {
        if (this.f24261j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f24262k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f24255d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24262k = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24259h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f24255d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f24261j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f24262k = true;
    }

    public View d() {
        return this.f24256e.get();
    }

    public boolean e() {
        return this.f24258g && !this.f24259h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24259h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24258g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f24259h) {
            return;
        }
        this.f24256e.clear();
        removeAllFriendlyObstructions();
        this.f24259h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.ironsrc.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f24257f = null;
    }

    public boolean g() {
        return this.f24259h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f24260i;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24257f;
    }

    public boolean h() {
        return this.f24254c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24254c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24259h) {
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

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24259h) {
            return;
        }
        this.f24255d.clear();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24259h) {
            return;
        }
        b(view);
        c a10 = a(view);
        if (a10 != null) {
            this.f24255d.remove(a10);
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f24258g) {
            return;
        }
        this.f24258g = true;
        com.iab.omid.library.ironsrc.b.a.a().b(this);
        this.f24257f.a(f.a().d());
        this.f24257f.a(this, this.f24253b);
    }
}
