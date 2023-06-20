package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ad;

/* compiled from: InterstitialAdUnit.java */
/* loaded from: classes3.dex */
public class al extends ad {

    /* renamed from: x  reason: collision with root package name */
    private static final String f24545x = "al";

    /* renamed from: y  reason: collision with root package name */
    private int f24546y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f24547z;

    public al(Context context, ba baVar, ad.a aVar) {
        super(context, baVar, aVar);
        this.f24546y = 0;
        this.f24547z = false;
        baVar.e();
        a(context, baVar, aVar);
        b("activity");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean aa() {
        /*
            r9 = this;
            boolean r0 = r9.x()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r0.<init>(r3)
            r3 = 39
            r9.a(r0, r2, r3)
            return r1
        L15:
            com.inmobi.media.ad$a r0 = r9.p()
            if (r0 != 0) goto L1c
            return r1
        L1c:
            byte r3 = r9.j()
            r4 = 53
            java.lang.String r5 = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: "
            r6 = 2
            java.lang.String r7 = "InMobiInterstitial"
            if (r3 == r2) goto L95
            if (r3 == r6) goto L5d
            r4 = 6
            if (r3 == r4) goto L34
            r4 = 7
            if (r3 == r4) goto L34
            r0 = 0
            goto Lb0
        L34:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: "
            r3.<init>(r4)
            com.inmobi.media.ba r4 = r9.i()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.hu.a(r2, r7, r3)
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE
            r3.<init>(r4)
            r4 = 15
            r9.a(r4)
            r0.a(r9, r3)
            goto Laf
        L5d:
            java.lang.String r3 = r9.n()
            java.lang.String r8 = "html"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L7a
            java.lang.String r3 = r9.n()
            java.lang.String r8 = "htmlUrl"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L76
            goto L7a
        L76:
            r9.b(r0)
            goto Laf
        L7a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.inmobi.media.ba r3 = r9.i()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.hu.a(r2, r7, r0)
            r9.b(r4)
            goto Laf
        L95:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.inmobi.media.ba r3 = r9.i()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.hu.a(r2, r7, r0)
            r9.b(r4)
        Laf:
            r0 = 1
        Lb0:
            if (r0 == 0) goto Lb3
            return r1
        Lb3:
            r0 = 4
            byte r3 = r9.j()
            if (r0 != r3) goto Ld7
            boolean r0 = r9.q()
            if (r0 == 0) goto Lc4
            r9.D()
            goto Ld7
        Lc4:
            com.inmobi.media.ad$a r0 = r9.p()
            if (r0 != 0) goto Ld0
            java.lang.String r0 = "Listener was garbage collected. Unable to give callback"
            com.inmobi.media.hu.a(r6, r7, r0)
            goto Ld6
        Ld0:
            r9.b(r0)
            r9.c(r0)
        Ld6:
            return r1
        Ld7:
            r9.f24462l = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.al.aa():boolean");
    }

    private void ab() {
        if (j() == 2) {
            f((byte) 2);
            this.f24452b = (byte) 3;
            hu.a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + i().toString());
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    private void ac() {
        hu.a((byte) 2, "InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + i().toString());
        B();
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            j s10 = s();
            if (s10 != null && !DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(s10.getMarkupType())) {
                int a10 = InMobiAdActivity.a(s10);
                Intent intent = new Intent(context, InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a10);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                if (n().equals("htmlUrl")) {
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 202);
                } else if (n().equals("html")) {
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                } else {
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 201);
                }
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                if (this.f24472v) {
                    if (this.f24470t == -1) {
                        this.f24470t = System.currentTimeMillis();
                    }
                    if (this.f24469s > 0) {
                        intent.setFlags(603979776);
                    }
                }
                ho.a(context, intent);
                return true;
            }
            return false;
        } catch (Exception e10) {
            hu.a((byte) 1, "InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            gg.a().a(new hg(e10));
            return false;
        }
    }

    @Override // com.inmobi.media.ad
    public void D() {
        super.D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void F() {
        super.F();
        this.f24546y = 0;
    }

    @Override // com.inmobi.media.ad
    protected final void G() {
        if (2 == j()) {
            f((byte) 2);
            this.f24452b = (byte) 3;
            hu.a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + i().toString());
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    @Override // com.inmobi.media.ad
    public boolean H() {
        return 2 == j();
    }

    @Override // com.inmobi.media.ad
    final void P() {
        I();
        this.f24452b = (byte) 4;
        ad.a p10 = p();
        if (p10 == null || !p10.g()) {
            return;
        }
        c(p10);
    }

    @Override // com.inmobi.media.ad
    final void Q() {
        ad.a p10 = p();
        if (p10 != null) {
            b(p10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r2 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r2 == 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    @Override // com.inmobi.media.ad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S() {
        /*
            r6 = this;
            r6.F()
            r0 = 1
            boolean r1 = r6.R()     // Catch: java.lang.IllegalStateException -> L5a
            if (r1 == 0) goto Lb
            return
        Lb:
            r6.T()     // Catch: java.lang.IllegalStateException -> L5a
            java.lang.String r1 = r6.n()     // Catch: java.lang.IllegalStateException -> L5a
            r2 = -1
            int r3 = r1.hashCode()     // Catch: java.lang.IllegalStateException -> L5a
            r4 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            r5 = 2
            if (r3 == r4) goto L3c
            r4 = 3213227(0x3107ab, float:4.50269E-39)
            if (r3 == r4) goto L32
            r4 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r3 == r4) goto L28
            goto L45
        L28:
            java.lang.String r3 = "htmlUrl"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L5a
            if (r1 == 0) goto L45
            r2 = 1
            goto L45
        L32:
            java.lang.String r3 = "html"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L5a
            if (r1 == 0) goto L45
            r2 = 0
            goto L45
        L3c:
            java.lang.String r3 = "inmobiJson"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L5a
            if (r1 == 0) goto L45
            r2 = 2
        L45:
            if (r2 == 0) goto L4f
            if (r2 == r0) goto L4f
            if (r2 == r5) goto L4e
            r6.n()     // Catch: java.lang.IllegalStateException -> L5a
        L4e:
            return
        L4f:
            android.os.Handler r1 = r6.f24459i     // Catch: java.lang.IllegalStateException -> L5a
            com.inmobi.media.al$1 r2 = new com.inmobi.media.al$1     // Catch: java.lang.IllegalStateException -> L5a
            r2.<init>()     // Catch: java.lang.IllegalStateException -> L5a
            r1.post(r2)     // Catch: java.lang.IllegalStateException -> L5a
            return
        L5a:
            com.inmobi.ads.InMobiAdRequestStatus r1 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r2 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r1.<init>(r2)
            r2 = 48
            r6.a(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.al.S():void");
    }

    public boolean Y() {
        return j() == 4;
    }

    public void Z() {
        j s10 = s();
        if (s10 == null) {
            return;
        }
        this.f24547z = true;
        s10.a();
    }

    @Override // com.inmobi.media.k
    public void a(int i10, q qVar) {
    }

    @Override // com.inmobi.media.s
    public synchronized void a_(q qVar) {
        super.a_(qVar);
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.al.2
            @Override // java.lang.Runnable
            public final void run() {
                al alVar = al.this;
                alVar.f(alVar.p());
            }
        });
    }

    @Override // com.inmobi.media.s
    public synchronized void b_(q qVar) {
        super.b_(qVar);
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.al.3
            @Override // java.lang.Runnable
            public final void run() {
                al alVar = al.this;
                alVar.g(alVar.p());
            }
        });
    }

    @Override // com.inmobi.media.ad
    final void f(ad.a aVar) {
        if (j() == 6) {
            int i10 = this.f24546y + 1;
            this.f24546y = i10;
            if (i10 == 1) {
                hu.a((byte) 2, "InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + i().toString());
                if (aVar != null) {
                    if ((n().equals("html") || n().equals("htmlUrl")) && !U()) {
                        f();
                    }
                    d(aVar);
                    return;
                }
                return;
            }
            this.f24452b = (byte) 7;
        } else if (j() == 7) {
            this.f24546y++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void g(ad.a aVar) {
        if (j() == 7) {
            int i10 = this.f24546y - 1;
            this.f24546y = i10;
            if (i10 == 1) {
                this.f24452b = (byte) 6;
            }
        } else if (j() == 6) {
            this.f24546y--;
            hu.a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + i().toString());
            if (aVar != null) {
                aVar.c();
            } else {
                hu.a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    public void h(ad.a aVar) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (byte) 44);
            hu.a((byte) 1, "InMobiInterstitial", "Please ensure that you call show() on the UI thread");
        } else if (aVar == null) {
            hu.a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!Y()) {
            hu.a((byte) 1, f24545x, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(aVar, (byte) 50);
        } else {
            a(aVar);
            this.f24452b = (byte) 6;
            if (!"html".equals(n()) && !"htmlUrl".equals(n())) {
                this.f24473w.a(hashCode(), new ak(this, aVar));
            } else if (q()) {
                b(aVar, (byte) 36);
                j s10 = s();
                if (s10 != null) {
                    s10.destroy();
                }
            } else {
                i(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(ad.a aVar) {
        boolean b10 = b(h());
        if (aVar == null) {
            hu.a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!b10) {
            this.f24452b = (byte) 3;
            a(aVar, (byte) 51);
        } else {
            aVar.b();
        }
    }

    @Override // com.inmobi.media.ad
    public void j(q qVar) {
        super.j(qVar);
        if (this.f24472v) {
            int indexOf = this.f24454d.indexOf(qVar);
            if (indexOf < this.f24469s) {
                return;
            }
            this.f24471u.add(Integer.valueOf(indexOf));
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= indexOf) {
                    z10 = true;
                    break;
                } else if (this.f24454d.get(i10) != null) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10 && j() == 2) {
                f((byte) 2);
                this.f24469s = indexOf;
                ac();
            }
        } else if (j() == 2) {
            f((byte) 2);
            ac();
        }
    }

    @Override // com.inmobi.media.ad
    public String k() {
        return "int";
    }

    @Override // com.inmobi.media.ad
    public void k(q qVar) {
        super.k(qVar);
        if (this.f24472v) {
            int indexOf = this.f24454d.indexOf(qVar);
            d(indexOf);
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = true;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f24454d.size()) {
                    z10 = z11;
                    i10 = -1;
                    break;
                }
                if (i10 != indexOf && this.f24454d.get(i10) != null) {
                    if (this.f24471u.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    z11 = false;
                    z12 = false;
                }
                i10++;
            }
            if (i10 == -1) {
                if (z10) {
                    ab();
                    return;
                }
                return;
            } else if (z12 && j() == 2) {
                f((byte) 2);
                this.f24469s = i10;
                ac();
                return;
            } else {
                return;
            }
        }
        ab();
    }

    @Override // com.inmobi.media.ad
    protected final byte l() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.ad
    public q t() {
        q t10 = super.t();
        if (this.f24547z && t10 != null) {
            t10.a();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final Integer w() {
        return Integer.valueOf(this.f24453c.minimumRefreshInterval);
    }

    @Override // com.inmobi.media.ad
    public void y() {
        if (aa()) {
            super.y();
        }
    }

    @Override // com.inmobi.media.ad
    public void a(byte[] bArr) {
        if (aa()) {
            super.a(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void a(boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.a(z10, inMobiAdRequestStatus);
        if (j() == 2) {
            hu.a((byte) 2, "InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + i().toString());
            Q();
        }
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.dr
    public void a(au auVar, boolean z10, byte b10) {
        if (!z10) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, b10);
            return;
        }
        try {
            super.a(auVar, z10, b10);
        } catch (IllegalStateException unused) {
        }
        au u10 = u();
        if (u10 == null) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 55);
        } else if (u10.d()) {
            this.f24460j = true;
            N();
        } else {
            a(u10);
        }
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.s
    public void g() {
        Activity fullScreenActivity;
        super.g();
        j s10 = s();
        if (!(s10 instanceof q) || (fullScreenActivity = ((q) s10).getFullScreenActivity()) == null) {
            return;
        }
        this.f24467q = true;
        fullScreenActivity.finish();
    }

    @Override // com.inmobi.media.ad
    public void a(ba baVar, boolean z10) {
        super.a(baVar, z10);
        if (!z10) {
            if (i().equals(baVar)) {
                if (2 == j() || 4 == j()) {
                    this.f24452b = (byte) 0;
                    a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (byte) 0);
                }
            }
        } else if (i().equals(baVar) && 2 == j()) {
            if (this.f24460j) {
                this.f24461k = true;
                O();
                return;
            }
            P();
        }
    }

    @Override // com.inmobi.media.ad
    public void b(String str) {
        super.b("activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ad.a aVar, byte b10) {
        this.f24452b = (byte) 0;
        if (aVar != null) {
            a(aVar, b10);
        } else {
            hu.a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.k
    public boolean b(q qVar) {
        if (this.f24472v) {
            if (this.f24471u.higher(Integer.valueOf(this.f24454d.indexOf(qVar))) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (this.f24472v) {
            if (j() == 2) {
                if (this.f24471u.isEmpty()) {
                    X();
                } else {
                    f((byte) 2);
                    this.f24471u.first();
                    this.f24469s = this.f24471u.first().intValue();
                    ac();
                    for (int i10 = 0; i10 < this.f24454d.size(); i10++) {
                        if (!this.f24471u.contains(Integer.valueOf(i10))) {
                            d(i10);
                        }
                    }
                    return;
                }
            } else {
                X();
                return;
            }
        }
        super.a(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.k
    public void b() {
        if (this.f24472v) {
            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.al.5
                @Override // java.lang.Runnable
                public final void run() {
                    al.this.E();
                    hu.a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + al.this.i().toString());
                    if (al.this.p() != null) {
                        al.this.p().c();
                    } else {
                        hu.a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                }
            });
        }
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.k
    public void a(int i10, final q qVar, final Context context) {
        if (this.f24472v) {
            if (!this.f24471u.contains(Integer.valueOf(i10)) || i10 <= this.f24454d.indexOf(qVar) || i10 >= this.f24454d.size() || this.f24454d.get(i10) == null || !this.f24454d.get(i10).f25973w) {
                a(this.f24454d.indexOf(qVar), false);
                return;
            }
            if (context == null) {
                context = h();
            }
            super.a(i10, qVar, context);
            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.al.4
                @Override // java.lang.Runnable
                public final void run() {
                    final int indexOf = al.this.f24454d.indexOf(qVar);
                    if (indexOf < 0 || indexOf >= al.this.f24454d.size()) {
                        return;
                    }
                    boolean b10 = al.this.b(context);
                    if (!b10) {
                        al.this.e(indexOf);
                    }
                    al.this.a(indexOf, b10);
                    al.this.f24459i.post(new Runnable() { // from class: com.inmobi.media.al.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            al.this.d(indexOf);
                        }
                    });
                }
            });
        }
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.k
    public void a(q qVar, Context context) {
        if (this.f24472v) {
            Integer higher = this.f24471u.higher(Integer.valueOf(this.f24454d.indexOf(qVar)));
            if (higher != null) {
                a(higher.intValue(), qVar, context);
            } else {
                b();
            }
        }
    }
}
