package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ParseAdResponseWorker.java */
/* loaded from: classes3.dex */
public final class ar extends as<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ad> f24590a;

    /* renamed from: b  reason: collision with root package name */
    private final au f24591b;

    /* renamed from: c  reason: collision with root package name */
    private final bb f24592c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24593d;

    /* renamed from: e  reason: collision with root package name */
    private InMobiAdRequestStatus f24594e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(ad adVar, au auVar, bb bbVar, boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super(adVar, (byte) 1);
        this.f24590a = new WeakReference<>(adVar);
        this.f24591b = auVar;
        this.f24592c = bbVar;
        this.f24593d = z10;
        this.f24594e = inMobiAdRequestStatus;
    }

    @Override // com.inmobi.media.af
    public final void b() {
        super.b();
        this.f24594e = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.inmobi.media.as
    public void a(Boolean bool) {
        ad adVar = this.f24590a.get();
        if (adVar != null) {
            if (this.f24593d) {
                adVar.b(bool.booleanValue(), this.f24594e);
            } else {
                adVar.a(bool.booleanValue(), this.f24594e);
            }
        }
    }

    @Override // com.inmobi.media.af
    public final void a() {
        ad adVar = this.f24590a.get();
        if (adVar == null) {
            b(Boolean.FALSE);
        } else if (this.f24592c.d()) {
            LinkedList<au> b10 = this.f24592c.b();
            if (adVar.a(b10.getFirst(), 0)) {
                ListIterator<au> listIterator = b10.listIterator(1);
                while (listIterator.hasNext()) {
                    au next = listIterator.next();
                    if (!adVar.a(next, b10.indexOf(next))) {
                        listIterator.remove();
                    }
                }
                b(Boolean.TRUE);
                return;
            }
            b(Boolean.FALSE);
        } else {
            b(Boolean.valueOf(adVar.a(this.f24591b, 0)));
        }
    }
}
