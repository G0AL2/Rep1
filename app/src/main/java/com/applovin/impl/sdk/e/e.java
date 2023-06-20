package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.a.a;
import com.applovin.impl.a.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;

/* loaded from: classes.dex */
class e extends c {

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.a.a f8371c;

    public e(com.applovin.impl.a.a aVar, com.applovin.impl.sdk.m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, mVar, appLovinAdLoadListener);
        this.f8371c = aVar;
    }

    private void j() {
        String str;
        String str2;
        String str3;
        if (b()) {
            return;
        }
        if (this.f8371c.aQ()) {
            com.applovin.impl.a.d aM = this.f8371c.aM();
            if (aM != null) {
                com.applovin.impl.a.h b10 = aM.b();
                if (b10 != null) {
                    Uri b11 = b10.b();
                    String uri = b11 != null ? b11.toString() : "";
                    String c10 = b10.c();
                    if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(c10)) {
                        if (com.applovin.impl.sdk.v.a()) {
                            c("Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    } else if (b10.a() == h.a.STATIC) {
                        if (com.applovin.impl.sdk.v.a()) {
                            a("Caching static companion ad at " + uri + "...");
                        }
                        Uri c11 = c(uri, Collections.emptyList(), false);
                        if (c11 != null) {
                            b10.a(c11);
                            this.f8371c.a(true);
                            return;
                        } else if (!com.applovin.impl.sdk.v.a()) {
                            return;
                        } else {
                            str2 = "Failed to cache static companion ad";
                        }
                    } else if (b10.a() == h.a.HTML) {
                        if (StringUtils.isValidString(uri)) {
                            if (com.applovin.impl.sdk.v.a()) {
                                a("Begin caching HTML companion ad. Fetching from " + uri + "...");
                            }
                            c10 = f(uri);
                            if (StringUtils.isValidString(c10)) {
                                if (com.applovin.impl.sdk.v.a()) {
                                    str3 = "HTML fetched. Caching HTML now...";
                                    a(str3);
                                }
                                b10.a(a(c10, Collections.emptyList(), this.f8371c));
                            } else if (!com.applovin.impl.sdk.v.a()) {
                                return;
                            } else {
                                str2 = "Unable to load companion ad resources from " + uri;
                            }
                        } else {
                            if (com.applovin.impl.sdk.v.a()) {
                                str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c10;
                                a(str3);
                            }
                            b10.a(a(c10, Collections.emptyList(), this.f8371c));
                        }
                        this.f8371c.a(true);
                        return;
                    } else if (b10.a() != h.a.IFRAME || !com.applovin.impl.sdk.v.a()) {
                        return;
                    } else {
                        str = "Skip caching of iFrame resource...";
                    }
                } else if (!com.applovin.impl.sdk.v.a()) {
                    return;
                } else {
                    str2 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                }
                d(str2);
                return;
            } else if (!com.applovin.impl.sdk.v.a()) {
                return;
            } else {
                str = "No companion ad provided. Skipping...";
            }
        } else if (!com.applovin.impl.sdk.v.a()) {
            return;
        } else {
            str = "Companion ad caching disabled. Skipping...";
        }
        a(str);
    }

    private void k() {
        com.applovin.impl.a.n n10;
        Uri b10;
        if (b()) {
            return;
        }
        if (!this.f8371c.aR()) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Video caching disabled. Skipping...");
            }
        } else if (this.f8371c.m() == null || (n10 = this.f8371c.n()) == null || (b10 = n10.b()) == null) {
        } else {
            Uri a10 = a(b10.toString(), Collections.emptyList(), false);
            if (a10 != null) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("Video file successfully cached into: " + a10);
                }
                n10.a(a10);
            } else if (com.applovin.impl.sdk.v.a()) {
                d("Failed to cache video file: " + n10);
            }
        }
    }

    private void l() {
        String aO;
        String str;
        if (b()) {
            return;
        }
        if (this.f8371c.aP() != null) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Begin caching HTML template. Fetching from " + this.f8371c.aP() + "...");
            }
            aO = a(this.f8371c.aP().toString(), this.f8371c.H());
        } else {
            aO = this.f8371c.aO();
        }
        if (StringUtils.isValidString(aO)) {
            com.applovin.impl.a.a aVar = this.f8371c;
            aVar.a(a(aO, aVar.H(), this.f8371c));
            if (!com.applovin.impl.sdk.v.a()) {
                return;
            }
            str = "Finish caching HTML template " + this.f8371c.aO() + " for ad #" + this.f8371c.getAdIdNumber();
        } else if (!com.applovin.impl.sdk.v.a()) {
            return;
        } else {
            str = "Unable to load HTML template";
        }
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.sdk.e.c
    public void h() {
        this.f8371c.o().e();
        super.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.sdk.e.c
    public void i() {
        this.f8371c.o().c();
        super.i();
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        if (this.f8371c.f()) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Begin caching for VAST streaming ad #" + ((c) this).f8357a.getAdIdNumber() + "...");
            }
            c();
            if (this.f8371c.i()) {
                i();
            }
            a.b g10 = this.f8371c.g();
            a.b bVar = a.b.COMPANION_AD;
            if (g10 == bVar) {
                j();
                l();
            } else {
                k();
            }
            if (!this.f8371c.i()) {
                i();
            }
            if (this.f8371c.g() == bVar) {
                k();
            } else {
                j();
                l();
            }
        } else {
            if (com.applovin.impl.sdk.v.a()) {
                a("Begin caching for VAST ad #" + ((c) this).f8357a.getAdIdNumber() + "...");
            }
            c();
            j();
            k();
            l();
            i();
        }
        if (com.applovin.impl.sdk.v.a()) {
            a("Finished caching VAST ad #" + this.f8371c.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f8371c.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f8371c, this.f8349b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.f8371c, this.f8349b);
        a(this.f8371c);
        this.f8371c.b();
        a();
    }
}
